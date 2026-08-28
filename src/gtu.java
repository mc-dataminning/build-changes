import com.google.common.collect.Sets;
import java.util.Set;

public class gtu implements gtf.a {
   private static final int a = 60;
   private final Set<jx> b = Sets.newHashSet();

   gtu() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(jx $$0) {
      this.b.add($$0);
   }

   public void b(jx $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(fiq $$0, gpd $$1, double $$2, double $$3, double $$4) {
      iu $$5 = iu.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.k(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(fiq $$0, gpd $$1, jx $$2) {
      gtf.a($$0, $$1, $$2.k(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
