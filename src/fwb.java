public class fwb extends fuc<cdr> {
   private static final afw a = new afw("textures/entity/shulker/spark.png");
   private static final fpj f = fpj.i(a);
   private final fhp<cdr> g;

   public fwb(fud.a $$0) {
      super($$0);
      this.g = new fhp<>($$0.a(fiv.bf));
   }

   protected int a(cdr $$0, ht $$1) {
      return 15;
   }

   public void a(cdr $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      $$3.a();
      float $$6 = asy.j($$2, $$0.N, $$0.dB());
      float $$7 = asy.i($$2, $$0.O, $$0.dD());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(asy.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(asy.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(asy.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      eml $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, fzr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      eml $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, fzr.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public afw a(cdr $$0) {
      return a;
   }
}
