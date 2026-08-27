public class fya extends fwb<cet> {
   private static final agm a = new agm("textures/entity/shulker/spark.png");
   private static final frh f = frh.i(a);
   private final fjm<cet> g;

   public fya(fwc.a $$0) {
      super($$0);
      this.g = new fjm<>($$0.a(fks.bf));
   }

   protected int a(cet $$0, hx $$1) {
      return 15;
   }

   public void a(cet $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      $$3.a();
      float $$6 = atq.j($$2, $$0.N, $$0.dD());
      float $$7 = atq.i($$2, $$0.O, $$0.dF());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(atq.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(atq.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(atq.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      eof $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gbq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      eof $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gbq.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agm a(cet $$0) {
      return a;
   }
}
