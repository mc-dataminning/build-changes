public class gsh implements gsj {
   private static final int a = 600;
   private static final ws b = ws.c("tutorial.punch_tree.title");
   private static final ws c = ws.a("tutorial.punch_tree.description", gsi.a("attack"));
   private final gsi d;
   private fhf e;
   private int f;
   private int g;

   public gsh(gsi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gsk.f);
      } else {
         if (this.f == 1) {
            gag $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.ga().a(avw.r)) {
                  this.d.a(gsk.e);
                  return;
               }

               if (gse.a($$0)) {
                  this.d.a(gsk.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fhf(fhf.a.c, b, c, true);
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
   public void a(fvm $$0, im $$1, dpy $$2, float $$3) {
      boolean $$4 = $$2.a(avo.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gsk.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(csd $$0) {
      if ($$0.a(avw.r)) {
         this.d.a(gsk.e);
      }
   }
}
