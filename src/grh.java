public class grh implements grn {
   private static final int a = 1200;
   private static final wi b = wi.c("tutorial.craft_planks.title");
   private static final wi c = wi.c("tutorial.craft_planks.description");
   private final grm d;
   private fgj e;
   private int f;

   public grh(grm $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gro.f);
      } else {
         if (this.f == 1) {
            fzk $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(avm.b)) {
                  this.d.a(gro.f);
                  return;
               }

               if (a($$0, avm.b)) {
                  this.d.a(gro.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fgj(fgj.a.e, b, c, false);
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
   public void a(crs $$0) {
      if ($$0.a(avm.b)) {
         this.d.a(gro.f);
      }
   }

   public static boolean a(fzk $$0, avt<crn> $$1) {
      for (in<crn> $$2 : kt.h.c($$1)) {
         if ($$0.j().a(auz.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
