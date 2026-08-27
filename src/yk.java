import java.util.HashSet;
import java.util.Set;

public record yk(Set<agt> a) implements wu<yh> {
   public yk(ue $$0) {
      this($$0.a(HashSet::new, ue::t));
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a, ue::a);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }
}
