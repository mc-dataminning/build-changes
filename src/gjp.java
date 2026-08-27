public class gjp extends ggm<clr> {
   private static final akf a = new akf("textures/entity/wither/wither_invulnerable.png");
   private static final akf f = new akf("textures/entity/wither/wither.png");
   private final ftn g;

   public gjp(ggn.a $$0) {
      super($$0);
      this.g = new ftn($$0.a(fuq.cb));
   }

   public static fux a() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("head", fuw.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fut.a);
      return fux.a($$0, 64, 64);
   }

   protected int a(clr $$0, im $$1) {
      return 15;
   }

   public void a(clr $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = axw.j($$2, $$0.O, $$0.dD());
      float $$7 = axw.i($$2, $$0.P, $$0.dF());
      exr $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akf a(clr $$0) {
      return $$0.y() ? a : f;
   }
}
