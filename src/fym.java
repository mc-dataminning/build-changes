public class fym extends fwq<bxm, fjs<bxm>> {
   private static final agg a = new agg("textures/entity/wolf/wolf.png");
   private static final agg i = new agg("textures/entity/wolf/wolf_tame.png");
   private static final agg j = new agg("textures/entity/wolf/wolf_angry.png");

   public fym(fvk.a $$0) {
      super($$0, new fjs<>($$0.a(fka.bV)), 0.5F);
      this.a(new gah(this));
   }

   protected float a(bxm $$0, float $$1) {
      return $$0.gm();
   }

   public void a(bxm $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      if ($$0.gl()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gl()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public agg a(bxm $$0) {
      if ($$0.s()) {
         return i;
      } else {
         return $$0.Y_() ? j : a;
      }
   }
}
