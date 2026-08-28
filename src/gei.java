public class gei extends gcb<har> {
   private final gfd a;

   public gei(gfd $$0) {
      super($$0);
      this.a = $$0.b("tail");
   }

   public static gfj a(gfh $$0) {
      gfl $$1 = new gfl();
      gfn $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", gfi.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), gff.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", gfi.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gff.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", gfi.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gff.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", gfi.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gff.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", gfi.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gff.a(0.0F, 20.5F, -3.0F));
      return gfj.a($$1, 32, 32);
   }

   public void a(har $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * ayz.a(0.6F * $$0.u);
   }
}
