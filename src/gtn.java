public class gtn extends gsc<bvm, gze> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final hbl h;
   private final azh i = azh.a();

   protected gtn(gsd.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gze a() {
      return new gze();
   }

   public void a(bvm $$0, gze $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cwo $$3 = $$0.m();
      $$1.a($$0, $$3, this.h);
   }

   public void a(gze $$0, fft $$1, glx $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.u <= 50.0F) {
            float $$4 = Math.min($$0.u, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = ayz.h($$0.u * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gsz.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
