public class gvu extends gvn<cja, hci, gfj> {
   private static final alg a = alg.b("textures/entity/bee/bee_angry.png");
   private static final alg j = alg.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alg k = alg.b("textures/entity/bee/bee.png");
   private static final alg l = alg.b("textures/entity/bee/bee_nectar.png");

   public gvu(gwt.a $$0) {
      super($$0, new gfj($$0.a(gjn.x)), new gfj($$0.a(gjn.y)), 0.4F);
   }

   public alg a(hci $$0) {
      if ($$0.d) {
         return $$0.e ? j : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public hci a() {
      return new hci();
   }

   public void a(cja $$0, hci $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gG();
      $$1.c = $$0.aH() && $$0.dx().h() < 1.0E-7;
      $$1.d = $$0.X_();
      $$1.e = $$0.gF();
   }
}
