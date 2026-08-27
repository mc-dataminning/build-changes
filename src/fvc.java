public class fvc<T extends brw> extends fso<T> {
   private final fvw a;
   private final fvw b;

   public fvc(fvw $$0) {
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fwc a(fwa $$0) {
      fwe $$1 = new fwe();
      fwf $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", fwb.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), fvy.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", fwb.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fvy.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", fwb.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fvy.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", fwb.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fvy.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", fwb.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fvy.a(0.0F, 20.5F, -3.0F));
      return fwc.a($$1, 32, 32);
   }

   @Override
   public fvw a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.be()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * ayf.a(0.6F * $$3);
   }
}
