public class gik extends gfh<ckz> {
   private static final ajt a = new ajt("textures/entity/wither/wither_invulnerable.png");
   private static final ajt f = new ajt("textures/entity/wither/wither.png");
   private final fsi g;

   public gik(gfi.a $$0) {
      super($$0);
      this.g = new fsi($$0.a(ftl.cb));
   }

   public static fts a() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      $$1.a("head", ftr.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fto.a);
      return fts.a($$0, 64, 64);
   }

   protected int a(ckz $$0, ib $$1) {
      return 15;
   }

   public void a(ckz $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = axk.j($$2, $$0.N, $$0.dC());
      float $$7 = axk.i($$2, $$0.O, $$0.dE());
      ewm $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajt a(ckz $$0) {
      return $$0.y() ? a : f;
   }
}
