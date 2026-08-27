public class fwe extends fun<cay, fhp<cay>> {
   private static final aew a = new aew("textures/entity/warden/warden.png");
   private static final aew i = new aew("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final aew j = new aew("textures/entity/warden/warden_heart.png");
   private static final aew k = new aew("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final aew l = new aew("textures/entity/warden/warden_pulsating_spots_2.png");

   public fwe(fth.a $$0) {
      super($$0, new fhp<>($$0.a(fib.bL)), 0.9F);
      this.a(new fyb<>(this, i, ($$0x, $$1, $$2) -> 1.0F, fhp::e));
      this.a(new fyb<>(this, k, ($$0x, $$1, $$2) -> Math.max(0.0F, arw.b($$2 * 0.045F) * 0.25F), fhp::f));
      this.a(new fyb<>(this, l, ($$0x, $$1, $$2) -> Math.max(0.0F, arw.b($$2 * 0.045F + (float) Math.PI) * 0.25F), fhp::f));
      this.a(new fyb<>(this, a, ($$0x, $$1, $$2) -> $$0x.E($$1), fhp::c));
      this.a(new fyb<>(this, j, ($$0x, $$1, $$2) -> $$0x.F($$1), fhp::d));
   }

   public aew a(cay $$0) {
      return a;
   }
}
