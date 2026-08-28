public class guz implements gvf {
   private static final int a = 1200;
   private static final wu b = wu.c("tutorial.craft_planks.title");
   private static final wu c = wu.c("tutorial.craft_planks.description");
   private final gve d;
   private fjx e;
   private int f;

   public guz(gve $$0) {
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
               if ($$0.fY().a(awd.b)) {
                  this.d.a(gvg.f);
                  return;
               }

               if (a($$0, awd.b)) {
                  this.d.a(gvg.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fjx(fjx.a.e, b, c, false);
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
   public void a(cua $$0) {
      if ($$0.a(awd.b)) {
         this.d.a(gvg.f);
      }
   }

   public static boolean a(gcz $$0, awk<ctv> $$1) {
      for (jj<ctv> $$2 : lq.g.c($$1)) {
         if ($$0.j().a(avp.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
