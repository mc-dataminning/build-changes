public class gav extends gby<gxo> {
   public gav(gfa $$0) {
      super($$0, gmf::f);
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("back", gff.c().a(0, 0).a(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F), gfc.a(-11.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F, 0.0F).a(0.8F));
      gff $$2 = gff.c().a(0, 0).a(-12.0F, -2.0F, 0.0F, 16.0F, 4.0F, 0.0F, gfe.a, 1.0F, 0.8F);
      $$1.a("cross_1", $$2, gfc.b((float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("cross_2", $$2, gfc.b((float) (Math.PI * 3.0 / 4.0), 0.0F, 0.0F));
      return gfg.a($$0.a($$0x -> $$0x.b(0.9F)), 32, 32);
   }

   public void a(gxo $$0) {
      super.a($$0);
      if ($$0.c > 0.0F) {
         float $$1 = -ayy.a($$0.c * 3.0F) * $$0.c;
         this.v.g += $$1 * (float) (Math.PI / 180.0);
      }
   }
}
