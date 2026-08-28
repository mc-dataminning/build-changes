public class gnb extends gmu<cgn, gtn, fxd> {
   private static final alh a = alh.b("textures/entity/bee/bee_angry.png");
   private static final alh b = alh.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alh k = alh.b("textures/entity/bee/bee.png");
   private static final alh l = alh.b("textures/entity/bee/bee_nectar.png");

   public gnb(gnz.a $$0) {
      super($$0, new fxd($$0.a(gba.q)), new fxd($$0.a(gba.r)), 0.4F);
   }

   public alh a(gtn $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gtn a() {
      return new gtn();
   }

   public void a(cgn $$0, gtn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gI();
      $$1.c = $$0.aJ() && $$0.dA().h() < 1.0E-7;
      $$1.d = $$0.ae_();
      $$1.e = $$0.gH();
   }
}
