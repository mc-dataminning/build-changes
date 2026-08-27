public class fus extends fvz<cdy> {
   private final fys a;
   private final fys b;
   private final fys f;
   private final fys g;
   private final fys h;
   private final fys i;
   private final fys j;
   private final fys k;

   public fus(fys $$0) {
      super(gfo::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      fzb $$2 = $$1.a("body", fyx.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fyu.a(0.0F, 17.0F, 0.0F));
      fzb $$3 = $$1.a("head", fyx.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fyu.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fyx.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fyu.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fyx.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fyu.a(1.1F, -3.0F, 0.0F));
      fzb $$4 = $$2.a("right_wing", fyx.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fyu.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fyx.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fyu.a(-2.0F, 0.0F, 0.0F));
      fzb $$5 = $$2.a("left_wing", fyx.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fyu.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fyx.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fyu.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fyx.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fyu.a(0.0F, 5.0F, 0.0F));
      return fyy.a($$0, 32, 32);
   }

   @Override
   public fys a() {
      return this.a;
   }

   public void a(cdy $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fys::c);
      if ($$0.t()) {
         this.a($$4);
      }

      this.a($$0.d, fhe.b, $$3, 1.0F);
      this.a($$0.e, fhe.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
