import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jl {
   a(jk.c),
   b(jk.c, jk.f),
   c(jk.f),
   d(jk.d, jk.f),
   e(jk.d),
   f(jk.d, jk.e),
   g(jk.e),
   h(jk.c, jk.e);

   private final Set<jk> i;
   private final kj j;

   private jl(final jk... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new kj(0, 0, 0);

      for (jk $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<jk> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
