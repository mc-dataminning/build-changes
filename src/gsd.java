public class gsd implements gsj {
   private static final int a = 1200;
   private static final ws b = ws.c("tutorial.craft_planks.title");
   private static final ws c = ws.c("tutorial.craft_planks.description");
   private final gsi d;
   private fhf e;
   private int f;

   public gsd(gsi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gsk.f);
      } else {
         if (this.f == 1) {
            gag $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.ga().a(avw.b)) {
                  this.d.a(gsk.f);
                  return;
               }

               if (a($$0, avw.b)) {
                  this.d.a(gsk.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fhf(fhf.a.e, b, c, false);
            this.d.e().aA().a(this.e);
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
   public void a(csd $$0) {
      if ($$0.a(avw.b)) {
         this.d.a(gsk.f);
      }
   }

   public static boolean a(gag $$0, awd<cry> $$1) {
      for (iv<cry> $$2 : lc.h.c($$1)) {
         if ($$0.j().a(avj.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
