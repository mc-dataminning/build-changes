import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum iu {
   a(it.c),
   b(it.c, it.f),
   c(it.f),
   d(it.d, it.f),
   e(it.d),
   f(it.d, it.e),
   g(it.e),
   h(it.c, it.e);

   private final Set<it> i;
   private final js j;

   private iu(it... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new js(0, 0, 0);

      for (it $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<it> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
