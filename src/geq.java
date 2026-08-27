public class geq implements gew {
   private static final int a = 1200;
   private static final tn b = tn.c("tutorial.craft_planks.title");
   private static final tn c = tn.c("tutorial.craft_planks.description");
   private final gev d;
   private evb e;
   private int f;

   public geq(gev $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gex.f);
      } else {
         if (this.f == 1) {
            fni $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fR().a(aqc.b)) {
                  this.d.a(gex.f);
                  return;
               }

               if (a($$0, aqc.b)) {
                  this.d.a(gex.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new evb(evb.a.e, b, c, false);
            this.d.e().ay().a(this.e);
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
   public void a(cjh $$0) {
      if ($$0.a(aqc.b)) {
         this.d.a(gex.f);
      }
   }

   public static boolean a(fni $$0, aqj<cjc> $$1) {
      for (hg<cjc> $$2 : jd.i.c($$1)) {
         if ($$0.j().a(app.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
