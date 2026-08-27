import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum ig {
   a(ie.c),
   b(ie.c, ie.f),
   c(ie.f),
   d(ie.d, ie.f),
   e(ie.d),
   f(ie.d, ie.e),
   g(ie.e),
   h(ie.c, ie.e);

   private final Set<ie> i;
   private final jd j;

   private ig(ie... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new jd(0, 0, 0);

      for (ie $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<ie> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
