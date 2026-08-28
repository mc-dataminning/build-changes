public class gvf implements gvl {
   private static final int a = 1200;
   private static final wu b = wu.c("tutorial.craft_planks.title");
   private static final wu c = wu.c("tutorial.craft_planks.description");
   private final gvk d;
   private fkd e;
   private int f;

   public gvf(gvk $$0) {
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
               if ($$0.fZ().a(awf.b)) {
                  this.d.a(gvm.f);
                  return;
               }

               if (a($$0, awf.b)) {
                  this.d.a(gvm.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fkd(fkd.a.e, b, c, false);
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
   public void a(cuc $$0) {
      if ($$0.a(awf.b)) {
         this.d.a(gvm.f);
      }
   }

   public static boolean a(gdf $$0, awm<ctx> $$1) {
      for (jj<ctx> $$2 : lq.g.c($$1)) {
         if ($$0.j().a(avr.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
