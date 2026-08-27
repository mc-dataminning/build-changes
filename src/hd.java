import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum hd {
   a(hc.c),
   b(hc.c, hc.f),
   c(hc.f),
   d(hc.d, hc.f),
   e(hc.d),
   f(hc.d, hc.e),
   g(hc.e),
   h(hc.c, hc.e);

   private final Set<hc> i;
   private final ib j;

   private hd(hc... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new ib(0, 0, 0);

      for (hc $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<hc> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
