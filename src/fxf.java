public class fxf extends fvj<bwx, fin<bwx>> {
   private static final afw a = new afw("textures/entity/wolf/wolf.png");
   private static final afw i = new afw("textures/entity/wolf/wolf_tame.png");
   private static final afw j = new afw("textures/entity/wolf/wolf_angry.png");

   public fxf(fud.a $$0) {
      super($$0, new fin<>($$0.a(fiv.bV)), 0.5F);
      this.a(new fza(this));
   }

   protected float a(bwx $$0, float $$1) {
      return $$0.gm();
   }

   public void a(bwx $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      if ($$0.gl()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gl()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public afw a(bwx $$0) {
      if ($$0.s()) {
         return i;
      } else {
         return $$0.Y_() ? j : a;
      }
   }
}
