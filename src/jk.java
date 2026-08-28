import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jk {
   a(jj.c),
   b(jj.c, jj.f),
   c(jj.f),
   d(jj.d, jj.f),
   e(jj.d),
   f(jj.d, jj.e),
   g(jj.e),
   h(jj.c, jj.e);

   private final Set<jj> i;
   private final ki j;

   private jk(final jj... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new ki(0, 0, 0);

      for (jj $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<jj> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
