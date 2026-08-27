public class fwj extends fun<bvu, fht<bvu>> {
   private static final aex a = new aex("textures/entity/wolf/wolf.png");
   private static final aex i = new aex("textures/entity/wolf/wolf_tame.png");
   private static final aex j = new aex("textures/entity/wolf/wolf_angry.png");

   public fwj(fth.a $$0) {
      super($$0, new fht<>($$0.a(fib.bV)), 0.5F);
      this.a(new fye(this));
   }

   protected float a(bvu $$0, float $$1) {
      return $$0.gl();
   }

   public void a(bvu $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      if ($$0.gk()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gk()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public aex a(bvu $$0) {
      if ($$0.s()) {
         return i;
      } else {
         return $$0.X_() ? j : a;
      }
   }
}
