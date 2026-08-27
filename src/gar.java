public class gar extends fyu<byl, flp<byl>> {
   private static final agt a = new agt("textures/entity/wolf/wolf.png");
   private static final agt i = new agt("textures/entity/wolf/wolf_tame.png");
   private static final agt j = new agt("textures/entity/wolf/wolf_angry.png");

   public gar(fxo.a $$0) {
      super($$0, new flp<>($$0.a(flx.bZ)), 0.5F);
      this.a(new gco(this));
   }

   protected float a(byl $$0, float $$1) {
      return $$0.gm();
   }

   public void a(byl $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      if ($$0.gl()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gl()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public agt a(byl $$0) {
      if ($$0.u()) {
         return i;
      } else {
         return $$0.aa_() ? j : a;
      }
   }
}
