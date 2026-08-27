public class fva extends ftb<ccj> {
   private static final aeu a = new aeu("textures/entity/shulker/spark.png");
   private static final foh f = foh.i(a);
   private final fgq<ccj> g;

   public fva(ftc.a $$0) {
      super($$0);
      this.g = new fgq<>($$0.a(fhw.bf));
   }

   protected int a(ccj $$0, gw $$1) {
      return 15;
   }

   public void a(ccj $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      $$3.a();
      float $$6 = ars.j($$2, $$0.N, $$0.dA());
      float $$7 = ars.i($$2, $$0.O, $$0.dC());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ars.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(ars.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(ars.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      elo $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, fyq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      elo $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, fyq.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aeu a(ccj $$0) {
      return a;
   }
}
