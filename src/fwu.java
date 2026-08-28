import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fwu implements fwx {
   private static final alk e = alk.b("toast/advancement");
   public static final int a = 5000;
   private final aj f;
   private fwx.a g = fwx.a.b;

   public fwu(aj $$0) {
      this.f = $$0;
   }

   @Override
   public fwx.a a() {
      return this.g;
   }

   @Override
   public void a(fwy $$0, long $$1) {
      av $$2 = this.f.b().c().orElse(null);
      if ($$2 == null) {
         this.g = fwx.a.b;
      } else {
         this.g = (double)$$1 >= 5000.0 * $$0.d() ? fwx.a.b : fwx.a.a;
      }
   }

   @Nullable
   @Override
   public awq b() {
      return this.e() ? awr.BB : null;
   }

   private boolean e() {
      Optional<av> $$0 = this.f.b().c();
      return $$0.isPresent() && $$0.get().e().equals(ap.b);
   }

   @Override
   public void a(ftz $$0, ftx $$1, long $$2) {
      av $$3 = this.f.b().c().orElse(null);
      $$0.a(gsn::H, e, 0, 0, this.c(), this.d());
      if ($$3 != null) {
         List<azc> $$4 = $$1.c($$3.a(), 125);
         int $$5 = $$3.e() == ap.b ? -30465 : -256;
         if ($$4.size() == 1) {
            $$0.a($$1, $$3.e().b(), 30, 7, $$5, false);
            $$0.a($$1, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = azq.d(azq.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               $$0.a($$1, $$3.e().b(), 30, 11, $$5 | $$8, false);
            } else {
               int $$9 = azq.d(azq.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int $$10 = this.d() / 2 - $$4.size() * 9 / 2;

               for (azc $$11 : $$4) {
                  $$0.a($$1, $$11, 30, $$10, 16777215 | $$9, false);
                  $$10 += 9;
               }
            }
         }

         $$0.b($$3.c(), 8, 8);
      }
   }
}
