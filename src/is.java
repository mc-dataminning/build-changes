import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum is {
   a(ir.c),
   b(ir.c, ir.f),
   c(ir.f),
   d(ir.d, ir.f),
   e(ir.d),
   f(ir.d, ir.e),
   g(ir.e),
   h(ir.c, ir.e);

   private final Set<ir> i;
   private final jq j;

   private is(ir... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new jq(0, 0, 0);

      for (ir $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }
   }

   public Set<ir> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
