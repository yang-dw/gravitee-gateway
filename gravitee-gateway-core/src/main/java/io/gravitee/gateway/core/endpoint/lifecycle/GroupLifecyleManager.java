package io.gravitee.gateway.core.endpoint.lifecycle;

import io.gravitee.common.component.LifecycleComponent;
import io.gravitee.gateway.core.endpoint.GroupManager;

/**
 * @author David BRASSELY (david.brassely at graviteesource.com)
 * @author GraviteeSource Team
 */
public interface GroupLifecyleManager extends GroupManager, LifecycleComponent<GroupLifecyleManager> {
}
