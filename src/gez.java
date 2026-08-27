public class gez extends gda<cjp> {
   private static final ajh a = new ajh("textures/entity/shulker/spark.png");
   private static final fya f = fya.i(a);
   private final fpx<cjp> g;

   public gez(gdb.a $$0) {
      super($$0);
      this.g = new fpx<>($$0.a(fre.bl));
   }

   protected int a(cjp $$0, ib $$1) {
      return 15;
   }

   public void a(cjp $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      $$3.a();
      float $$6 = aww.j($$2, $$0.N, $$0.dC());
      float $$7 = aww.i($$2, $$0.O, $$0.dE());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aww.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(aww.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(aww.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      euf $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, git.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      euf $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, git.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajh a(cjp $$0) {
      return a;
   }
}
