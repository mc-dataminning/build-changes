import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum hb {
   a(ha.c),
   b(ha.c, ha.f),
   c(ha.f),
   d(ha.d, ha.f),
   e(ha.d),
   f(ha.d, ha.e),
   g(ha.e),
   h(ha.c, ha.e);

   private final Set<ha> i;
   private final hy j;

   private hb(ha... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new hy(0, 0, 0);

      for (ha $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<ha> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
