public class gor implements gox {
   private static final int a = 1200;
   private static final vu b = vu.c("tutorial.craft_planks.title");
   private static final vu c = vu.c("tutorial.craft_planks.description");
   private final gow d;
   private fdt e;
   private int f;

   public gor(gow $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(goy.f);
      } else {
         if (this.f == 1) {
            fwu $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(auv.b)) {
                  this.d.a(goy.f);
                  return;
               }

               if (a($$0, auv.b)) {
                  this.d.a(goy.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fdt(fdt.a.e, b, c, false);
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
   public void a(cqm $$0) {
      if ($$0.a(auv.b)) {
         this.d.a(goy.f);
      }
   }

   public static boolean a(fwu $$0, avd<cqh> $$1) {
      for (il<cqh> $$2 : ki.h.c($$1)) {
         if ($$0.j().a(aui.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
