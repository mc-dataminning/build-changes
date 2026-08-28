public class gvw implements gwc {
   private static final int a = 1200;
   private static final wy b = wy.c("tutorial.craft_planks.title");
   private static final wy c = wy.c("tutorial.craft_planks.description");
   private final gwb d;
   private fkr e;
   private int f;

   public gvw(gwb $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwd.f);
      } else {
         if (this.f == 1) {
            gdv $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(awm.b)) {
                  this.d.a(gwd.f);
                  return;
               }

               if (a($$0, awm.b)) {
                  this.d.a(gwd.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fkr(fkr.a.e, b, c, false);
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
   public void a(cuo $$0) {
      if ($$0.a(awm.b)) {
         this.d.a(gwd.f);
      }
   }

   public static boolean a(gdv $$0, awt<cuj> $$1) {
      for (jm<cuj> $$2 : lt.g.c($$1)) {
         if ($$0.j().a(avy.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
