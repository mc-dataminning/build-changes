public class goc extends gnv<cgw, guo, fye> {
   private static final all a = all.b("textures/entity/bee/bee_angry.png");
   private static final all b = all.b("textures/entity/bee/bee_angry_nectar.png");
   private static final all k = all.b("textures/entity/bee/bee.png");
   private static final all l = all.b("textures/entity/bee/bee_nectar.png");

   public goc(gpa.a $$0) {
      super($$0, new fye($$0.a(gcb.q)), new fye($$0.a(gcb.r)), 0.4F);
   }

   public all a(guo $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public guo a() {
      return new guo();
   }

   public void a(cgw $$0, guo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gI();
      $$1.c = $$0.aL() && $$0.dB().h() < 1.0E-7;
      $$1.d = $$0.ae_();
      $$1.e = $$0.gH();
   }
}
