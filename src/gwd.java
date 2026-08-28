public class gwd implements gwj {
   private static final int a = 1200;
   private static final wz b = wz.c("tutorial.craft_planks.title");
   private static final wz c = wz.c("tutorial.craft_planks.description");
   private final gwi d;
   private fkx e;
   private int f;

   public gwd(gwi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwk.f);
      } else {
         if (this.f == 1) {
            geb $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fY().a(awn.b)) {
                  this.d.a(gwk.f);
                  return;
               }

               if (a($$0, awn.b)) {
                  this.d.a(gwk.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fkx(fkx.a.e, b, c, false);
            this.d.e().aw().a(this.e);
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
   public void a(cuq $$0) {
      if ($$0.a(awn.b)) {
         this.d.a(gwk.f);
      }
   }

   public static boolean a(geb $$0, awu<cul> $$1) {
      for (jm<cul> $$2 : lt.g.c($$1)) {
         if ($$0.j().a(avz.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
