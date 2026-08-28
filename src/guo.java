public class guo implements guu {
   private static final int a = 1200;
   private static final xl b = xl.c("tutorial.craft_planks.title");
   private static final xl c = xl.c("tutorial.craft_planks.description");
   private final gut d;
   private fjk e;
   private int f;

   public guo(gut $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(guv.f);
      } else {
         if (this.f == 1) {
            gcl $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gc().a(awu.b)) {
                  this.d.a(guv.f);
                  return;
               }

               if (a($$0, awu.b)) {
                  this.d.a(guv.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fjk(fjk.a.e, b, c, false);
            this.d.e().ax().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.c();
         this.e = null;
      }
   }

   @Override
   public void a(cuk $$0) {
      if ($$0.a(awu.b)) {
         this.d.a(guv.f);
      }
   }

   public static boolean a(gcl $$0, axb<cuf> $$1) {
      for (ji<cuf> $$2 : lp.h.c($$1)) {
         if ($$0.j().a(awg.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
