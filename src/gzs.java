public class gzs extends gyh<bya, hfk> {
   private static final float a = 40.0F;
   private static final int g = 50;
   private final hhq h;
   private final azx i = azx.a();

   protected gzs(gyi.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public hfk a() {
      return new hfk();
   }

   public void a(bya $$0, hfk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      czy $$3 = $$0.g();
      $$1.a($$0, $$3, this.h);
   }

   public void a(hfk $$0, flo $$1, gsa $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.u <= 50.0F) {
            float $$4 = Math.min($$0.u, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = azo.h($$0.u * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gze.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
