public class fvq extends ftu<bvn, fhe<bvn>> {
   private static final aer a = new aer("textures/entity/wolf/wolf.png");
   private static final aer i = new aer("textures/entity/wolf/wolf_tame.png");
   private static final aer j = new aer("textures/entity/wolf/wolf_angry.png");

   public fvq(fso.a $$0) {
      super($$0, new fhe<>($$0.a(fhm.bV)), 0.5F);
      this.a(new fxl(this));
   }

   protected float a(bvn $$0, float $$1) {
      return $$0.gh();
   }

   public void a(bvn $$0, float $$1, float $$2, elg $$3, fnl $$4, int $$5) {
      if ($$0.gg()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gg()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public aer a(bvn $$0) {
      if ($$0.p()) {
         return i;
      } else {
         return $$0.S_() ? j : a;
      }
   }
}
