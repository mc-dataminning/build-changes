import com.google.common.collect.Sets;
import java.util.Set;

public class gbp implements gbc.a {
   private static final int a = 60;
   private final Set<je> b = Sets.newHashSet();

   gbp() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(je $$0) {
      this.b.add($$0);
   }

   public void b(je $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(etz $$0, fxq $$1, double $$2, double $$3, double $$4) {
      ib $$5 = ib.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.q(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(etz $$0, fxq $$1, je $$2) {
      gbc.a($$0, $$1, $$2.q(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
