public class gay extends gcb<gxr> {
   public gay(gfd $$0) {
      super($$0, gmi::f);
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      $$1.a("back", gfi.c().a(0, 0).a(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F), gff.a(-11.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F, 0.0F).a(0.8F));
      gfi $$2 = gfi.c().a(0, 0).a(-12.0F, -2.0F, 0.0F, 16.0F, 4.0F, 0.0F, gfh.a, 1.0F, 0.8F);
      $$1.a("cross_1", $$2, gff.b((float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("cross_2", $$2, gff.b((float) (Math.PI * 3.0 / 4.0), 0.0F, 0.0F));
      return gfj.a($$0.a($$0x -> $$0x.b(0.9F)), 32, 32);
   }

   public void a(gxr $$0) {
      super.a($$0);
      if ($$0.c > 0.0F) {
         float $$1 = -ayz.a($$0.c * 3.0F) * $$0.c;
         this.v.g += $$1 * (float) (Math.PI / 180.0);
      }
   }
}
