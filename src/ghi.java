import com.google.common.collect.Sets;
import java.util.Set;

public class ghi implements ggv.a {
   private static final int a = 60;
   private final Set<kb> b = Sets.newHashSet();

   ghi() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(kb $$0) {
      this.b.add($$0);
   }

   public void b(kb $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(ezt $$0, gdj $$1, double $$2, double $$3, double $$4) {
      iz $$5 = iz.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.q(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(ezt $$0, gdj $$1, kb $$2) {
      ggv.a($$0, $$1, $$2.q(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
