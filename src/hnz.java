import javax.annotation.Nullable;

public class hnz implements hof {
   private static final int a = 1200;
   private static final ww b = ww.c("tutorial.craft_planks.title");
   private static final ww c = ww.c("tutorial.craft_planks.description");
   private final hoe d;
   @Nullable
   private fuc e;
   private int f;

   public hnz(hoe $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hog.f);
      } else {
         fof $$0 = this.d.e();
         if (this.f == 1) {
            goa $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(axi.b)) {
                  this.d.a(hog.f);
                  return;
               }

               if (a($$1, axi.b)) {
                  this.d.a(hog.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fuc($$0.h, fuc.a.e, b, c, false);
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
   public void a(cys $$0) {
      if ($$0.a(axi.b)) {
         this.d.a(hog.f);
      }
   }

   public static boolean a(goa $$0, axp<cyo> $$1) {
      for (je<cyo> $$2 : mf.g.c($$1)) {
         if ($$0.l().a(awv.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
