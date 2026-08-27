public class gjp implements gjv {
   private static final int a = 1200;
   private static final vd b = vd.c("tutorial.craft_planks.title");
   private static final vd c = vd.c("tutorial.craft_planks.description");
   private final gju d;
   private ezi e;
   private int f;

   public gjp(gju $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gjw.f);
      } else {
         if (this.f == 1) {
            fsb $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(asj.b)) {
                  this.d.a(gjw.f);
                  return;
               }

               if (a($$0, asj.b)) {
                  this.d.a(gjw.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new ezi(ezi.a.e, b, c, false);
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
   public void a(cmr $$0) {
      if ($$0.a(asj.b)) {
         this.d.a(gjw.f);
      }
   }

   public static boolean a(fsb $$0, asq<cmm> $$1) {
      for (ih<cmm> $$2 : kd.h.c($$1)) {
         if ($$0.j().a(arw.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
