import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum ik {
   a(ij.c),
   b(ij.c, ij.f),
   c(ij.f),
   d(ij.d, ij.f),
   e(ij.d),
   f(ij.d, ij.e),
   g(ij.e),
   h(ij.c, ij.e);

   private final Set<ij> i;
   private final ji j;

   private ik(ij... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new ji(0, 0, 0);

      for (ij $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<ij> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
