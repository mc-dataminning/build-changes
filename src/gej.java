public class gej implements gep {
   private static final int a = 1200;
   private static final ti b = ti.c("tutorial.craft_planks.title");
   private static final ti c = ti.c("tutorial.craft_planks.description");
   private final geo d;
   private euu e;
   private int f;

   public gej(geo $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(geq.f);
      } else {
         if (this.f == 1) {
            fnb $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fQ().a(apw.b)) {
                  this.d.a(geq.f);
                  return;
               }

               if (a($$0, apw.b)) {
                  this.d.a(geq.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new euu(euu.a.e, b, c, false);
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
   public void a(cja $$0) {
      if ($$0.a(apw.b)) {
         this.d.a(geq.f);
      }
   }

   public static boolean a(fnb $$0, aqd<civ> $$1) {
      for (hg<civ> $$2 : jd.i.c($$1)) {
         if ($$0.j().a(apj.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
