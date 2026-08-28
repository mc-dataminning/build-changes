public class gzu extends gyj<byc, hfm> {
   private static final float a = 40.0F;
   private static final int g = 50;
   private final hhs h;
   private final azz i = azz.a();

   protected gzu(gyk.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public hfm a() {
      return new hfm();
   }

   public void a(byc $$0, hfm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      daa $$3 = $$0.g();
      $$1.a($$0, $$3, this.h);
   }

   public void a(hfm $$0, flq $$1, gsc $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.u <= 50.0F) {
            float $$4 = Math.min($$0.u, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = azq.h($$0.u * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gzg.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
