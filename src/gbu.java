public class gbu extends gcb<gyf> {
   public static final gfm a = gfm.scaling(0.5F);
   private final gfd b;
   private final gfd c;
   private final gfd d;

   public gbu(gfd $$0) {
      super($$0);
      this.b = $$0.b("body");
      this.c = this.b.b("tail");
      this.d = this.c.b("tail_fin");
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      float $$2 = 18.0F;
      float $$3 = -8.0F;
      gfn $$4 = $$1.a("body", gfi.c().a(22, 0).a(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F), gff.a(0.0F, 22.0F, -5.0F));
      $$4.a("back_fin", gfi.c().a(51, 0).a(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F), gff.b((float) (Math.PI / 3), 0.0F, 0.0F));
      $$4.a(
         "left_fin",
         gfi.c().a(48, 20).a().a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         gff.a(2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (Math.PI * 2.0 / 3.0))
      );
      $$4.a(
         "right_fin",
         gfi.c().a(48, 20).a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         gff.a(-2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (-Math.PI * 2.0 / 3.0))
      );
      gfn $$5 = $$4.a("tail", gfi.c().a(0, 19).a(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F), gff.a(0.0F, -2.5F, 11.0F, -0.10471976F, 0.0F, 0.0F));
      $$5.a("tail_fin", gfi.c().a(19, 20).a(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F), gff.a(0.0F, 0.0F, 9.0F));
      gfn $$6 = $$4.a("head", gfi.c().a(0, 0).a(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F), gff.a(0.0F, -4.0F, -3.0F));
      $$6.a("nose", gfi.c().a(0, 13).a(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F), gff.a);
      return gfj.a($$0, 64, 64);
   }

   public void a(gyf $$0) {
      super.a($$0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.b.e = this.b.e + (-0.05F - 0.05F * ayz.b($$0.u * 0.3F));
         this.c.e = -0.1F * ayz.b($$0.u * 0.3F);
         this.d.e = -0.2F * ayz.b($$0.u * 0.3F);
      }
   }
}
