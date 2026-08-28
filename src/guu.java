public class guu implements gva {
   private static final int a = 1200;
   private static final xp b = xp.c("tutorial.craft_planks.title");
   private static final xp c = xp.c("tutorial.craft_planks.description");
   private final guz d;
   private fjq e;
   private int f;

   public guu(guz $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvb.f);
      } else {
         if (this.f == 1) {
            gcr $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gc().a(awy.b)) {
                  this.d.a(gvb.f);
                  return;
               }

               if (a($$0, awy.b)) {
                  this.d.a(gvb.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fjq(fjq.a.e, b, c, false);
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
   public void a(cuq $$0) {
      if ($$0.a(awy.b)) {
         this.d.a(gvb.f);
      }
   }

   public static boolean a(gcr $$0, axf<cul> $$1) {
      for (ji<cul> $$2 : lp.h.c($$1)) {
         if ($$0.j().a(awk.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
