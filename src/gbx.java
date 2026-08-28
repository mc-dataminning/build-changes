public class gbx extends gcb<gzb> {
   public static final gfm a = gfm.scaling(0.5F);
   private final gfd b;
   private final gfd c;

   public gbx(gfd $$0) {
      super($$0);
      this.c = $$0.b("left_wing");
      this.b = $$0.b("right_wing");
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      gfh $$2 = new gfh(1.0F);
      $$1.a(
         "left_wing",
         gfi.c().a(22, 0).a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gff.a(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      $$1.a(
         "right_wing",
         gfi.c().a(22, 0).a().a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gff.a(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return gfj.a($$0, 64, 32);
   }

   public void a(gzb $$0) {
      super.a($$0);
      this.c.c = $$0.N ? 3.0F : 0.0F;
      this.c.e = $$0.S;
      this.c.g = $$0.U;
      this.c.f = $$0.T;
      this.b.f = -this.c.f;
      this.b.c = this.c.c;
      this.b.e = this.c.e;
      this.b.g = -this.c.g;
   }
}
