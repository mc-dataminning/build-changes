import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum hy {
   a(hx.c),
   b(hx.c, hx.f),
   c(hx.f),
   d(hx.d, hx.f),
   e(hx.d),
   f(hx.d, hx.e),
   g(hx.e),
   h(hx.c, hx.e);

   private final Set<hx> i;
   private final iw j;

   private hy(hx... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new iw(0, 0, 0);

      for (hx $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<hx> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
