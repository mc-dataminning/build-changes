public class fvl extends ftp<bvl, fha<bvl>> {
   private static final aep a = new aep("textures/entity/wolf/wolf.png");
   private static final aep i = new aep("textures/entity/wolf/wolf_tame.png");
   private static final aep j = new aep("textures/entity/wolf/wolf_angry.png");

   public fvl(fsj.a $$0) {
      super($$0, new fha<>($$0.a(fhi.bV)), 0.5F);
      this.a(new fxg(this));
   }

   protected float a(bvl $$0, float $$1) {
      return $$0.gh();
   }

   public void a(bvl $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      if ($$0.gg()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gg()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public aep a(bvl $$0) {
      if ($$0.p()) {
         return i;
      } else {
         return $$0.S_() ? j : a;
      }
   }
}
