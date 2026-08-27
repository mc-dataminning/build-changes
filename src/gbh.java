public class gbh extends fye<cgh> {
   private static final ahd a = new ahd("textures/entity/wither/wither_invulnerable.png");
   private static final ahd f = new ahd("textures/entity/wither/wither.png");
   private final fll g;

   public gbh(fyf.a $$0) {
      super($$0);
      this.g = new fll($$0.a(fmo.bY));
   }

   public static fmv a() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a("head", fmu.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fmr.a);
      return fmv.a($$0, 64, 64);
   }

   protected int a(cgh $$0, hx $$1) {
      return 15;
   }

   public void a(cgh $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = aui.j($$2, $$0.N, $$0.dC());
      float $$7 = aui.i($$2, $$0.O, $$0.dE());
      epx $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahd a(cgh $$0) {
      return $$0.y() ? a : f;
   }
}
