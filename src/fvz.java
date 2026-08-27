public class fvz extends fup<bvt, fex<bvt>> {
   private final fex<bvt> a = this.a();
   private final fex<bvt> i;
   private static final aey j = new aey("textures/entity/fish/tropical_a.png");
   private static final aey k = new aey("textures/entity/fish/tropical_b.png");

   public fvz(ftj.a $$0) {
      super($$0, new fhl<>($$0.a(fid.bF)), 0.15F);
      this.i = new fhm<>($$0.a(fid.bD));
      this.a(new fyb(this, $$0.f()));
   }

   public aey a(bvt $$0) {
      return switch ($$0.go().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bvt $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      fex<bvt> $$6 = switch ($$0.go().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gm().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bvt $$0, elr $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * ary.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
