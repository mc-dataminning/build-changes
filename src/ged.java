public class ged extends gby<gzh> {
   private final gfa a;

   public ged(gfa $$0) {
      super($$0, gmf::g);
      this.a = $$0.b("tail");
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gff.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gfc.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gff.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gfc.a(0.0F, 22.0F, 0.0F));
      return gfg.a($$0, 16, 16);
   }

   public void a(gzh $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * ayy.a(0.3F * $$0.u);
   }
}
