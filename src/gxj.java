public class gxj extends gxc<cjl, hdy, ggz> {
   private static final ali a = ali.b("textures/entity/bee/bee_angry.png");
   private static final ali j = ali.b("textures/entity/bee/bee_angry_nectar.png");
   private static final ali k = ali.b("textures/entity/bee/bee.png");
   private static final ali l = ali.b("textures/entity/bee/bee_nectar.png");

   public gxj(gyi.a $$0) {
      super($$0, new ggz($$0.a(gld.x)), new ggz($$0.a(gld.y)), 0.4F);
   }

   public ali a(hdy $$0) {
      if ($$0.d) {
         return $$0.e ? j : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public hdy a() {
      return new hdy();
   }

   public void a(cjl $$0, hdy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gH();
      $$1.c = $$0.aH() && $$0.dy().h() < 1.0E-7;
      $$1.d = $$0.ae_();
      $$1.e = $$0.gG();
   }
}
