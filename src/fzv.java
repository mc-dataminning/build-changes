public class fzv extends gag<byo, fky<byo>> {
   private static final ahh a = new ahh("textures/entity/iron_golem/iron_golem.png");

   public fzv(fza.a $$0) {
      super($$0, new fky<>($$0.a(fni.ar)), 0.7F);
      this.a(new gdc(this));
      this.a(new gdd(this, $$0.c()));
   }

   public ahh a(byo $$0) {
      return a;
   }

   protected void a(byo $$0, eqk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!((double)$$0.aQ.a() < 0.01)) {
         float $$5 = 13.0F;
         float $$6 = $$0.aQ.c($$4) + 6.0F;
         float $$7 = (Math.abs($$6 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         $$1.a(a.f.rotationDegrees(6.5F * $$7));
      }
   }
}
