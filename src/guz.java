public class guz implements gvb {
   private static final int a = 600;
   private static final xp b = xp.c("tutorial.punch_tree.title");
   private static final xp c = xp.a("tutorial.punch_tree.description", gva.a("attack"));
   private final gva d;
   private fjr e;
   private int f;
   private int g;

   public guz(gva $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvc.f);
      } else {
         if (this.f == 1) {
            gcs $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.gc().a(awy.r)) {
                  this.d.a(gvc.e);
                  return;
               }

               if (guw.a($$0)) {
                  this.d.a(gvc.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fjr(fjr.a.c, b, c, true);
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
   public void a(fxx $$0, iz $$1, dse $$2, float $$3) {
      boolean $$4 = $$2.a(awp.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gvc.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cur $$0) {
      if ($$0.a(awy.r)) {
         this.d.a(gvc.e);
      }
   }
}
