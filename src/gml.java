public class gml extends gme<cgb, gsw, fwo> {
   private static final alc a = alc.b("textures/entity/bee/bee_angry.png");
   private static final alc b = alc.b("textures/entity/bee/bee_angry_nectar.png");
   private static final alc k = alc.b("textures/entity/bee/bee.png");
   private static final alc l = alc.b("textures/entity/bee/bee_nectar.png");

   public gml(gnj.a $$0) {
      super($$0, new fwo($$0.a(gak.q)), new fwo($$0.a(gak.r)), 0.4F);
   }

   public alc a(gsw $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gsw a() {
      return new gsw();
   }

   public void a(cgb $$0, gsw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gC();
      $$1.c = $$0.aH() && $$0.dv().h() < 1.0E-7;
      $$1.d = $$0.ac_();
      $$1.e = $$0.gB();
   }
}
