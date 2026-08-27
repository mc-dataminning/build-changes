public class gec extends gaz<cis> {
   private static final aiy a = new aiy("textures/entity/wither/wither_invulnerable.png");
   private static final aiy f = new aiy("textures/entity/wither/wither.png");
   private final foe g;

   public gec(gba.a $$0) {
      super($$0);
      this.g = new foe($$0.a(fpi.bX));
   }

   public static fpp a() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      $$1.a("head", fpo.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fpl.a);
      return fpp.a($$0, 64, 64);
   }

   protected int a(cis $$0, hz $$1) {
      return 15;
   }

   public void a(cis $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = awi.j($$2, $$0.M, $$0.dC());
      float $$7 = awi.i($$2, $$0.N, $$0.dE());
      esl $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cis $$0) {
      return $$0.z() ? a : f;
   }
}
