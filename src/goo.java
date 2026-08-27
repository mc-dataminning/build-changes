public class goo implements gou {
   private static final int a = 1200;
   private static final vu b = vu.c("tutorial.craft_planks.title");
   private static final vu c = vu.c("tutorial.craft_planks.description");
   private final got d;
   private fdr e;
   private int f;

   public goo(got $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gov.f);
      } else {
         if (this.f == 1) {
            fws $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(auv.b)) {
                  this.d.a(gov.f);
                  return;
               }

               if (a($$0, auv.b)) {
                  this.d.a(gov.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fdr(fdr.a.e, b, c, false);
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
   public void a(cqk $$0) {
      if ($$0.a(auv.b)) {
         this.d.a(gov.f);
      }
   }

   public static boolean a(fws $$0, avd<cqf> $$1) {
      for (il<cqf> $$2 : ki.h.c($$1)) {
         if ($$0.j().a(aui.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
