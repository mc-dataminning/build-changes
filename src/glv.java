import com.google.common.collect.Sets;
import java.util.Set;

public class glv implements glg.a {
   private static final int a = 60;
   private final Set<kg> b = Sets.newHashSet();

   glv() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(kg $$0) {
      this.b.add($$0);
   }

   public void b(kg $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(fde $$0, ghg $$1, double $$2, double $$3, double $$4) {
      je $$5 = je.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.k(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(fde $$0, ghg $$1, kg $$2) {
      glg.a($$0, $$1, $$2.k(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
