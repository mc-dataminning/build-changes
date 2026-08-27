public class gen implements gep {
   private static final int a = 600;
   private static final ti b = ti.c("tutorial.punch_tree.title");
   private static final ti c = ti.a("tutorial.punch_tree.description", geo.a("attack"));
   private final geo d;
   private euu e;
   private int f;
   private int g;

   public gen(geo $$0) {
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
               if ($$0.fQ().a(apw.r)) {
                  this.d.a(geq.e);
                  return;
               }

               if (gek.a($$0)) {
                  this.d.a(geq.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new euu(euu.a.c, b, c, true);
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
   public void a(fis $$0, gw $$1, dfe $$2, float $$3) {
      boolean $$4 = $$2.a(apo.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(geq.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cja $$0) {
      if ($$0.a(apw.r)) {
         this.d.a(geq.e);
      }
   }
}
