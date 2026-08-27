public class fvh extends fti<ccq> {
   private static final aey a = new aey("textures/entity/shulker/spark.png");
   private static final foo f = foo.i(a);
   private final fgx<ccq> g;

   public fvh(ftj.a $$0) {
      super($$0);
      this.g = new fgx<>($$0.a(fid.bf));
   }

   protected int a(ccq $$0, gw $$1) {
      return 15;
   }

   public void a(ccq $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      $$3.a();
      float $$6 = ary.j($$2, $$0.N, $$0.dB());
      float $$7 = ary.i($$2, $$0.O, $$0.dD());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ary.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(ary.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(ary.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      elv $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, fyx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      elv $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, fyx.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aey a(ccq $$0) {
      return a;
   }
}
