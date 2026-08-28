public class gva extends gut<cit, hbo, geq> {
   private static final alg a = alg.b("textures/entity/bee/bee_angry.png");
   private static final alg j = alg.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alg k = alg.b("textures/entity/bee/bee.png");
   private static final alg l = alg.b("textures/entity/bee/bee_nectar.png");

   public gva(gvz.a $$0) {
      super($$0, new geq($$0.a(git.x)), new geq($$0.a(git.y)), 0.4F);
   }

   public alg a(hbo $$0) {
      if ($$0.d) {
         return $$0.e ? j : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public hbo a() {
      return new hbo();
   }

   public void a(cit $$0, hbo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gD();
      $$1.c = $$0.aJ() && $$0.dy().h() < 1.0E-7;
      $$1.d = $$0.W_();
      $$1.e = $$0.gC();
   }
}
