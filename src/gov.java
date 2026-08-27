public class gov implements gox {
   private static final int a = 600;
   private static final vu b = vu.c("tutorial.punch_tree.title");
   private static final vu c = vu.a("tutorial.punch_tree.description", gow.a("attack"));
   private final gow d;
   private fdt e;
   private int f;
   private int g;

   public gov(gow $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(goy.f);
      } else {
         if (this.f == 1) {
            fwu $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(auv.r)) {
                  this.d.a(goy.e);
                  return;
               }

               if (gos.a($$0)) {
                  this.d.a(goy.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fdt(fdt.a.c, b, c, true);
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
   public void a(fsa $$0, ib $$1, dnb $$2, float $$3) {
      boolean $$4 = $$2.a(aun.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(goy.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cqm $$0) {
      if ($$0.a(auv.r)) {
         this.d.a(goy.e);
      }
   }
}
