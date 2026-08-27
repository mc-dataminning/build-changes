public class glb extends glz<cix, fwd<cix>> {
   private static final akt a = new akt("textures/entity/zombie/zombie.png");
   private final float b;

   public glb(gkq.a $$0, float $$1) {
      super($$0, new fvv($$0.a(fyr.ak)), 0.5F * $$1);
      this.b = $$1;
      this.a(new goy<>(this, $$0.d()));
      this.a(new gov<>(this, new fvv($$0.a(fyr.al)), new fvv($$0.a(fyr.am)), $$0.g()));
   }

   protected void a(cix $$0, fbc $$1, float $$2) {
      $$1.b(this.b, this.b, this.b);
   }

   public akt a(cix $$0) {
      return a;
   }
}
