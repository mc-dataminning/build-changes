public class glu extends gln<cfw, gsf, fwe> {
   private static final alb a = alb.b("textures/entity/bee/bee_angry.png");
   private static final alb b = alb.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alb k = alb.b("textures/entity/bee/bee.png");
   private static final alb l = alb.b("textures/entity/bee/bee_nectar.png");

   public glu(gms.a $$0) {
      super($$0, new fwe($$0.a(gaa.q)), new fwe($$0.a(gaa.r)), 0.4F);
   }

   public alb a(gsf $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gsf a() {
      return new gsf();
   }

   public void a(cfw $$0, gsf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gB();
      $$1.c = $$0.aH() && $$0.dv().h() < 1.0E-7;
      $$1.d = $$0.ac_();
      $$1.e = $$0.gA();
   }
}
