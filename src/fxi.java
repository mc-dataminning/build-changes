public class fxi extends fvj<ceg> {
   private static final agg a = new agg("textures/entity/shulker/spark.png");
   private static final fqp f = fqp.i(a);
   private final fiu<ceg> g;

   public fxi(fvk.a $$0) {
      super($$0);
      this.g = new fiu<>($$0.a(fka.bf));
   }

   protected int a(ceg $$0, ht $$1) {
      return 15;
   }

   public void a(ceg $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      $$3.a();
      float $$6 = ati.j($$2, $$0.N, $$0.dB());
      float $$7 = ati.i($$2, $$0.O, $$0.dD());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ati.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(ati.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(ati.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      eno $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gay.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      eno $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gay.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agg a(ceg $$0) {
      return a;
   }
}
