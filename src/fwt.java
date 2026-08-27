public class fwt extends fvj<bwu, ffp<bwu>> {
   private final ffp<bwu> a = this.a();
   private final ffp<bwu> i;
   private static final afw j = new afw("textures/entity/fish/tropical_a.png");
   private static final afw k = new afw("textures/entity/fish/tropical_b.png");

   public fwt(fud.a $$0) {
      super($$0, new fid<>($$0.a(fiv.bF)), 0.15F);
      this.i = new fie<>($$0.a(fiv.bD));
      this.a(new fyv(this, $$0.f()));
   }

   public afw a(bwu $$0) {
      return switch ($$0.gp().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bwu $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      ffp<bwu> $$6 = switch ($$0.gp().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gn().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bwu $$0, emh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * asy.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
