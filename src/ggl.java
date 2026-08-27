public class ggl extends gfh<ckk> {
   private static final ajt a = new ajt("textures/entity/llama/spit.png");
   private final frg<ckk> f;

   public ggl(gfi.a $$0) {
      super($$0);
      this.f = new frg<>($$0.a(ftl.az));
   }

   public void a(ckk $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(axk.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(axk.i($$2, $$0.O, $$0.dE())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      ewm $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajt a(ckk $$0) {
      return a;
   }
}
