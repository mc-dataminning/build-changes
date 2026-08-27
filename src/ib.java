import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum ib {
   a(ia.c),
   b(ia.c, ia.f),
   c(ia.f),
   d(ia.d, ia.f),
   e(ia.d),
   f(ia.d, ia.e),
   g(ia.e),
   h(ia.c, ia.e);

   private final Set<ia> i;
   private final iz j;

   private ib(ia... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new iz(0, 0, 0);

      for (ia $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<ia> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
