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

package org.joinfaces.myfaces;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties of MyFaces.
 * Taken from https://myfaces.apache.org/core22/myfaces-impl/webconfig.html and
 * from
 * http://myfaces.apache.org/core22/myfaces-impl/apidocs/constant-values.html
 * @author Marcelo Fernandes
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "jsf.myfaces")
public class MyfacesProperties {

	/**
	 * Indicate if log all web config params should be done before initialize
	 * the webapp.
	 */
	private String logWebContextParams;

	/**
	 * If value is a String instance and this param is true, pass it directly
	 * without try any change.
	 */
	private Boolean enumConverterAllowStringPasstrough;

	/**
	 * Deprecated: use JSF 2.0 ExceptionHandler.
	 */
	private String errorHandler;

	/**
	 * Controls the size of the cache used to 'remember' if a view exists or
	 * not.
	 */
	private Integer checkedViewidCacheSize;

	/**
	 * Enable or disable a cache used to 'remember' if a view exists or not and
	 * reduce the impact " + "of sucesive calls to
	 * ExternalContext.getResource().
	 */
	private Boolean checkedViewidCacheEnabled;

	/**
	 * If true, rendered HTML code will be formatted, so that it is "human
	 * readable".
	 */
	private Boolean prettyHtml;

	/**
	 * This parameter tells MyFaces if javascript code should be allowed in the
	 * rendered HTML output.
	 */
	private Boolean allowJavascript;

	/**
	 * Set the time in seconds that check for updates of web.
	 */
	private Integer configRefreshPeriod;

	/**
	 * Set the view state using a javascript function instead a hidden input
	 * field.
	 */
	private Boolean viewstateJavascript;

	/**
	 * Define if the input field that should store the state.
	 */
	private Boolean renderViewstateId;

	/**
	 * Use "&amp;" entity instead a plain "&" character within HTML.
	 */
	private Boolean strictXhtmlLinks;

	/**
	 * This param renders the clear javascript on button necessary only for
	 * compatibility with hidden fields feature of myfaces.
	 */
	private Boolean renderClearJavascriptForButton;

	/**
	 * This param renders hidden fields at the end of h:form for link params
	 * when h:commandLink + f:param is used, instead use javascript to create
	 * them.
	 */
	private Boolean renderHiddenFieldsForLinkParams;

	/**
	 * Add a code that save the form before submit using a link.
	 */
	private Boolean saveFormSubmitLinkIe;

	/**
	 * Define an alternate class name that will be used to initialize MyFaces,
	 * instead the default javax.
	 */
	private String delegateFacesServlet;

	/**
	 * Indicate if the facelet associated to the view should be reapplied when
	 * the view is refreshed.
	 */
	private String refreshTransientBuildOnPss;

	/**
	 * Enable or disable a special mode that enable full state for parent
	 * components containing c:if, c:forEach, c:choose and ui:include with
	 * src=ELExpression.
	 */
	private Boolean refreshTransientBuildOnPssPreserveState;

	/**
	 * If set to true, tag library XML files and faces config XML files using
	 * schema will be validated during application start up.
	 */
	private Boolean validateXml;

	/**
	 * Wrap content inside script with xml comment to prevent old browsers to
	 * display it.
	 */
	private Boolean wrapScriptContentWithXmlCommentTag;

	/**
	 * If set true, render the form submit script inline, as in myfaces core 1.
	 */
	private Boolean renderFormSubmitScriptInline;

	/**
	 * Enable/disable DebugPhaseListener feature, with provide useful
	 * information about ValueHolder variables (submittedValue, localValue,
	 * value).
	 */
	private Boolean debugPhaseListener;

	/**
	 * Detect if a target (usually head) should be update for the current view
	 * in an ajax render operation.
	 */
	private Boolean strictJsf2RefreshTargetAjax;

	/**
	 * Change default getType() behavior for composite component EL resolver,
	 * from return null (see JSF 2_0 spec section 5_6_2_2) to use the metadata
	 * information added by composite:attribute, ensuring components working
	 * with chained EL expressions to find the right type when a getType() is
	 * called over the source EL expression.
	 */
	private String strictJsf2CcElResolver;

	/**
	 * Define the default content type that the default ResponseWriter
	 * generates, when no match can be derived from HTTP Accept Header.
	 */
	private String DefaultResponseWriterContentTypeMode;

