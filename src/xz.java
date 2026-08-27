import java.util.HashSet;
import java.util.Set;

public record xz(Set<agi> a) implements wk<xw> {
   public xz(tu $$0) {
      this($$0.a(HashSet::new, tu::t));
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, tu::a);
   }

   public void a(xw $$0) {
      $$0.a(this);
   }
}
