public class ggn extends gfd<hbp> {
   private final gig a;
   private final gig b;

   public ggn(gig $$0) {
      super($$0);
      this.a = $$0.b("left_fin");
      this.b = $$0.b("right_fin");
   }

   public static gim a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", gil.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), gii.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", gil.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gii.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", gil.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gii.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", gil.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), gii.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", gil.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gii.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", gil.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gii.a(1.5F, 22.0F, -1.5F));
      return gim.a($$0, 32, 32);
   }

   @Override
   public void a(hbp $$0) {
      super.a($$0);
      this.b.g = -0.2F + 0.4F * azk.a($$0.u * 0.2F);
      this.a.g = 0.2F - 0.4F * azk.a($$0.u * 0.2F);
   }
}
