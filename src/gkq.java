public class gkq implements gkw {
   private static final int a = 1200;
   private static final vg b = vg.c("tutorial.craft_planks.title");
   private static final vg c = vg.c("tutorial.craft_planks.description");
   private final gkv d;
   private fab e;
   private int f;

   public gkq(gkv $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gkx.f);
      } else {
         if (this.f == 1) {
            fsv $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(asq.b)) {
                  this.d.a(gkx.f);
                  return;
               }

               if (a($$0, asq.b)) {
                  this.d.a(gkx.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fab(fab.a.e, b, c, false);
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
   public void a(cng $$0) {
      if ($$0.a(asq.b)) {
         this.d.a(gkx.f);
      }
   }

   public static boolean a(fsv $$0, asx<cnb> $$1) {
      for (ih<cnb> $$2 : kd.h.c($$1)) {
         if ($$0.j().a(asd.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
