public class gbb extends gcw {
   private final gfd a;

   public gbb(gfd $$0) {
      super($$0, gmi::d);
      this.a = $$0.b("flag");
   }

   public static gfj a(boolean $$0) {
      gfl $$1 = new gfl();
      gfn $$2 = $$1.a();
      $$2.a("flag", gfi.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), gff.a(0.0F, $$0 ? -44.0F : -20.5F, $$0 ? 0.0F : 10.5F));
      return gfj.a($$1, 64, 64);
   }

   public void a(float $$0) {
      this.a.e = (-0.0125F + 0.01F * ayz.b((float) (Math.PI * 2) * $$0)) * (float) Math.PI;
   }
}
