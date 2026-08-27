public class gwo implements gwu {
   private static final int a = 1200;
   private static final xe b = xe.c("tutorial.craft_planks.title");
   private static final xe c = xe.c("tutorial.craft_planks.description");
   private final gwt d;
   private fky e;
   private int f;

   public gwo(gwt $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gwv.f);
      } else {
         if (this.f == 1) {
            gei $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gl().a(awm.b)) {
                  this.d.a(gwv.f);
                  return;
               }

               if (a($$0, awm.b)) {
                  this.d.a(gwv.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fky(fky.a.e, b, c, false);
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
   public void a(cuh $$0) {
      if ($$0.a(awm.b)) {
         this.d.a(gwv.f);
      }
   }

   public static boolean a(gei $$0, awt<cuc> $$1) {
      for (ja<cuc> $$2 : lh.h.c($$1)) {
         if ($$0.j().a(avz.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
