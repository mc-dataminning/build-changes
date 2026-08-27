public class gbv extends gcg<caj, fmx<caj>> {
   private static final aiy a = new aiy("textures/entity/iron_golem/iron_golem.png");

   public gbv(gba.a $$0) {
      super($$0, new fmx<>($$0.a(fpi.ar)), 0.7F);
      this.a(new gfc(this));
      this.a(new gfd(this, $$0.c()));
   }

   public aiy a(caj $$0) {
      return a;
   }

   protected void a(caj $$0, esh $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!((double)$$0.aQ.a() < 0.01)) {
         float $$6 = 13.0F;
         float $$7 = $$0.aQ.c($$4) + 6.0F;
         float $$8 = (Math.abs($$7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$8));
      }
   }
}
