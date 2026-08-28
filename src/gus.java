public class gus implements guu {
   private static final int a = 600;
   private static final xl b = xl.c("tutorial.punch_tree.title");
   private static final xl c = xl.a("tutorial.punch_tree.description", gut.a("attack"));
   private final gut d;
   private fjk e;
   private int f;
   private int g;

   public gus(gut $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(guv.f);
      } else {
         if (this.f == 1) {
            gcl $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gc().a(awu.r)) {
                  this.d.a(guv.e);
                  return;
               }

               if (gup.a($$0)) {
                  this.d.a(guv.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fjk(fjk.a.c, b, c, true);
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
   public void a(fxq $$0, iz $$1, drx $$2, float $$3) {
      boolean $$4 = $$2.a(awl.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(guv.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cuk $$0) {
      if ($$0.a(awu.r)) {
         this.d.a(guv.e);
      }
   }
}
