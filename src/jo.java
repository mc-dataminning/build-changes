import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jo {
   a(jn.c),
   b(jn.c, jn.f),
   c(jn.f),
   d(jn.d, jn.f),
   e(jn.d),
   f(jn.d, jn.e),
   g(jn.e),
   h(jn.c, jn.e);

   private final Set<jn> i;
   private final km j;

   private jo(final jn... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new km(0, 0, 0);

      for (jn $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<jn> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
