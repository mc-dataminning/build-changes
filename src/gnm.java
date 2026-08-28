public class gnm extends gnf<cgs, gty, fxo> {
   private static final ali a = ali.b("textures/entity/bee/bee_angry.png");
   private static final ali b = ali.b("textures/entity/bee/bee_angry_nectar.png");
   private static final ali k = ali.b("textures/entity/bee/bee.png");
   private static final ali l = ali.b("textures/entity/bee/bee_nectar.png");

   public gnm(gok.a $$0) {
      super($$0, new fxo($$0.a(gbl.q)), new fxo($$0.a(gbl.r)), 0.4F);
   }

   public ali a(gty $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gty a() {
      return new gty();
   }

   public void a(cgs $$0, gty $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gH();
      $$1.c = $$0.aK() && $$0.dA().h() < 1.0E-7;
      $$1.d = $$0.ae_();
      $$1.e = $$0.gG();
   }
}
