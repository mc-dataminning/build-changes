public class gkj extends glf {
   public static final akt a = new akt("textures/entity/guardian_elder.png");
   public static final akt b = new akt("textures/entity/plaguewhale.png");

   public gkj(gkq.a $$0, fyq $$1) {
      super($$0, 1.2F, $$1);
   }

   protected void a(ciy $$0, fbc $$1, float $$2) {
      $$1.b(cir.b, cir.b, cir.b);
   }

   @Override
   public akt a(ciy $$0) {
      return $$0.gz() ? b : a;
   }
}
