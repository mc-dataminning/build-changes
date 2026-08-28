public class gmp extends gjl<cnq> {
   private static final akk a = new akk("textures/entity/wither/wither_invulnerable.png");
   private static final akk f = new akk("textures/entity/wither/wither.png");
   private final fwk g;

   public gmp(gjm.a $$0) {
      super($$0);
      this.g = new fwk($$0.a(fxn.cb));
   }

   public static fxu a() {
      fxw $$0 = new fxw();
      fxx $$1 = $$0.a();
      $$1.a("head", fxt.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxq.a);
      return fxu.a($$0, 64, 64);
   }

   protected int a(cnq $$0, ja $$1) {
      return 15;
   }

   public void a(cnq $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = ayg.j($$2, $$0.O, $$0.dG());
      float $$7 = ayg.i($$2, $$0.P, $$0.dI());
      faq $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cnq $$0) {
      return $$0.y() ? a : f;
   }
}
