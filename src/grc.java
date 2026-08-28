public class grc extends gqv<cgx, gxr, gbb> {
   private static final aku a = aku.b("textures/entity/bee/bee_angry.png");
   private static final aku b = aku.b("textures/entity/bee/bee_angry_nectar.png");
   private static final aku k = aku.b("textures/entity/bee/bee.png");
   private static final aku l = aku.b("textures/entity/bee/bee_nectar.png");

   public grc(gsb.a $$0) {
      super($$0, new gbb($$0.a(gez.x)), new gbb($$0.a(gez.y)), 0.4F);
   }

   public aku a(gxr $$0) {
      if ($$0.d) {
         return $$0.e ? b : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gxr a() {
      return new gxr();
   }

   public void a(cgx $$0, gxr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = !$$0.gC();
      $$1.c = $$0.aJ() && $$0.dz().h() < 1.0E-7;
      $$1.d = $$0.ac_();
      $$1.e = $$0.gB();
   }
}
