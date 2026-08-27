import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum ii {
   a(ih.c),
   b(ih.c, ih.f),
   c(ih.f),
   d(ih.d, ih.f),
   e(ih.d),
   f(ih.d, ih.e),
   g(ih.e),
   h(ih.c, ih.e);

   private final Set<ih> i;
   private final jf j;

   private ii(ih... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new jf(0, 0, 0);

      for (ih $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<ih> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
