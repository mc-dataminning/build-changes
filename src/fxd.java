import com.google.common.collect.Sets;
import java.util.Set;

public class fxd implements fwq.a {
   private static final int a = 60;
   private final Set<iz> b = Sets.newHashSet();

   fxd() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(iz $$0) {
      this.b.add($$0);
   }

   public void b(iz $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(epz $$0, ftf $$1, double $$2, double $$3, double $$4) {
      hx $$5 = hx.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.q(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(epz $$0, ftf $$1, iz $$2) {
      fwq.a($$0, $$1, $$2.q(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
