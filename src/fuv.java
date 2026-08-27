public class fuv extends fsw<ccg> {
   private static final aer a = new aer("textures/entity/shulker/spark.png");
   private static final foc f = foc.i(a);
   private final fgl<ccg> g;

   public fuv(fsx.a $$0) {
      super($$0);
      this.g = new fgl<>($$0.a(fhr.bf));
   }

   protected int a(ccg $$0, gu $$1) {
      return 15;
   }

   public void a(ccg $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      $$3.a();
      float $$6 = arp.j($$2, $$0.N, $$0.dA());
      float $$7 = arp.i($$2, $$0.O, $$0.dC());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(arp.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(arp.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(arp.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      elj $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      elj $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, fyl.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aer a(ccg $$0) {
      return a;
   }
}
