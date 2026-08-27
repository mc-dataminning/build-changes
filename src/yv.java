import java.util.HashSet;
import java.util.Set;

public record yv(Set<acq> a) implements uo<ur> {
   public yv(sf $$0) {
      this($$0.a(HashSet::new, sf::t));
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a, sf::a);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }
}
