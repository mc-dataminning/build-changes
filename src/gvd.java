import com.google.common.collect.Sets;
import java.util.Set;

public class gvd implements guo.a {
   private static final int a = 60;
   private final Set<jy> b = Sets.newHashSet();

   gvd() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(jy $$0) {
      this.b.add($$0);
   }

   public void b(jy $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(fjy $$0, gqm $$1, double $$2, double $$3, double $$4) {
      iv $$5 = iv.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.k(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(fjy $$0, gqm $$1, jy $$2) {
      guo.a($$0, $$1, $$2.k(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
