public class gbv extends gcw<cdk, fje<cdk>> {
   private static final float a = 1.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private final ahg d;
   private final fje<cdk> e;

   public gbv(gag<cdk, fje<cdk>> $$0, fmr $$1, ahg $$2) {
      super($$0);
      this.e = new fje<>($$1.a(fmu.o));
      this.d = $$2;
   }

   public void a(epz $$0, ftf $$1, int $$2, cdk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ah + $$6;
      this.e.a($$3, $$4, $$5, $$6);
      this.c().a(this.e);
      eqd $$11 = $$1.getBuffer(ftn.a(this.a($$3), this.a($$10) % 1.0F, 0.0F));
      this.e.a($$3, $$4, $$5, $$7, $$8, $$9);
      this.e.e().l = true;
      this.e.f().l = true;
      this.e.g().l = false;
      this.e.a().a($$0, $$11, $$2, gec.d, 1.0F, 1.0F, 1.0F, 1.0F);
      this.e.e().l = true;
      this.e.f().l = false;
      this.e.g().l = true;
      this.e.a().a($$0, $$11, $$2, gec.d, 1.0F, 1.0F, 1.0F, 1.0F);
      this.e.e().l = false;
      this.e.f().l = true;
      this.e.g().l = true;
      this.e.a().a($$0, $$11, $$2, gec.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }

   protected ahg a(cdk $$0) {
      return this.d;
   }
}