	/**
	 * Enable or disable a cache used to 'remember' the generated facelets
	 * unique ids " + "and reduce the impact over memory usage.
	 */
	private Boolean viewUniqueIdsCacheEnabled;

	/**
	 * Set the size of the cache used to store strings generated using
	 * SectionUniqueIdCounter for component ids.
	 */
	private Integer componentUniqueIdsCacheSize;

	/**
	 * If set false, myfaces won't support JSP and javax.faces.el. JSP are
	 * deprecated in " + "JSF 2.X, javax.faces.el in in JSF 1.2. Default value
	 * is true.
	 */
	private Boolean supportJspAndFacesEl;

	/**
	 * When the application runs inside Google Application Engine container
	 * (GAE), indicate which jar files should be scanned for files
	 * (faces-config, facelets taglib or annotations).
	 */
	private String gaeJsfJarFiles;

	/**
	 * When the application runs inside Google Application Engine container
	 * (GAE), indicate which jar files should be scanned for annotations.
	 */
	private String gaeJsfAnnotationsJarFiles;

	/**
	 * If this param is set to true, a check will be done in Restore View Phase
	 * to check if the viewId exists or not and if it does not exists, a 404
	 * response will be thrown.
	 */
	private Boolean strictJsf2ViewNotFound;

	/**
	 * Enable or disable an early flush which allows to send e.g. the HTML-Head
	 * to the client " + "while the rest gets rendered. It's a well known
	 * technique to reduce the time for loading a page.
	 */
	private Boolean earlyFlushEnabled;

	/**
	 * Enable or disable CDI support for converters.
	 */
	private Boolean cdiManagedConvertersEnabled;

	/**
	 * Enable or disable CDI support for validators.
	 */
	private Boolean cdiManagedValidatorsEnabled;

	/**
	 * This param makes components like c:set, ui:param and templating
	 * components like ui:decorate, ui:composition and ui:include to behave like
	 * the ones provided originally in facelets 1_1_x.
	 */
	private Boolean strictJsf2FaceletsCompatibility;

	/**
	 * This param makes h:form component to render the view state and other
	 * hidden fields at the beginning of the form.
	 */
	private Boolean renderFormViewStateAtBegin;

	/**
	 * Defines whether flash scope is disabled, preventing add the Flash cookie
	 * to the response.
	 */
	private Boolean flashScopeDisabled;

	/**
	 * Defines the amount (default = 20) of the latest views are stored in
	 * session.
	 */
	private Integer numberOfViewsInSession;

	/**
	 * Indicates the amount of views (default is not active) that should be
	 * stored in session between sequential POST or POST-REDIRECT-GET if org.
	 */
	private Integer numberOfSequentialViewsInSession;

	/**
	 * Indicate the max number of flash tokens stored into session.
	 */
	private Integer numberOfFlashTokensInSession;

	/**
	 * Indicate the max number of client window ids stored into session by faces
	 * flow.
	 */
	private Integer facesFlowClientWindowIdsInSession;

	/**
	 * This parameter specifies whether or not the ImportHandler will be
	 * supported.
	 */
	private Boolean supportEl3ImportHandler;

	/**
	 * Set the max time in miliseconds set on the "Expires" header for a
	 * resource rendered by the default ResourceHandler.
	 */
	private Integer resourceMaxTimeExpires;

	/**
	 * Controls the size of the cache used to check if a resource exists or not.
	 */
	private Integer resourceHandlerCacheSize;

	/**
	 * Enable or disable the cache used to "remember" if a resource handled by
	 * the default ResourceHandler exists or not.
	 */
	private Boolean resourceHandlerCacheEnabled;

	/**
	 * Indicate if the view state is encrypted or not.
	 */
	private Boolean useEncryption;

	/**
	 * Defines the secret (Base64 encoded) used to initialize the secret key for
	 * encryption algorithm.
	 */
	private String secret;

	/**
	 * If is set to "false", the secret key used for encryption algorithm is not
	 * cached.
	 */
	private Boolean secretCache;

	/**
	 * Indicate the encryption algorithm used for encrypt the view state.
	 */
	private String algorithm;

	/**
	 * Defines the initialization vector (Base64 encoded) used for the
	 * encryption algorithm.
	 */
	private String algorithmIv;

	/**
	 * Defines the default mode and padding used for the encryption algorithm.
	 */
	private String algorithmParameters;

	/**
	 * Defines the factory class name using for serialize/deserialize the view
	 * state returned by state manager into a byte array.
	 */
	private String serialFactory;

