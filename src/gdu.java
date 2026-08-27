public class gdu extends gar<cio> {
   private static final aiy a = new aiy("textures/entity/wither/wither_invulnerable.png");
   private static final aiy f = new aiy("textures/entity/wither/wither.png");
   private final fnx g;

   public gdu(gas.a $$0) {
      super($$0);
      this.g = new fnx($$0.a(fpb.bX));
   }

   public static fpi a() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("head", fph.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fpe.a);
      return fpi.a($$0, 64, 64);
   }

   protected int a(cio $$0, hz $$1) {
      return 15;
   }

   public void a(cio $$0, float $$1, float $$2, esa $$3, fvl $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = awh.j($$2, $$0.M, $$0.dC());
      float $$7 = awh.i($$2, $$0.N, $$0.dE());
      ese $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, ggk.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cio $$0) {
      return $$0.z() ? a : f;
   }
}
