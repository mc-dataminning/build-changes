public class fuk extends ftg<ccl> {
   private static final aex a = new aex("textures/entity/llama/spit.png");
   private final ffx<ccl> f;

   public fuk(fth.a $$0) {
      super($$0);
      this.f = new ffx<>($$0.a(fib.at));
   }

   public void a(ccl $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(arx.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(arx.i($$2, $$0.O, $$0.dD())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      elt $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aex a(ccl $$0) {
      return a;
   }
}
