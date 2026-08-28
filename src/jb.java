import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jb {
   a(ja.c),
   b(ja.c, ja.f),
   c(ja.f),
   d(ja.d, ja.f),
   e(ja.d),
   f(ja.d, ja.e),
   g(ja.e),
   h(ja.c, ja.e);

   private final Set<ja> i;
   private final jz j;

   private jb(final ja... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new jz(0, 0, 0);

      for (ja $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<ja> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
