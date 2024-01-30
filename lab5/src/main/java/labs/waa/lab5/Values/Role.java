package labs.waa.lab5.Values;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Builder
@RequiredArgsConstructor
public class Role implements GrantedAuthority {
    final private String name;
    @Override
    public String getAuthority() {
        return name;
    }
}