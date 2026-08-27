public class gcd extends gaz<cic> {
   private static final aiy a = new aiy("textures/entity/llama/spit.png");
   private final fnc<cic> f;

   public gcd(gba.a $$0) {
      super($$0);
      this.f = new fnc<>($$0.a(fpi.av));
   }

   public void a(cic $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(awi.i($$2, $$0.M, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(awi.i($$2, $$0.N, $$0.dE())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      esl $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cic $$0) {
      return a;
   }
}
