public class gga extends gcx<cjy> {
   private static final ajh a = new ajh("textures/entity/wither/wither_invulnerable.png");
   private static final ajh f = new ajh("textures/entity/wither/wither.png");
   private final fpz g;

   public gga(gcy.a $$0) {
      super($$0);
      this.g = new fpz($$0.a(frc.bX));
   }

   public static frj a() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("head", fri.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), frf.a);
      return frj.a($$0, 64, 64);
   }

   protected int a(cjy $$0, ib $$1) {
      return 15;
   }

   public void a(cjy $$0, float $$1, float $$2, etz $$3, fxq $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = aww.j($$2, $$0.N, $$0.dC());
      float $$7 = aww.i($$2, $$0.O, $$0.dE());
      eud $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajh a(cjy $$0) {
      return $$0.y() ? a : f;
   }
}
