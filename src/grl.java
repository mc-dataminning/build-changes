public class grl implements grn {
   private static final int a = 600;
   private static final wi b = wi.c("tutorial.punch_tree.title");
   private static final wi c = wi.a("tutorial.punch_tree.description", grm.a("attack"));
   private final grm d;
   private fgj e;
   private int f;
   private int g;

   public grl(grm $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gro.f);
      } else {
         if (this.f == 1) {
            fzk $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(avm.r)) {
                  this.d.a(gro.e);
                  return;
               }

               if (gri.a($$0)) {
                  this.d.a(gro.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fgj(fgj.a.c, b, c, true);
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
   public void a(fuq $$0, id $$1, dpi $$2, float $$3) {
      boolean $$4 = $$2.a(ave.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gro.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(crs $$0) {
      if ($$0.a(avm.r)) {
         this.d.a(gro.e);
      }
   }
}
