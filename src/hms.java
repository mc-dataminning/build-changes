import javax.annotation.Nullable;

public class hms implements hmy {
   private static final int a = 1200;
   private static final wv b = wv.c("tutorial.craft_planks.title");
   private static final wv c = wv.c("tutorial.craft_planks.description");
   private final hmx d;
   @Nullable
   private fsz e;
   private int f;

   public hms(hmx $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hmz.f);
      } else {
         fnd $$0 = this.d.e();
         if (this.f == 1) {
            gmw $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(axi.b)) {
                  this.d.a(hmz.f);
                  return;
               }

               if (a($$1, axi.b)) {
                  this.d.a(hmz.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fsz($$0.h, fsz.a.e, b, c, false);
            $$0.aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.e();
         this.e = null;
      }
   }

   @Override
   public void a(cxy $$0) {
      if ($$0.a(axi.b)) {
         this.d.a(hmz.f);
      }
   }

   public static boolean a(gmw $$0, axp<cxu> $$1) {
      for (js<cxu> $$2 : md.g.c($$1)) {
         if ($$0.l().a(awu.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
