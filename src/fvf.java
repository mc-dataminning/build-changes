public class fvf extends ftg<cco> {
   private static final aex a = new aex("textures/entity/shulker/spark.png");
   private static final fom f = fom.i(a);
   private final fgv<cco> g;

   public fvf(fth.a $$0) {
      super($$0);
      this.g = new fgv<>($$0.a(fib.bf));
   }

   protected int a(cco $$0, gw $$1) {
      return 15;
   }

   public void a(cco $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      $$3.a();
      float $$6 = arx.j($$2, $$0.N, $$0.dB());
      float $$7 = arx.i($$2, $$0.O, $$0.dD());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(arx.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(arx.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(arx.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      elt $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      elt $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, fyv.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aex a(cco $$0) {
      return a;
   }
}
