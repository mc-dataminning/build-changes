public class gdo extends gea<hbk> {
   private final ghd a;

   public gdo(ghd $$0) {
      super($$0);
      this.a = $$0.b("tail_fin");
   }

   public static ghj a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", ghi.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), ghf.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", ghi.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), ghf.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", ghi.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), ghf.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", ghi.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), ghf.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", ghi.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), ghf.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", ghi.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), ghf.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", ghi.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), ghf.a(0.0F, 20.0F, 0.0F));
      return ghj.a($$0, 32, 32);
   }

   public void a(hbk $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * azk.a(0.6F * $$0.u);
   }
}