	/**
	 * Indicate if the view state should be compressed before
	 * encrypted(optional) and encoded.
	 */
	private Boolean compressStateInClient;

	/**
	 * Indicate the algorithm used to calculate the Message Authentication Code
	 * that is added to the view state.
	 */
	private String macAlgorithm;

	/**
	 * Define the initialization code that are used to initialize the secret key
	 * used on the Message Authentication Code algorithm.
	 */
	private String macSecret;

	/**
	 * If is set to "false", the secret key used for MAC algorithm is not cached.
	 */
	private Boolean macSecretCache;

	/**
	 * Indicate if the classes associated to components, converters, validators
	 * or behaviors should be loaded as soon as they are added to the current
	 * application instance or instead loaded in a lazy way.
	 */
	private Boolean lazyLoadConfigObjects;

	/**
	 * Allow slash in the library name of a Resource.
	 */
	private Boolean strictJsf2AllowSlashLibraryName;

	/**
	 * Define the default buffer size that is used between Resource.
	 */
	private Integer resourceBufferSize;

	/**
	 * Defines how to generate the csrf session token.
	 */
	private String randomKeyInCsrfSessionToken;

	/**
	 * Set the default length of the random key used for the csrf session token.
	 */
	private Integer randomKeyInCsrfSessionTokenLength;

	/**
	 * Sets the random class to initialize the secure random id generator.
	 */
	private String randomKeyInCsrfSessionTokenSecureRandomClass;

	/**
	 * Sets the random provider to initialize the secure random id generator.
	 */
	private String randomKeyInCsrfSessionTokenSecureRandomProvider;

	/**
	 * Sets the random algorithm to initialize the secure random id generator.
	 */
	private String randomKeyInCsrfSessionTokenSecureRandomAlgoritm;

	/**
	 * Define the time in minutes where the view state is valid when client side
	 * state saving is used.
	 */
	private Integer clientViewStateTimeout;

	/**
	 * Indicate if the state should be serialized before save it on the session.
	 */
	private Boolean serializeStateInSession;

	/**
	 * Indicates that the serialized state will be compressed before it is
	 * written to the session.
	 */
	private Boolean compressStateInSession;

	/**
	 * This parameter has been removed from 2.
	 */
	private Boolean cacheOldViewsInSessionMode;

	/**
	 * Allow use flash scope to keep track of the views used in session and the
	 * previous ones, so server side state saving can delete old views even if
	 * POST-REDIRECT-GET pattern is used.
	 */
	private Boolean useFlashScopePurgeViewsInSession;

	/**
	 * Adds a random key to the generated view state session token.
	 */
	private String randomKeyInViewStateSessionToken;

	/**
	 * Set the default length of the random key added to the view state session
	 * token.
	 */
	private Integer randomKeyInViewStateSessionTokenLength;

	/**
	 * Sets the random class to initialize the secure random id generator.
	 */
	private String randomKeyInViewStateSessionTokenSecureRandomClass;

	/**
	 * Sets the random provider to initialize the secure random id generator.
	 */
	private String randomKeyInViewStateSessionTokenSecureRandomProvider;

	/**
	 * Sets the random algorithm to initialize the secure random id generator.
	 */
	private String randomKeyInViewStateSessionTokenSecureRandomAlgorithm;

	/**
	 * Validate if the managed beans and navigations rules are correct.
	 */
	private Boolean validate;

	private Annotation annotation = new Annotation();

	/**
	 * If the flag is true, the algoritm skip jar scanning for faces-config
	 * files to check if the current application requires FacesServlet to be
	 * added dynamically (servlet spec 3).
	 */
	private Boolean initializeSkipJarFacesConfigScan;

	/**
	 * The Class of an Comparator<ELResolver/> implementation.
	 */
	private String elResolverComparator;

	/**
	 * The Class of an org.apache.commons.collections.Predicate<ELResolver/>
	 * implementation." + "If used and returns true for a ELResolver instance,
	 * such resolver will not be installed in " + "ELResolvers chain. Use with
	 * caution - can break functionality defined in JSF specification " +
	 * "'ELResolver Instances Provided by Faces'.
	 */
	private String elResolverPredicate;

	/**
	 * no description.
	 */
	private String defaultWindowMode;

	/**
	 * Indicate the template name used to render the default error page used by
	 * MyFaces specific error handler implementation.
	 */
	private String errorTemplateResource;

