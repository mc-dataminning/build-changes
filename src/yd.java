import java.util.HashSet;
import java.util.Set;

public record yd(Set<agm> a) implements wo<ya> {
   public yd(ty $$0) {
      this($$0.a(HashSet::new, ty::t));
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a, ty::a);
   }

   public void a(ya $$0) {
      $$0.a(this);
   }
}
