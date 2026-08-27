public class gkb implements gkh {
   private static final int a = 1200;
   private static final vf b = vf.c("tutorial.craft_planks.title");
   private static final vf c = vf.c("tutorial.craft_planks.description");
   private final gkg d;
   private ezp e;
   private int f;

   public gkb(gkg $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gki.f);
      } else {
         if (this.f == 1) {
            fsi $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(aso.b)) {
                  this.d.a(gki.f);
                  return;
               }

               if (a($$0, aso.b)) {
                  this.d.a(gki.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new ezp(ezp.a.e, b, c, false);
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
   public void a(cmx $$0) {
      if ($$0.a(aso.b)) {
         this.d.a(gki.f);
      }
   }

   public static boolean a(fsi $$0, asv<cms> $$1) {
      for (ih<cms> $$2 : kd.h.c($$1)) {
         if ($$0.j().a(asb.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
