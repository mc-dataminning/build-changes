public class fwn extends fvj<ced> {
   private static final agg a = new agg("textures/entity/llama/spit.png");
   private final fhw<ced> f;

   public fwn(fvk.a $$0) {
      super($$0);
      this.f = new fhw<>($$0.a(fka.at));
   }

   public void a(ced $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ati.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ati.i($$2, $$0.O, $$0.dD())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eno $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gay.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agg a(ced $$0) {
      return a;
   }
}
