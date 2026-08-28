public class gzd extends gvy<csh, het> {
   private static final alg a = alg.b("textures/entity/wither/wither_invulnerable.png");
   private static final alg g = alg.b("textures/entity/wither/wither.png");
   private final ghn h;

   public gzd(gvz.a $$0) {
      super($$0);
      this.h = new ghn($$0.a(git.dW));
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      $$1.a("head", giz.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), giw.a);
      return gja.a($$0, 64, 64);
   }

   protected int a(csh $$0, iu $$1) {
      return 15;
   }

   public void a(het $$0, fjc $$1, gps $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fjg $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hif.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private alg a(het $$0) {
      return $$0.a ? a : g;
   }

   public het b() {
      return new het();
   }

   public void a(csh $$0, het $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      $$1.c = $$0.l($$2);
      $$1.b = $$0.k($$2);
   }
}
