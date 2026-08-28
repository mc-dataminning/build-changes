import com.google.common.collect.Sets;
import java.util.Set;

public class gpv implements gpg.a {
   private static final int a = 60;
   private final Set<kj> b = Sets.newHashSet();

   gpv() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(kj $$0) {
      this.b.add($$0);
   }

   public void b(kj $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(fgl $$0, glg $$1, double $$2, double $$3, double $$4) {
      jh $$5 = jh.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.k(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(fgl $$0, glg $$1, kj $$2) {
      gpg.a($$0, $$1, $$2.k(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
