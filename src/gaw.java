public class gaw extends gag<byx, flx<byx>> {
   private static final ahh a = new ahh("textures/entity/fish/salmon.png");

   public gaw(fza.a $$0) {
      super($$0, new flx<>($$0.a(fni.bc)), 0.4F);
   }

   public ahh a(byx $$0) {
      return a;
   }

   protected void a(byx $$0, eqk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 1.0F;
      float $$6 = 1.0F;
      if (!$$0.aZ()) {
         $$5 = 1.3F;
         $$6 = 1.7F;
      }

      float $$7 = $$5 * 4.3F * aup.a($$6 * 0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, 0.0F, -0.4F);
      if (!$$0.aZ()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
