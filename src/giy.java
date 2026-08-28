public class giy extends ggp<hfl> {
   private final gjt a;

   public giy(gjt $$0) {
      super($$0);
      this.a = $$0.b("tail");
   }

   public static gjz a(gjx $$0) {
      gkb $$1 = new gkb();
      gkd $$2 = $$1.a();
      int $$3 = 19;
      $$2.a("body", gjy.c().a(0, 20).a(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, $$0), gjv.a(0.0F, 19.0F, 0.0F));
      $$2.a("tail", gjy.c().a(21, 16).a(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, $$0), gjv.a(0.0F, 19.0F, 3.0F));
      $$2.a("right_fin", gjy.c().a(2, 16).a(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gjv.a(-1.0F, 20.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", gjy.c().a(2, 12).a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gjv.a(1.0F, 20.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", gjy.c().a(20, 11).a(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, $$0), gjv.a(0.0F, 16.0F, -3.0F));
      $$2.a("bottom_fin", gjy.c().a(20, 21).a(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 6.0F, $$0), gjv.a(0.0F, 22.0F, -3.0F));
      return gjz.a($$1, 32, 32);
   }

   public void a(hfl $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * azm.a(0.6F * $$0.u);
   }
}
