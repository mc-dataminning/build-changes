public class gso implements gsu {
   private static final int a = 1200;
   private static final wu b = wu.c("tutorial.craft_planks.title");
   private static final wu c = wu.c("tutorial.craft_planks.description");
   private final gst d;
   private fhp e;
   private int f;

   public gso(gst $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gsv.f);
      } else {
         if (this.f == 1) {
            gaq $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.ga().a(avz.b)) {
                  this.d.a(gsv.f);
                  return;
               }

               if (a($$0, avz.b)) {
                  this.d.a(gsv.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fhp(fhp.a.e, b, c, false);
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
   public void a(csz $$0) {
      if ($$0.a(avz.b)) {
         this.d.a(gsv.f);
      }
   }

   public static boolean a(gaq $$0, awg<csu> $$1) {
      for (iw<csu> $$2 : ld.h.c($$1)) {
         if ($$0.j().a(avm.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
