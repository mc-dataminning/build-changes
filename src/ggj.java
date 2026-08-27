import com.google.common.collect.Sets;
import java.util.Set;

public class ggj implements gfw.a {
   private static final int a = 60;
   private final Set<jq> b = Sets.newHashSet();

   ggj() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(jq $$0) {
      this.b.add($$0);
   }

   public void b(jq $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(eys $$0, gck $$1, double $$2, double $$3, double $$4) {
      io $$5 = io.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.q(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(eys $$0, gck $$1, jq $$2) {
      gfw.a($$0, $$1, $$2.q(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
