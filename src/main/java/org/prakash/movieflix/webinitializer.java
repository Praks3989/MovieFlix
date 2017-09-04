package org.prakash.movieflix;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class webinitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {webConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/api/"};
	}

}
