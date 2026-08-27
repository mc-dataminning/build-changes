public class geo implements geq {
   private static final int a = 600;
   private static final tl b = tl.c("tutorial.punch_tree.title");
   private static final tl c = tl.a("tutorial.punch_tree.description", gep.a("attack"));
   private final gep d;
   private euu e;
   private int f;
   private int g;

   public geo(gep $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(ger.f);
      } else {
         if (this.f == 1) {
            fnc $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fS().a(aqd.r)) {
                  this.d.a(ger.e);
                  return;
               }

               if (gel.a($$0)) {
                  this.d.a(ger.e);
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
   public void a(fis $$0, gw $$1, dfd $$2, float $$3) {
      boolean $$4 = $$2.a(apv.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(ger.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cjl $$0) {
      if ($$0.a(aqd.r)) {
         this.d.a(ger.e);
      }
   }
}
