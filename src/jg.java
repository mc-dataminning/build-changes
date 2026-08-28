import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jg {
   a(jf.c),
   b(jf.c, jf.f),
   c(jf.f),
   d(jf.d, jf.f),
   e(jf.d),
   f(jf.d, jf.e),
   g(jf.e),
   h(jf.c, jf.e);

   private final Set<jf> i;
   private final ke j;

   private jg(final jf... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new ke(0, 0, 0);

      for (jf $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<jf> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
