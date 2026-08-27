public class ghp extends gfq<ckv> {
   private static final ajv a = new ajv("textures/entity/shulker/spark.png");
   private static final gaq f = gaq.i(a);
   private final fsn<ckv> g;

   public ghp(gfr.a $$0) {
      super($$0);
      this.g = new fsn<>($$0.a(ftu.bl));
   }

   protected int a(ckv $$0, id $$1) {
      return 15;
   }

   public void a(ckv $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      $$3.a();
      float $$6 = axm.j($$2, $$0.N, $$0.dC());
      float $$7 = axm.i($$2, $$0.O, $$0.dE());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(axm.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(axm.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(axm.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      ewv $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      ewv $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, glj.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajv a(ckv $$0) {
      return a;
   }
}
