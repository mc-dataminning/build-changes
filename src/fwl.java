public class fwl extends fup<bvw, fhv<bvw>> {
   private static final aey a = new aey("textures/entity/wolf/wolf.png");
   private static final aey i = new aey("textures/entity/wolf/wolf_tame.png");
   private static final aey j = new aey("textures/entity/wolf/wolf_angry.png");

   public fwl(ftj.a $$0) {
      super($$0, new fhv<>($$0.a(fid.bV)), 0.5F);
      this.a(new fyg(this));
   }

   protected float a(bvw $$0, float $$1) {
      return $$0.gl();
   }

   public void a(bvw $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      if ($$0.gk()) {
         float $$6 = $$0.E($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gk()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public aey a(bvw $$0) {
      if ($$0.s()) {
         return i;
      } else {
         return $$0.X_() ? j : a;
      }
   }
}
