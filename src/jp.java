import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jp {
   a(jo.c),
   b(jo.c, jo.f),
   c(jo.f),
   d(jo.d, jo.f),
   e(jo.d),
   f(jo.d, jo.e),
   g(jo.e),
   h(jo.c, jo.e);

   private final Set<jo> i;
   private final kn j;

   private jp(final jo... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new kn(0, 0, 0);

      for (jo $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<jo> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
