public class gbp extends fzs<bza, fmn<bza>> {
   private static final ahg a = new ahg("textures/entity/wolf/wolf.png");
   private static final ahg i = new ahg("textures/entity/wolf/wolf_tame.png");
   private static final ahg j = new ahg("textures/entity/wolf/wolf_angry.png");

   public gbp(fym.a $$0) {
      super($$0, new fmn<>($$0.a(fmv.bZ)), 0.5F);
      this.a(new gdm(this));
   }

   protected float a(bza $$0, float $$1) {
      return $$0.gm();
   }

   public void a(bza $$0, float $$1, float $$2, eqa $$3, ftg $$4, int $$5) {
      if ($$0.gl()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gl()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public ahg a(bza $$0) {
      if ($$0.u()) {
         return i;
      } else {
         return $$0.aa_() ? j : a;
      }
   }
}
