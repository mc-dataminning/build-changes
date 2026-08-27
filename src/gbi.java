public class gbi extends fzl<byv, fmg<byv>> {
   private static final ahd a = new ahd("textures/entity/wolf/wolf.png");
   private static final ahd i = new ahd("textures/entity/wolf/wolf_tame.png");
   private static final ahd j = new ahd("textures/entity/wolf/wolf_angry.png");

   public gbi(fyf.a $$0) {
      super($$0, new fmg<>($$0.a(fmo.bZ)), 0.5F);
      this.a(new gdf(this));
   }

   protected float a(byv $$0, float $$1) {
      return $$0.gm();
   }

   public void a(byv $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      if ($$0.gl()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gl()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public ahd a(byv $$0) {
      if ($$0.u()) {
         return i;
      } else {
         return $$0.aa_() ? j : a;
      }
   }
}
