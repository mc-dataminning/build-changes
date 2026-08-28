import com.google.common.collect.Sets;
import java.util.Set;

public class gwu implements gwf.a {
   private static final int a = 60;
   private final Set<jz> b = Sets.newHashSet();

   gwu() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(jz $$0) {
      this.b.add($$0);
   }

   public void b(jz $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(flq $$0, gsc $$1, double $$2, double $$3, double $$4) {
      iw $$5 = iw.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.k(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(flq $$0, gsc $$1, jz $$2) {
      gwf.a($$0, $$1, $$2.k(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
