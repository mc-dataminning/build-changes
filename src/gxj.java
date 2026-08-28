public class gxj extends gvy<bxi, hda> {
   private static final float a = 40.0F;
   private static final int g = 50;
   private final hfg h;
   private final azv i = azv.a();

   protected gxj(gvz.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public hda a() {
      return new hda();
   }

   public void a(bxi $$0, hda $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cyy $$3 = $$0.g();
      $$1.a($$0, $$3, this.h);
   }

   public void a(hda $$0, fjc $$1, gps $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.u <= 50.0F) {
            float $$4 = Math.min($$0.u, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = azm.h($$0.u * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gwv.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
