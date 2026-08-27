public class gbp extends fym<cgo> {
   private static final ahg a = new ahg("textures/entity/wither/wither_invulnerable.png");
   private static final ahg f = new ahg("textures/entity/wither/wither.png");
   private final flt g;

   public gbp(fyn.a $$0) {
      super($$0);
      this.g = new flt($$0.a(fmw.bY));
   }

   public static fnd a() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      $$1.a("head", fnc.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fmz.a);
      return fnd.a($$0, 64, 64);
   }

   protected int a(cgo $$0, hx $$1) {
      return 15;
   }

   public void a(cgo $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = auo.j($$2, $$0.N, $$0.dC());
      float $$7 = auo.i($$2, $$0.O, $$0.dE());
      eqf $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gee.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(cgo $$0) {
      return $$0.z() ? a : f;
   }
}
