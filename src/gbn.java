public class gbn extends fyk<cgn> {
   private static final ahg a = new ahg("textures/entity/wither/wither_invulnerable.png");
   private static final ahg f = new ahg("textures/entity/wither/wither.png");
   private final flr g;

   public gbn(fyl.a $$0) {
      super($$0);
      this.g = new flr($$0.a(fmu.bY));
   }

   public static fnb a() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      $$1.a("head", fna.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fmx.a);
      return fnb.a($$0, 64, 64);
   }

   protected int a(cgn $$0, hx $$1) {
      return 15;
   }

   public void a(cgn $$0, float $$1, float $$2, epz $$3, ftf $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = aun.j($$2, $$0.N, $$0.dC());
      float $$7 = aun.i($$2, $$0.O, $$0.dE());
      eqd $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gec.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(cgn $$0) {
      return $$0.y() ? a : f;
   }
}
