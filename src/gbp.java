public class gbp extends gcq<cdf, fiy<cdf>> {
   private static final float a = 1.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private final ahd d;
   private final fiy<cdf> e;

   public gbp(gaa<cdf, fiy<cdf>> $$0, fml $$1, ahd $$2) {
      super($$0);
      this.e = new fiy<>($$1.a(fmo.o));
      this.d = $$2;
   }

   public void a(ept $$0, fsz $$1, int $$2, cdf $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ah + $$6;
      this.e.a($$3, $$4, $$5, $$6);
      this.c().a(this.e);
      epx $$11 = $$1.getBuffer(fth.a(this.a($$3), this.a($$10) % 1.0F, 0.0F));
      this.e.a($$3, $$4, $$5, $$7, $$8, $$9);
      this.e.e().l = true;
      this.e.f().l = true;
      this.e.g().l = false;
      this.e.a().a($$0, $$11, $$2, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
      this.e.e().l = true;
      this.e.f().l = false;
      this.e.g().l = true;
      this.e.a().a($$0, $$11, $$2, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
      this.e.e().l = false;
      this.e.f().l = true;
      this.e.g().l = true;
      this.e.a().a($$0, $$11, $$2, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }

   protected ahd a(cdf $$0) {
      return this.d;
   }
}
