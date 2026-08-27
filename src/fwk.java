public class fwk extends fti<cdb> {
   private static final aey a = new aey("textures/entity/wither/wither_invulnerable.png");
   private static final aey f = new aey("textures/entity/wither/wither.png");
   private final fhb g;

   public fwk(ftj.a $$0) {
      super($$0);
      this.g = new fhb($$0.a(fid.bU));
   }

   public static fik a() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("head", fij.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fig.a);
      return fik.a($$0, 64, 64);
   }

   protected int a(cdb $$0, gw $$1) {
      return 15;
   }

   public void a(cdb $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = ary.j($$2, $$0.N, $$0.dB());
      float $$7 = ary.i($$2, $$0.O, $$0.dD());
      elv $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, fyx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aey a(cdb $$0) {
      return $$0.w() ? a : f;
   }
}
