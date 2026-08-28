public class glz extends giv<coc> {
   private static final ale a = new ale("textures/entity/wither/wither_invulnerable.png");
   private static final ale f = new ale("textures/entity/wither/wither.png");
   private final fvv g;

   public glz(giw.a $$0) {
      super($$0);
      this.g = new fvv($$0.a(fwy.cb));
   }

   public static fxf a() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("head", fxe.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fxb.a);
      return fxf.a($$0, 64, 64);
   }

   protected int a(coc $$0, iz $$1) {
      return 15;
   }

   public void a(coc $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = ayy.j($$2, $$0.O, $$0.dF());
      float $$7 = ayy.i($$2, $$0.P, $$0.dH());
      fab $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ale a(coc $$0) {
      return $$0.y() ? a : f;
   }
}
