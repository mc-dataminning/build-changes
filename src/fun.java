public class fun extends fvt<cez> {
   private final fyk a;
   private final fyk b;
   private final fyk f;
   private final fyk g;
   private final fyk h;
   private final fyk i;
   private final fyk j;
   private final fyk k;

   public fun(fyk $$0) {
      super(gfh::d);
      this.a = $$0;
      this.f = $$0.b("body");
      this.b = $$0.b("head");
      this.g = this.f.b("right_wing");
      this.i = this.g.b("right_wing_tip");
      this.h = this.f.b("left_wing");
      this.j = this.h.b("left_wing_tip");
      this.k = this.f.b("feet");
   }

   public static fyq b() {
      fys $$0 = new fys();
      fyt $$1 = $$0.a();
      fyt $$2 = $$1.a("body", fyp.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), fym.a(0.0F, 17.0F, 0.0F));
      fyt $$3 = $$1.a("head", fyp.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), fym.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", fyp.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), fym.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", fyp.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), fym.a(1.1F, -3.0F, 0.0F));
      fyt $$4 = $$2.a("right_wing", fyp.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fym.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", fyp.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fym.a(-2.0F, 0.0F, 0.0F));
      fyt $$5 = $$2.a("left_wing", fyp.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fym.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", fyp.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fym.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fyp.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fym.a(0.0F, 5.0F, 0.0F));
      return fyq.a($$0, 32, 32);
   }

   @Override
   public fyk a() {
      return this.a;
   }

   public void a(cez $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fyk::c);
      if ($$0.t()) {
         this.a($$4);
      }

      this.a($$0.d, fhh.b, $$3, 1.0F);
      this.a($$0.e, fhh.a, $$3, 1.0F);
   }

   private void a(float $$0) {
      this.b.f = $$0 * (float) (Math.PI / 180.0);
   }
}
