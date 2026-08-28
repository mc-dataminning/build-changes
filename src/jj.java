import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum jj {
   a(ji.c),
   b(ji.c, ji.f),
   c(ji.f),
   d(ji.d, ji.f),
   e(ji.d),
   f(ji.d, ji.e),
   g(ji.e),
   h(ji.c, ji.e);

   private final Set<ji> i;
   private final kh j;

   private jj(final ji... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new kh(0, 0, 0);

      for (ji $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<ji> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
