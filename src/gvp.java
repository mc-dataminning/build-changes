public class gvp extends gue<bwx, hbf> {
   private static final float a = 40.0F;
   private static final int g = 50;
   private final hdl h;
   private final azs i = azs.a();

   protected gvp(guf.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public hbf a() {
      return new hbf();
   }

   public void a(bwx $$0, hbf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cxy $$3 = $$0.g();
      $$1.a($$0, $$3, this.h);
   }

   public void a(hbf $$0, fho $$1, gny $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.u <= 50.0F) {
            float $$4 = Math.min($$0.u, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = azk.h($$0.u * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gvb.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
