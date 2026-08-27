import java.util.Set;

public class fut extends fvz<cdz> {
   private final fys a;
   private final fys b;
   private final fys f;
   private final fys g;
   private final fys h;
   private final fys i;
   private final fys j;

   public fut(fys $$0) {
      super(gfo::d);
      this.a = $$0;
      this.b = $$0.b("body");
      this.f = this.b.b("right_wing");
      this.h = this.f.b("right_wing_tip");
      this.g = this.b.b("left_wing");
      this.i = this.g.b("left_wing_tip");
      this.j = this.b.b("feet");
   }

   public static fyy b() {
      fza $$0 = new fza();
      fzb $$1 = $$0.a();
      fzb $$2 = $$1.a(
         "body",
         fyx.c().a(19, 20).a(-1.5F, -2.0F, 0.0F, 13.0F, 12.0F, 0.01F, Set.of(iw.c)).a(6, 20).a().a(-1.5F, -2.0F, 0.0F, 13.0F, 12.0F, 0.01F, Set.of(iw.d)),
         fyu.a(0.0F, 17.0F, 0.0F)
      );
      fzb $$3 = $$2.a("right_wing", fyx.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fyu.a(-1.5F, 0.0F, 0.0F));
      $$3.a("right_wing_tip", fyx.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fyu.a(-2.0F, 0.0F, 0.0F));
      fzb $$4 = $$2.a("left_wing", fyx.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), fyu.a(11.5F, 2.0F, 0.0F));
      $$4.a("left_wing_tip", fyx.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), fyu.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", fyx.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), fyu.a(3.0F, 10.0F, 0.0F));
      return fyy.a($$0, 32, 32);
   }

   @Override
   public fys a() {
      return this.a;
   }

   public void a(cdz $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fys::c);
      this.a($$0.d, fhe.b, $$3, 1.0F);
      this.a($$0.e, fhe.a, $$3, 1.0F);
   }
}
