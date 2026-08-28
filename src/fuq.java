import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fuq implements fut {
   private static final alg e = alg.b("toast/advancement");
   public static final int a = 5000;
   private final ai f;
   private fut.a g = fut.a.b;

   public fuq(ai $$0) {
      this.f = $$0;
   }

   @Override
   public fut.a a() {
      return this.g;
   }

   @Override
   public void a(fuu $$0, long $$1) {
      au $$2 = this.f.b().c().orElse(null);
      if ($$2 == null) {
         this.g = fut.a.b;
      } else {
         this.g = (double)$$1 >= 5000.0 * $$0.d() ? fut.a.b : fut.a.a;
      }
   }

   @Nullable
   @Override
   public awm b() {
      return this.e() ? awn.BB : null;
   }

   private boolean e() {
      Optional<au> $$0 = this.f.b().c();
      return $$0.isPresent() && $$0.get().e().equals(ao.b);
   }

   @Override
   public void a(frv $$0, frt $$1, long $$2) {
      au $$3 = this.f.b().c().orElse(null);
      $$0.a(gqk::H, e, 0, 0, this.c(), this.d());
      if ($$3 != null) {
         List<ayy> $$4 = $$1.c($$3.a(), 125);
         int $$5 = $$3.e() == ao.b ? -30465 : -256;
         if ($$4.size() == 1) {
            $$0.a($$1, $$3.e().b(), 30, 7, $$5, false);
            $$0.a($$1, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = azm.d(azm.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               $$0.a($$1, $$3.e().b(), 30, 11, $$5 | $$8, false);
            } else {
               int $$9 = azm.d(azm.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int $$10 = this.d() / 2 - $$4.size() * 9 / 2;

               for (ayy $$11 : $$4) {
                  $$0.a($$1, $$11, 30, $$10, 16777215 | $$9, false);
                  $$10 += 9;
               }
            }
         }

         $$0.b($$3.c(), 8, 8);
      }
   }
}
