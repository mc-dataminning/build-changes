public class gqp extends gqi<chx, gxd, gan> {
   private static final alz a = alz.b("textures/entity/bee/bee_angry.png");
   private static final alz b = alz.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alz k = alz.b("textures/entity/bee/bee.png");
   private static final alz l = alz.b("textures/entity/bee/bee_nectar.png");

   public gqp(gro.a $$0) {
      super($$0, new gan($$0.a(gel.u)), new gan($$0.a(gel.v)), 0.4F);
   }

   public alz a(gxd $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gxd a() {
      return new gxd();
   }

   public void a(chx $$0, gxd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gz();
      $$1.c = $$0.aJ() && $$0.dy().h() < 1.0E-7;
      $$1.d = $$0.ad_();
      $$1.e = $$0.gy();
   }
}
