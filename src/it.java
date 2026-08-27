import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum it {
   a(is.c),
   b(is.c, is.f),
   c(is.f),
   d(is.d, is.f),
   e(is.d),
   f(is.d, is.e),
   g(is.e),
   h(is.c, is.e);

   private final Set<is> i;
   private final jr j;

   private it(is... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new jr(0, 0, 0);

      for (is $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<is> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
