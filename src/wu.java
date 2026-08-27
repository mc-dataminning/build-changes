import java.util.HashSet;
import java.util.Set;

public record wu(Set<aey> a) implements vf<wr> {
   public wu(sq $$0) {
      this($$0.a(HashSet::new, sq::s));
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, sq::a);
   }

   public void a(wr $$0) {
      $$0.a(this);
   }
}
