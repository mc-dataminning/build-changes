public class fwe extends fui<bvp, fho<bvp>> {
   private static final aeu a = new aeu("textures/entity/wolf/wolf.png");
   private static final aeu i = new aeu("textures/entity/wolf/wolf_tame.png");
   private static final aeu j = new aeu("textures/entity/wolf/wolf_angry.png");

   public fwe(ftc.a $$0) {
      super($$0, new fho<>($$0.a(fhw.bV)), 0.5F);
      this.a(new fxz(this));
   }

   protected float a(bvp $$0, float $$1) {
      return $$0.gi();
   }

   public void a(bvp $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      if ($$0.gh()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gh()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public aeu a(bvp $$0) {
      if ($$0.p()) {
         return i;
      } else {
         return $$0.S_() ? j : a;
      }
   }
}
