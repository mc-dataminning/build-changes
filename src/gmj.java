public class gmj extends gjf<cnn> {
   private static final akk a = new akk("textures/entity/wither/wither_invulnerable.png");
   private static final akk f = new akk("textures/entity/wither/wither.png");
   private final fwe g;

   public gmj(gjg.a $$0) {
      super($$0);
      this.g = new fwe($$0.a(fxh.cb));
   }

   public static fxo a() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      $$1.a("head", fxn.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxk.a);
      return fxo.a($$0, 64, 64);
   }

   protected int a(cnn $$0, ja $$1) {
      return 15;
   }

   public void a(cnn $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = aye.j($$2, $$0.O, $$0.dF());
      float $$7 = aye.i($$2, $$0.P, $$0.dH());
      fak $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cnn $$0) {
      return $$0.y() ? a : f;
   }
}
