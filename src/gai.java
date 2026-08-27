public class gai extends fzs<bys, flk<bys>> {
   private static final ahg a = new ahg("textures/entity/fish/salmon.png");

   public gai(fym.a $$0) {
      super($$0, new flk<>($$0.a(fmv.bd)), 0.4F);
   }

   public ahg a(bys $$0) {
      return a;
   }

   protected void a(bys $$0, eqa $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 1.0F;
      float $$6 = 1.0F;
      if (!$$0.aZ()) {
         $$5 = 1.3F;
         $$6 = 1.7F;
      }

      float $$7 = $$5 * 4.3F * aun.a($$6 * 0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$7));
      $$1.a(0.0F, 0.0F, -0.4F);
      if (!$$0.aZ()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
