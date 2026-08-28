import com.google.common.collect.Sets;
import java.util.Set;

public class gsp implements gsa.a {
   private static final int a = 60;
   private final Set<kl> b = Sets.newHashSet();

   gsp() {
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public void a(kl $$0) {
      this.b.add($$0);
   }

   public void b(kl $$0) {
      this.b.remove($$0);
   }

   @Override
   public void a(fho $$0, gny $$1, double $$2, double $$3, double $$4) {
      jj $$5 = jj.a($$2, $$3, $$4);
      this.b.forEach($$3x -> {
         if ($$5.a($$3x.k(), 60.0)) {
            a($$0, $$1, $$3x);
         }
      });
   }

   private static void a(fho $$0, gny $$1, kl $$2) {
      gsa.a($$0, $$1, $$2.k(), 0.2F, 1.0F, 0.2F, 0.15F);
   }
}
