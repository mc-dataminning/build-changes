public class grg extends gqz<cha, gxv, gbf> {
   private static final akv a = akv.b("textures/entity/bee/bee_angry.png");
   private static final akv b = akv.b("textures/entity/bee/bee_angry_nectar.png");
   private static final akv k = akv.b("textures/entity/bee/bee.png");
   private static final akv l = akv.b("textures/entity/bee/bee_nectar.png");

   public grg(gsf.a $$0) {
      super($$0, new gbf($$0.a(gfd.x)), new gbf($$0.a(gfd.y)), 0.4F);
   }

   public akv a(gxv $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gxv a() {
      return new gxv();
   }

   public void a(cha $$0, gxv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gF();
      $$1.c = $$0.aJ() && $$0.dy().h() < 1.0E-7;
      $$1.d = $$0.ac_();
      $$1.e = $$0.gE();
   }
}
