public class fzf extends fxv {
   public static final alb a = alb.b("textures/entity/trident.png");
   private final gab b;

   public fzf(gab $$0) {
      super(ghe::c);
      this.b = $$0;
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("pole", gag.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), gad.a);
      $$2.a("base", gag.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), gad.a);
      $$2.a("left_spike", gag.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gad.a);
      $$2.a("middle_spike", gag.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), gad.a);
      $$2.a("right_spike", gag.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gad.a);
      return gah.a($$0, 32, 32);
   }

   @Override
   public gab a() {
      return this.b;
   }
}
