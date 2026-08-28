public class gvd implements gvf {
   private static final int a = 600;
   private static final wu b = wu.c("tutorial.punch_tree.title");
   private static final wu c = wu.a("tutorial.punch_tree.description", gve.a("attack"));
   private final gve d;
   private fjx e;
   private int f;
   private int g;

   public gvd(gve $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(gvg.f);
      } else {
         if (this.f == 1) {
            gcz $$0 = this.d.e().s;
            if ($$0 != null) {
               if ($$0.fY().a(awd.r)) {
                  this.d.a(gvg.e);
                  return;
               }

               if (gva.a($$0)) {
                  this.d.a(gvg.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fjx(fjx.a.c, b, c, true);
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
   public void a(fyd $$0, ja $$1, dsh $$2, float $$3) {
      boolean $$4 = $$2.a(avu.t);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(gvg.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cua $$0) {
      if ($$0.a(awd.r)) {
         this.d.a(gvg.e);
      }
   }
}
