public class guv implements gvb {
   private static final int a = 1200;
   private static final xp b = xp.c("tutorial.craft_planks.title");
   private static final xp c = xp.c("tutorial.craft_planks.description");
   private final gva d;
   private fjr e;
   private int f;

   public guv(gva $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvc.f);
      } else {
         if (this.f == 1) {
            gcs $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gc().a(awy.b)) {
                  this.d.a(gvc.f);
                  return;
               }

               if (a($$0, awy.b)) {
                  this.d.a(gvc.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fjr(fjr.a.e, b, c, false);
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
   public void a(cur $$0) {
      if ($$0.a(awy.b)) {
         this.d.a(gvc.f);
      }
   }

   public static boolean a(gcs $$0, axf<cum> $$1) {
      for (ji<cum> $$2 : lp.h.c($$1)) {
         if ($$0.j().a(awk.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
