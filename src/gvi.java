public class gvi extends gvb<civ, hbw, gex> {
   private static final alg a = alg.b("textures/entity/bee/bee_angry.png");
   private static final alg j = alg.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alg k = alg.b("textures/entity/bee/bee.png");
   private static final alg l = alg.b("textures/entity/bee/bee_nectar.png");

   public gvi(gwh.a $$0) {
      super($$0, new gex($$0.a(gjb.x)), new gex($$0.a(gjb.y)), 0.4F);
   }

   public alg a(hbw $$0) {
      if ($$0.d) {
         return $$0.e ? j : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public hbw a() {
      return new hbw();
   }

   public void a(civ $$0, hbw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gE();
      $$1.c = $$0.aJ() && $$0.dy().h() < 1.0E-7;
      $$1.d = $$0.X_();
      $$1.e = $$0.gD();
   }
}
