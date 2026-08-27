public class fyz extends fxd<bxu, fkf<bxu>> {
   private static final agi a = new agi("textures/entity/wolf/wolf.png");
   private static final agi i = new agi("textures/entity/wolf/wolf_tame.png");
   private static final agi j = new agi("textures/entity/wolf/wolf_angry.png");

   public fyz(fvx.a $$0) {
      super($$0, new fkf<>($$0.a(fkn.bV)), 0.5F);
      this.a(new gau(this));
   }

   protected float a(bxu $$0, float $$1) {
      return $$0.gn();
   }

   public void a(bxu $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      if ($$0.gm()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gm()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public agi a(bxu $$0) {
      if ($$0.u()) {
         return i;
      } else {
         return $$0.Z_() ? j : a;
      }
   }
}
