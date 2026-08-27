public class gby extends fyz<cgv> {
   private static final ahh a = new ahh("textures/entity/projectiles/wind_charge.png");
   private final fmx f;

   public gby(fza.a $$0) {
      super($$0);
      this.f = new fmx($$0.a(fni.bP));
   }

   public void a(cgv $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      float $$6 = (float)$$0.ah + $$2;
      eqo $$7 = $$4.getBuffer(fub.a(a, this.a($$6) % 1.0F, 0.0F));
      this.f.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
      this.f.a($$3, $$7, $$5, ges.d, 1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public ahh a(cgv $$0) {
      return a;
   }
}
