import java.util.HashSet;
import java.util.Set;

public record wt(Set<aez> a) implements ve<wq> {
   public wt(so $$0) {
      this($$0.a(HashSet::new, so::t));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, so::a);
   }

   public void a(wq $$0) {
      $$0.a(this);
   }
}
