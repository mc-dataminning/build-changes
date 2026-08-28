public class gom extends gof<cgz, guz, fyn> {
   private static final alj a = alj.b("textures/entity/bee/bee_angry.png");
   private static final alj b = alj.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alj k = alj.b("textures/entity/bee/bee.png");
   private static final alj l = alj.b("textures/entity/bee/bee_nectar.png");

   public gom(gpk.a $$0) {
      super($$0, new fyn($$0.a(gck.u)), new fyn($$0.a(gck.v)), 0.4F);
   }

   public alj a(guz $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public guz a() {
      return new guz();
   }

   public void a(cgz $$0, guz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gz();
      $$1.c = $$0.aJ() && $$0.dy().h() < 1.0E-7;
      $$1.d = $$0.ac_();
      $$1.e = $$0.gy();
   }
}
