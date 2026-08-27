public class fva extends fsn<ccr> {
   public static final aer a = new aer("textures/entity/trident.png");
   private final fgt f;

   public fva(fso.a $$0) {
      super($$0);
      this.f = new fgt($$0.a(fhm.bC));
   }

   public void a(ccr $$0, float $$1, float $$2, elg $$3, fnl $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(arp.i($$2, $$0.N, $$0.dA()) - 90.0F));
      $$3.a(a.f.rotationDegrees(arp.i($$2, $$0.O, $$0.dC()) + 90.0F));
      elk $$6 = ftm.c($$4, this.f.a(this.a($$0)), false, $$0.z());
      this.f.a($$3, $$6, $$5, fyc.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aer a(ccr $$0) {
      return a;
   }
}
