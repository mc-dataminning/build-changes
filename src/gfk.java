public class gfk implements gfq {
   private static final int a = 1200;
   private static final ui b = ui.c("tutorial.craft_planks.title");
   private static final ui c = ui.c("tutorial.craft_planks.description");
   private final gfp d;
   private evt e;
   private int f;

   public gfk(gfp $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gfr.f);
      } else {
         if (this.f == 1) {
            foc $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(ara.b)) {
                  this.d.a(gfr.f);
                  return;
               }

               if (a($$0, ara.b)) {
                  this.d.a(gfr.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new evt(evt.a.e, b, c, false);
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
   public void a(ckj $$0) {
      if ($$0.a(ara.b)) {
         this.d.a(gfr.f);
      }
   }

   public static boolean a(foc $$0, arh<cke> $$1) {
      for (ib<cke> $$2 : jy.i.c($$1)) {
         if ($$0.j().a(aqn.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
