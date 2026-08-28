import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jd {
   a(jc.c),
   b(jc.c, jc.f),
   c(jc.f),
   d(jc.d, jc.f),
   e(jc.d),
   f(jc.d, jc.e),
   g(jc.e),
   h(jc.c, jc.e);

   private final Set<jc> i;
   private final kb j;

   private jd(final jc... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new kb(0, 0, 0);

      for (jc $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<jc> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
