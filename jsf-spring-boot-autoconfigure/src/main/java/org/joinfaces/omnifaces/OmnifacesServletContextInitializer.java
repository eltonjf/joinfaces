/*
 * Copyright 2016-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.joinfaces.omnifaces;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.joinfaces.JsfClassFactory;
import org.joinfaces.JsfClassFactoryConfiguration;

import org.omnifaces.facesviews.FacesViewsInitializer;

import org.springframework.boot.web.servlet.ServletContextInitializer;

/**
 * Servlet context initializer of OmniFaces.
 * @author Marcelo Fernandes
 */
public class OmnifacesServletContextInitializer implements ServletContextInitializer, JsfClassFactoryConfiguration {

	private final OmnifacesProperties omnifacesProperties;

	public OmnifacesServletContextInitializer(OmnifacesProperties omnifacesProperties) {
		this.omnifacesProperties = omnifacesProperties;
	}

	private ServletContainerInitializer servletContainerInitializer;

	@Override
	public ServletContainerInitializer getServletContainerInitializer() {
		if (this.servletContainerInitializer == null) {
			this.servletContainerInitializer = new FacesViewsInitializer();
		}
		return this.servletContainerInitializer;
	}

	@Override
	public String getAnotherFacesConfig() {
		return null;
	}

	@Override
	public boolean isExcludeScopedAnnotations() {
		return true;
	}

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		OmnifacesServletContextConfigurer.builder()
			.omnifacesProperties(this.omnifacesProperties)
			.servletContext(sc)
			.build()
			.configure();

		ServletContainerInitializer servletContainerInitializer = getServletContainerInitializer();
		JsfClassFactory jsfClassFactory = new JsfClassFactory(this);
		servletContainerInitializer.onStartup(jsfClassFactory.getAllClasses(), sc);
	}
}