	/**
	 * Indicate the template name used to render the default debug page (see
	 * ui:debug tag).
	 */
	private String debugTemplateResource;

	/**
	 * Indicate if myfaces is responsible to handle errors.
	 */
	private Boolean errorHandling;

	/**
	 * Define if the state caching code should be handled by the
	 * ResponseStateManager or by the StateManager used.
	 */
	private Boolean handleStateCachingMechanics;

	/**
	 * Add autocomplete="off" to the view state hidden field.
	 */
	private Boolean autocompleteOffViewState;

	/**
	 * If this param is true and the project stage is development mode, the
	 * source javascript files will be loaded separately instead have all in
	 * just one file, to preserve line numbers and make javascript debugging of
	 * the default jsf javascript file more simple.
	 */
	private Boolean useMultipleJsFilesForJsfUncompressedJs;

	/**
	 * Define the mode used for jsf.
	 */
	private String jsfJsMode;

	/**
	 * If this param is set to true (default false), a temporal directory is
	 * created and all files handled by this ResourceLoader are cached there,
	 * avoiding the problem described on MYFACES-3586.
	 */
	private Boolean temporalResourcehandlerCacheEnabled;

	/**
	 * Class name of a custom ServiceProviderFinder implementation.
	 */
	private Boolean serviceProviderFinder;

	private Spi spi = new Spi();

	/**
	 * If this param is set to true (by default), when pss algorithm is executed
	 * to save state, a visit tree traversal is done, instead a plain traversal
	 * like previous versions (2.
	 */
	private Boolean saveStateWithVisitTreeOnPass;

	/**
	 * Define how duplicate ids are checked when ProjectStage is Production, by
	 * default (auto) it only check ids of components that does not encapsulate
	 * markup (like facelets UILeaf).
	 */
	private String checkIdProductionMode;

	/**
	 * no description.
	 */
	private Boolean markInitialStateWhenApplyBuildView;

	/**
	 * Wrap exception caused by calls to EL expressions, so information like the
	 * location, expression string and tag name can be retrieved by the
	 * ExceptionHandler implementation and used to output meaningful information
	 * about itself.
	 */
	private Boolean wrapTagExceptionsAsContextAware;

	/**
	 * Indicates if expressions generated by facelets should be cached or not.
	 */
	private Boolean cacheElExpressions;

	/**
	 * Defines the number of views to be hold per each view metadata definition.
	 */
	private Integer viewPoolMaxPoolSize;

	/**
	 * Defines the limit of the views that cannot be reused partially.
	 */
	private Integer viewPoolMaxDynamicPartialLimit;

	/**
	 * Defines the type of memory reference that is used to hold the view into
	 * memory.
	 */
	private String viewPoolEntryMode;

	/**
	 * Defines if the view pool uses deferred navigation to recycle views when
	 * navigation is performed.
	 */
	private Boolean viewPoolDeferredNavigation;

	private Validator Validator = new Validator();

	/**
	 * This parameter specifies the ExpressionFactory implementation to use.
	 */
	private String expressionFactory;

	/**
	 * If this param is set to true, the check for faces servlet mapping is not
	 * done.
	 */
	private Boolean initializeAlwaysStandalone;

	/**
	 * Class name of a custom FacesInitializer implementation.
	 */
	private String facesInitializer;

	/**
	 * comma delimited list of plugin classes which can be hooked into myfaces.
	 */
	private String facesInitPlugins;

	/**
	 * Annotation class of useCdiForAnnotationScanning and scanPackages properties.
	 */
	@Getter
	@Setter
	public static class Annotation {

		/**
		 * Defines if CDI should be used for annotation scanning to improve the
		 * startup performance.
		 */
		private Boolean useCdiForAnnotationScanning;

		/**
		 * Servlet context init parameter which defines which packages to scan
		 * for beans, separated by commas.
		 */
		private String scanPackages;
	}

	/**
	 * Spi class of injectionProvider property..
	 */
	@Getter
	@Setter
	public static class Spi {

		/**
		 * no description.
		 */
		private String injectionProvider;
	}

	/**
	 * Validator class of beanBeforeJsfValidation property.
	 */
	@Getter
	@Setter
	public static class Validator {

		/**
		 * Enforce f:validateBean to be called first before any JSF validator.
		 */
		private Boolean beanBeforeJsfValidation;
	}

}
