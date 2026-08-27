import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum ic {
   a(ib.c),
   b(ib.c, ib.f),
   c(ib.f),
   d(ib.d, ib.f),
   e(ib.d),
   f(ib.d, ib.e),
   g(ib.e),
   h(ib.c, ib.e);

   private final Set<ib> i;
   private final ja j;

   private ic(ib... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new ja(0, 0, 0);

      for (ib $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<ib> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
