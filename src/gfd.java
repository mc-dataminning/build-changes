public class gfd extends gfq<hdf> {
   private final giu a;

   public gfd(giu $$0) {
      super($$0);
      this.a = $$0.b("tail_fin");
   }

   public static gja a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", giz.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), giw.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", giz.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), giw.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", giz.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), giw.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", giz.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), giw.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", giz.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), giw.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", giz.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), giw.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", giz.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), giw.a(0.0F, 20.0F, 0.0F));
      return gja.a($$0, 32, 32);
   }

   public void a(hdf $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * azm.a(0.6F * $$0.u);
   }
}
