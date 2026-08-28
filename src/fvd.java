public class fvd<T extends bsr> extends fvr<T> {
   private final fyi a;
   private final fyi b;
   private final fyi f;
   private final fyi g;

   public fvd(fyi $$0) {
      this.a = $$0;
      this.b = $$0.b("body");
      this.f = this.b.b("tail");
      this.g = this.f.b("tail_fin");
   }

   public static fyo b() {
      fyq $$0 = new fyq();
      fyr $$1 = $$0.a();
      float $$2 = 18.0F;
      float $$3 = -8.0F;
      fyr $$4 = $$1.a("body", fyn.c().a(22, 0).a(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F), fyk.a(0.0F, 22.0F, -5.0F));
      $$4.a("back_fin", fyn.c().a(51, 0).a(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F), fyk.b((float) (Math.PI / 3), 0.0F, 0.0F));
      $$4.a(
         "left_fin",
         fyn.c().a(48, 20).a().a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         fyk.a(2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (Math.PI * 2.0 / 3.0))
      );
      $$4.a(
         "right_fin",
         fyn.c().a(48, 20).a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         fyk.a(-2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (-Math.PI * 2.0 / 3.0))
      );
      fyr $$5 = $$4.a("tail", fyn.c().a(0, 19).a(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F), fyk.a(0.0F, -2.5F, 11.0F, -0.10471976F, 0.0F, 0.0F));
      $$5.a("tail_fin", fyn.c().a(19, 20).a(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F), fyk.a(0.0F, 0.0F, 9.0F));
      fyr $$6 = $$4.a("head", fyn.c().a(0, 0).a(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F), fyk.a(0.0F, -4.0F, -3.0F));
      $$6.a("nose", fyn.c().a(0, 13).a(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F), fyk.a);
      return fyo.a($$0, 64, 64);
   }

   @Override
   public fyi a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      if ($$0.ds().i() > 1.0E-7) {
         this.b.e = this.b.e + (-0.05F - 0.05F * ayo.b($$3 * 0.3F));
         this.f.e = -0.1F * ayo.b($$3 * 0.3F);
         this.g.e = -0.2F * ayo.b($$3 * 0.3F);
      }
   }
}
