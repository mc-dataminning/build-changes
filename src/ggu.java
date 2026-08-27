public class ggu extends gfq<ckr> {
   private static final ajv a = new ajv("textures/entity/llama/spit.png");
   private final frp<ckr> f;

   public ggu(gfr.a $$0) {
      super($$0);
      this.f = new frp<>($$0.a(ftu.az));
   }

   public void a(ckr $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(axm.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(axm.i($$2, $$0.O, $$0.dE())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      ewv $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajv a(ckr $$0) {
      return a;
   }
}
