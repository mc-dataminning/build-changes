public class gtg extends gsz<cih, gzu, gdb> {
   private static final ald a = ald.b("textures/entity/bee/bee_angry.png");
   private static final ald j = ald.b("textures/entity/bee/bee_angry_nectar.png");
   private static final ald k = ald.b("textures/entity/bee/bee.png");
   private static final ald l = ald.b("textures/entity/bee/bee_nectar.png");

   public gtg(guf.a $$0) {
      super($$0, new gdb($$0.a(ghc.x)), new gdb($$0.a(ghc.y)), 0.4F);
   }

   public ald a(gzu $$0) {
      if ($$0.d) {
         return $$0.e ? j : a;
      } else {
         return $$0.e ? l : k;
      }
   }

   public gzu a() {
      return new gzu();
   }

   public void a(cih $$0, gzu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.K($$2);
      $$1.b = !$$0.gD();
      $$1.c = $$0.aJ() && $$0.dy().h() < 1.0E-7;
      $$1.d = $$0.W_();
      $$1.e = $$0.gC();
   }
}
