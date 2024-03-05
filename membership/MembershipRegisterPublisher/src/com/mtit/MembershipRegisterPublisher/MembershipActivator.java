package com.mtit.MembershipRegisterPublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class MembershipActivator implements BundleActivator {

	ServiceRegistration memberServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		    System.out.println("Started Membership Publisher");
            MembershipPublisher membershipPublisher = new MembershipPublishImpl();
            memberServiceRegistration = context.registerService(MembershipPublisher.class.getName(), membershipPublisher, null);		
	}

	public void stop(BundleContext Context) throws Exception {
		   System.out.println("Stopped Membership Publisher");
		
	}

}
