public class fvj extends fsw<ccq> {
   public static final aer a = new aer("textures/entity/trident.png");
   private final fgy f;

   public fvj(fsx.a $$0) {
      super($$0);
      this.f = new fgy($$0.a(fhr.bC));
   }

   public void a(ccq $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(arp.i($$2, $$0.N, $$0.dA()) - 90.0F));
      $$3.a(a.f.rotationDegrees(arp.i($$2, $$0.O, $$0.dC()) + 90.0F));
      elj $$6 = ftv.c($$4, this.f.a(this.a($$0)), false, $$0.z());
      this.f.a($$3, $$6, $$5, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aer a(ccq $$0) {
      return a;
   }
}
