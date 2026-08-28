public class fuh extends fvn<cex> {
   private final fye a;
   private final fye b;
   private final fye f;
   private final fye g;
   private final fye h;
   private final fye i;
   private final fye j;
   private final fye k;

   public fuh(fye $$0) {
      super(gfb::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fyk b() {
      fym $$0 = new fym();
      fyn $$1 = $$0.a();
      fyn $$2 = $$1.a("body", fyj.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fyg.a(0.0F, 17.0F, 0.0F));
      fyn $$3 = $$1.a("head", fyj.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fyg.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fyj.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fyg.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fyj.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fyg.a(1.1F, -3.0F, 0.0F));
      fyn $$4 = $$2.a("right_wing", fyj.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fyg.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fyj.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fyg.a(-2.0F, 0.0F, 0.0F));
      fyn $$5 = $$2.a("left_wing", fyj.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fyg.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fyj.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fyg.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fyj.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fyg.a(0.0F, 5.0F, 0.0F));
      return fyk.a($$0, 32, 32);
   }

   @Override
   public fye a() {
      return this.a;
   }

   public void a(cex $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fye::c);
      if ($$0.t()) {
         this.a($$4);
      }

      this.a($$0.d, fhb.b, $$3, 1.0F);
      this.a($$0.e, fhb.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
