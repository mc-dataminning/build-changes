public class gos implements gou {
   private static final int a = 600;
   private static final vu b = vu.c("tutorial.punch_tree.title");
   private static final vu c = vu.a("tutorial.punch_tree.description", got.a("attack"));
   private final got d;
   private fdr e;
   private int f;
   private int g;

   public gos(got $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gov.f);
      } else {
         if (this.f == 1) {
            fws $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(auv.r)) {
                  this.d.a(gov.e);
                  return;
               }

               if (gop.a($$0)) {
                  this.d.a(gov.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fdr(fdr.a.c, b, c, true);
            this.d.e().aA().a(this.e);
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
   public void a(fry $$0, ib $$1, dmz $$2, float $$3) {
      boolean $$4 = $$2.a(aun.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gov.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cqk $$0) {
      if ($$0.a(auv.r)) {
         this.d.a(gov.e);
      }
   }
}
