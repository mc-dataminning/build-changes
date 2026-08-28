public class gdq extends gdl<had> {
   public gdq(gfd $$0) {
      super($$0);
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      $$1.a("head", gfi.c().a(0, 0).a(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new gfh(0.6F)), gff.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gfi.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new gfh(1.75F)), gff.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gfi $$2 = gfi.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new gfh(0.5F));
      $$1.a("right_hind_leg", $$2, gff.a(-3.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, gff.a(3.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$2, gff.a(-3.0F, 12.0F, -5.0F));
      $$1.a("left_front_leg", $$2, gff.a(3.0F, 12.0F, -5.0F));
      return gfj.a($$0, 64, 32);
   }

   public void a(had $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ag;
      this.b.e = $$0.b;
   }
}
