public class gef extends gby<hao> {
   private final gfa a;

   public gef(gfa $$0) {
      super($$0);
      this.a = $$0.b("tail");
   }

   public static gfg a(gfe $$0) {
      gfi $$1 = new gfi();
      gfk $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", gff.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), gfc.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", gff.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gfc.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", gff.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gfc.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", gff.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gfc.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", gff.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gfc.a(0.0F, 20.5F, -3.0F));
      return gfg.a($$1, 32, 32);
   }

   public void a(hao $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * ayy.a(0.6F * $$0.u);
   }
}
