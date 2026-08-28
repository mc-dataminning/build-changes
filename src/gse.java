public class gse extends grx<chq, gyt, gcc> {
   private static final aku a = aku.b("textures/entity/bee/bee_angry.png");
   private static final aku b = aku.b("textures/entity/bee/bee_angry_nectar.png");
   private static final aku k = aku.b("textures/entity/bee/bee.png");
   private static final aku l = aku.b("textures/entity/bee/bee_nectar.png");

   public gse(gtd.a $$0) {
      super($$0, new gcc($$0.a(ggb.x)), new gcc($$0.a(ggb.y)), 0.4F);
   }

   public aku a(gyt $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gyt a() {
      return new gyt();
   }

   public void a(chq $$0, gyt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.K($$2);
      $$1.b = !$$0.gF();
      $$1.c = $$0.aJ() && $$0.dx().h() < 1.0E-7;
      $$1.d = $$0.Z_();
      $$1.e = $$0.gE();
   }
}
