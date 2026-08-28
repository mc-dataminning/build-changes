public class gul extends gue<cip, haz, gee> {
   private static final ale a = ale.b("textures/entity/bee/bee_angry.png");
   private static final ale j = ale.b("textures/entity/bee/bee_angry_nectar.png");
   private static final ale k = ale.b("textures/entity/bee/bee.png");
   private static final ale l = ale.b("textures/entity/bee/bee_nectar.png");

   public gul(gvk.a $$0) {
      super($$0, new gee($$0.a(gif.x)), new gee($$0.a(gif.y)), 0.4F);
   }

   public ale a(haz $$0) {
      if ($$0.d) {
         return $$0.e ? j : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public haz a() {
      return new haz();
   }

   public void a(cip $$0, haz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gD();
      $$1.c = $$0.aJ() && $$0.dy().h() < 1.0E-7;
      $$1.d = $$0.W_();
      $$1.e = $$0.gC();
   }
}
