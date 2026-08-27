import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum hc {
   a(hb.c),
   b(hb.c, hb.f),
   c(hb.f),
   d(hb.d, hb.f),
   e(hb.d),
   f(hb.d, hb.e),
   g(hb.e),
   h(hb.c, hb.e);

   private final Set<hb> i;
   private final ia j;

   private hc(hb... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new ia(0, 0, 0);

      for (hb $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<hb> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
