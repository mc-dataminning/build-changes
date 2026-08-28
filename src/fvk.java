public class fvk<T extends cfw> extends fvf<T> {
   private float j;

   public fvk(fwv $$0) {
      super($$0, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
   }

   public static fxb c() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      $$1.a("head", fxa.c().a(0, 0).a(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new fwz(0.6F)), fwx.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", fxa.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new fwz(1.75F)), fwx.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fxa $$2 = fxa.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new fwz(0.5F));
      $$1.a("right_hind_leg", $$2, fwx.a(-3.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, fwx.a(3.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$2, fwx.a(-3.0F, 12.0F, -5.0F));
      $$1.a("left_front_leg", $$2, fwx.a(3.0F, 12.0F, -5.0F));
      return fxb.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.c = 6.0F + $$0.G($$3) * 9.0F;
      this.j = $$0.H($$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a.e = this.j;
   }
}
