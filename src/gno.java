public class gno implements gnu {
   private static final int a = 1200;
   private static final vs b = vs.c("tutorial.craft_planks.title");
   private static final vs c = vs.c("tutorial.craft_planks.description");
   private final gnt d;
   private fcv e;
   private int f;

   public gno(gnt $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gnv.f);
      } else {
         if (this.f == 1) {
            fvs $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fV().a(aum.b)) {
                  this.d.a(gnv.f);
                  return;
               }

               if (a($$0, aum.b)) {
                  this.d.a(gnv.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fcv(fcv.a.e, b, c, false);
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
   public void a(cpq $$0) {
      if ($$0.a(aum.b)) {
         this.d.a(gnv.f);
      }
   }

   public static boolean a(fvs $$0, aut<cpl> $$1) {
      for (il<cpl> $$2 : kh.h.c($$1)) {
         if ($$0.j().a(atz.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
