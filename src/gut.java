public class gut implements guz {
   private static final int a = 1200;
   private static final xp b = xp.c("tutorial.craft_planks.title");
   private static final xp c = xp.c("tutorial.craft_planks.description");
   private final guy d;
   private fjp e;
   private int f;

   public gut(guy $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gva.f);
      } else {
         if (this.f == 1) {
            gcq $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gc().a(awy.b)) {
                  this.d.a(gva.f);
                  return;
               }

               if (a($$0, awy.b)) {
                  this.d.a(gva.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fjp(fjp.a.e, b, c, false);
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
   public void a(cup $$0) {
      if ($$0.a(awy.b)) {
         this.d.a(gva.f);
      }
   }

   public static boolean a(gcq $$0, axf<cuk> $$1) {
      for (ji<cuk> $$2 : lp.h.c($$1)) {
         if ($$0.j().a(awk.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
