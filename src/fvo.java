public class fvo extends ftb<cct> {
   public static final aeu a = new aeu("textures/entity/trident.png");
   private final fhd f;

   public fvo(ftc.a $$0) {
      super($$0);
      this.f = new fhd($$0.a(fhw.bC));
   }

   public void a(cct $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ars.i($$2, $$0.N, $$0.dA()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ars.i($$2, $$0.O, $$0.dC()) + 90.0F));
      elo $$6 = fua.c($$4, this.f.a(this.a($$0)), false, $$0.z());
      this.f.a($$3, $$6, $$5, fyq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aeu a(cct $$0) {
      return a;
   }
}
