public class gmq extends gmj<cge, gtb, fws> {
   private static final ale a = ale.b("textures/entity/bee/bee_angry.png");
   private static final ale b = ale.b("textures/entity/bee/bee_angry_nectar.png");
   private static final ale k = ale.b("textures/entity/bee/bee.png");
   private static final ale l = ale.b("textures/entity/bee/bee_nectar.png");

   public gmq(gno.a $$0) {
      super($$0, new fws($$0.a(gap.q)), new fws($$0.a(gap.r)), 0.4F);
   }

   public ale a(gtb $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gtb a() {
      return new gtb();
   }

   public void a(cge $$0, gtb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gB();
      $$1.c = $$0.aH() && $$0.dv().h() < 1.0E-7;
      $$1.d = $$0.ad_();
      $$1.e = $$0.gA();
   }
}
