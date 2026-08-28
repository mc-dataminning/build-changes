public class gqk extends gqd<cht, gwy, gai> {
   private static final alz a = alz.b("textures/entity/bee/bee_angry.png");
   private static final alz b = alz.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alz k = alz.b("textures/entity/bee/bee.png");
   private static final alz l = alz.b("textures/entity/bee/bee_nectar.png");

   public gqk(grj.a $$0) {
      super($$0, new gai($$0.a(geg.u)), new gai($$0.a(geg.v)), 0.4F);
   }

   public alz a(gwy $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gwy a() {
      return new gwy();
   }

   public void a(cht $$0, gwy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gz();
      $$1.c = $$0.aJ() && $$0.dy().h() < 1.0E-7;
      $$1.d = $$0.ad_();
      $$1.e = $$0.gy();
   }
}
