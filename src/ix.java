import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum ix {
   a(iw.c),
   b(iw.c, iw.f),
   c(iw.f),
   d(iw.d, iw.f),
   e(iw.d),
   f(iw.d, iw.e),
   g(iw.e),
   h(iw.c, iw.e);

   private final Set<iw> i;
   private final jv j;

   private ix(iw... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new jv(0, 0, 0);

      for (iw $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<iw> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
