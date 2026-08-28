public class gzf extends gxu<byl, hez> {
   private static final float a = 40.0F;
   private static final int g = 50;
   private final hhg h;
   private final bai i = bai.a();

   protected gzf(gxv.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public hez a() {
      return new hez();
   }

   public void a(byl $$0, hez $$1, float $$2) {
      super.a($$0, $$1, $$2);
      dak $$3 = $$0.f();
      $$1.a($$0, $$3, this.h);
   }

   public void a(hez $$0, fld $$1, grn $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.v <= 50.0F) {
            float $$4 = Math.min($$0.v, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = azz.h($$0.v * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gyr.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
