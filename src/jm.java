import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jm {
   a(jl.c),
   b(jl.c, jl.f),
   c(jl.f),
   d(jl.d, jl.f),
   e(jl.d),
   f(jl.d, jl.e),
   g(jl.e),
   h(jl.c, jl.e);

   private final Set<jl> i;
   private final kk j;

   private jm(final jl... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new kk(0, 0, 0);

      for (jl $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<jl> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
