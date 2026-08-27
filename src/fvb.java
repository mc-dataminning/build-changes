public class fvb extends ftc<ccu> {
   private static final aez a = new aez("textures/entity/shulker/spark.png");
   private static final foi f = foi.i(a);
   private final fgq<ccu> g;

   public fvb(ftd.a $$0) {
      super($$0);
      this.g = new fgq<>($$0.a(fhw.bf));
   }

   protected int a(ccu $$0, gw $$1) {
      return 15;
   }

   public void a(ccu $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      $$3.a();
      float $$6 = asb.j($$2, $$0.N, $$0.dB());
      float $$7 = asb.i($$2, $$0.O, $$0.dD());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(asb.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(asb.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(asb.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      eln $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, fyr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      eln $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, fyr.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aez a(ccu $$0) {
      return a;
   }
}
