public class gvz extends gvs<cja, hco, gfo> {
   private static final alg a = alg.b("textures/entity/bee/bee_angry.png");
   private static final alg j = alg.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alg k = alg.b("textures/entity/bee/bee.png");
   private static final alg l = alg.b("textures/entity/bee/bee_nectar.png");

   public gvz(gwy.a $$0) {
      super($$0, new gfo($$0.a(gjs.x)), new gfo($$0.a(gjs.y)), 0.4F);
   }

   public alg a(hco $$0) {
      if ($$0.d) {
         return $$0.e ? j : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public hco a() {
      return new hco();
   }

   public void a(cja $$0, hco $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gG();
      $$1.c = $$0.aH() && $$0.dx().h() < 1.0E-7;
      $$1.d = $$0.aa_();
      $$1.e = $$0.gF();
   }
}
