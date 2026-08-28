import com.google.common.collect.Sets;
import java.util.Set;

public class gma implements gll.a {
   private static final int a = 60;
   private final Set<kh> b = Sets.newHashSet();

   gma() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(kh $$0) {
      this.b.add($$0);
   }

   public void b(kh $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(fdi $$0, ghl $$1, double $$2, double $$3, double $$4) {
      jf $$5 = jf.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.k(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(fdi $$0, ghl $$1, kh $$2) {
      gll.a($$0, $$1, $$2.k(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
