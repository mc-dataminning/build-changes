public class gbw extends gas<chy> {
   private static final aiy a = new aiy("textures/entity/llama/spit.png");
   private final fmv<chy> f;

   public gbw(gat.a $$0) {
      super($$0);
      this.f = new fmv<>($$0.a(fpb.av));
   }

   public void a(chy $$0, float $$1, float $$2, esa $$3, fvm $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(awh.i($$2, $$0.M, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(awh.i($$2, $$0.N, $$0.dE())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      ese $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, ggl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(chy $$0) {
      return a;
   }
}
