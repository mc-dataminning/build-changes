import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jn {
   a(jm.c),
   b(jm.c, jm.f),
   c(jm.f),
   d(jm.d, jm.f),
   e(jm.d),
   f(jm.d, jm.e),
   g(jm.e),
   h(jm.c, jm.e);

   private final Set<jm> i;
   private final kl j;

   private jn(final jm... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new kl(0, 0, 0);

      for (jm $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<jm> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
