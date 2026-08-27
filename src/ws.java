import java.util.HashSet;
import java.util.Set;

public record ws(Set<aew> a) implements vd<wp> {
   public ws(so $$0) {
      this($$0.a(HashSet::new, so::s));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, so::a);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }
}
