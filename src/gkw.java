public class gkw extends ghs<cnc> {
   private static final akm a = new akm("textures/entity/wither/wither_invulnerable.png");
   private static final akm f = new akm("textures/entity/wither/wither.png");
   private final fus g;

   public gkw(ght.a $$0) {
      super($$0);
      this.g = new fus($$0.a(fvv.cb));
   }

   public static fwc a() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      $$1.a("head", fwb.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fvy.a);
      return fwc.a($$0, 64, 64);
   }

   protected int a(cnc $$0, io $$1) {
      return 15;
   }

   public void a(cnc $$0, float $$1, float $$2, eys $$3, gck $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = ayd.j($$2, $$0.O, $$0.dF());
      float $$7 = ayd.i($$2, $$0.P, $$0.dH());
      eyw $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akm a(cnc $$0) {
      return $$0.y() ? a : f;
   }
}
