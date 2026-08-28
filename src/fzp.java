public class fzp extends fyf {
   public static final alc a = alc.b("textures/entity/trident.png");
   private final gal b;

   public fzp(gal $$0) {
      super(ghq::c);
      this.b = $$0;
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("pole", gaq.c().a(0, 6).a(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F), gan.a);
      $$2.a("base", gaq.c().a(4, 0).a(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F), gan.a);
      $$2.a("left_spike", gaq.c().a(4, 3).a(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gan.a);
      $$2.a("middle_spike", gaq.c().a(0, 0).a(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F), gan.a);
      $$2.a("right_spike", gaq.c().a(4, 3).a().a(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F), gan.a);
      return gar.a($$0, 32, 32);
   }

   @Override
   public gal a() {
      return this.b;
   }
}
