public class gqm extends gqf<chp, gxa, gak> {
   private static final alp a = alp.b("textures/entity/bee/bee_angry.png");
   private static final alp b = alp.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alp k = alp.b("textures/entity/bee/bee.png");
   private static final alp l = alp.b("textures/entity/bee/bee_nectar.png");

   public gqm(grl.a $$0) {
      super($$0, new gak($$0.a(gei.x)), new gak($$0.a(gei.y)), 0.4F);
   }

   public alp a(gxa $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gxa a() {
      return new gxa();
   }

   public void a(chp $$0, gxa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gB();
      $$1.c = $$0.aJ() && $$0.dz().h() < 1.0E-7;
      $$1.d = $$0.ad_();
      $$1.e = $$0.gA();
   }
}
