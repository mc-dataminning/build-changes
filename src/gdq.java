public class gdq implements gdw {
   private static final int a = 1200;
   private static final te b = te.c("tutorial.craft_planks.title");
   private static final te c = te.c("tutorial.craft_planks.description");
   private final gdv d;
   private eul e;
   private int f;

   public gdq(gdv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gdx.f);
      } else {
         if (this.f == 1) {
            fmi $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.fQ().a(apr.b)) {
                  this.d.a(gdx.f);
                  return;
               }

               if (a($$0, apr.b)) {
                  this.d.a(gdx.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new eul(eul.a.e, b, c, false);
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
   public void a(ciw $$0) {
      if ($$0.a(apr.b)) {
         this.d.a(gdx.f);
      }
   }

   public static boolean a(fmi $$0, apy<cir> $$1) {
      for (hf<cir> $$2 : jc.i.c($$1)) {
         if ($$0.j().a(ape.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
