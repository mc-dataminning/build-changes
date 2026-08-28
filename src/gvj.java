public class gvj implements gvl {
   private static final int a = 600;
   private static final wu b = wu.c("tutorial.punch_tree.title");
   private static final wu c = wu.a("tutorial.punch_tree.description", gvk.a("attack"));
   private final gvk d;
   private fkd e;
   private int f;
   private int g;

   public gvj(gvk $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvm.f);
      } else {
         if (this.f == 1) {
            gdf $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fZ().a(awf.r)) {
                  this.d.a(gvm.e);
                  return;
               }

               if (gvg.a($$0)) {
                  this.d.a(gvm.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fkd(fkd.a.c, b, c, true);
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
   public void a(fyj $$0, ja $$1, dsk $$2, float $$3) {
      boolean $$4 = $$2.a(avw.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gvm.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cuc $$0) {
      if ($$0.a(awf.r)) {
         this.d.a(gvm.e);
      }
   }
}
