public class gmj implements gmp {
   private static final int a = 1200;
   private static final vq b = vq.c("tutorial.craft_planks.title");
   private static final vq c = vq.c("tutorial.craft_planks.description");
   private final gmo d;
   private fbs e;
   private int f;

   public gmj(gmo $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gmq.f);
      } else {
         if (this.f == 1) {
            fuo $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fT().a(auh.b)) {
                  this.d.a(gmq.f);
                  return;
               }

               if (a($$0, auh.b)) {
                  this.d.a(gmq.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fbs(fbs.a.e, b, c, false);
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
   public void a(coz $$0) {
      if ($$0.a(auh.b)) {
         this.d.a(gmq.f);
      }
   }

   public static boolean a(fuo $$0, auo<cou> $$1) {
      for (ij<cou> $$2 : kf.h.c($$1)) {
         if ($$0.j().a(atu.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
