public class gck extends gdl<cds, fjs<cds>> {
   private static final ahh a = new ahh("textures/entity/breeze/breeze_wind.png");
   private static final fjs<cds> b = new fjs<>(fjs.a(128, 128).a());

   public gck(gav<cds, fjs<cds>> $$0) {
      super($$0);
   }

   public void a(eqk $$0, ftt $$1, int $$2, cds $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ah + $$6;
      eqo $$11 = $$1.getBuffer(fub.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      fyg.a(b, b.e()).a($$0, $$11, $$2, ges.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
