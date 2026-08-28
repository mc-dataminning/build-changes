public class ghq extends gfd<hdz> implements gfn, ghp {
   public static final gip a = gip.scaling(0.5F);
   private final gig b;
   private final gig c;
   private final gig d;
   private final gig e;
   private final gig f;
   private final gig g;

   public ghq(gig $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("arms");
   }

   public static gio a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      float $$2 = 0.5F;
      giq $$3 = $$1.a("head", gil.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gii.a);
      giq $$4 = $$3.a("hat", gil.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gik(0.51F)), gii.a);
      $$4.a("hat_rim", gil.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gii.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", gil.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), gii.a(0.0F, -2.0F, 0.0F));
      giq $$5 = $$1.a("body", gil.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), gii.a);
      $$5.a("jacket", gil.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gik(0.5F)), gii.a);
      $$1.a(
         "arms",
         gil.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         gii.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", gil.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gii.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gil.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gii.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   public void a(hdz $$0) {
      super.a($$0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.b.g = 0.3F * azk.a(0.45F * $$0.u);
         this.b.e = 0.4F;
      } else {
         this.b.g = 0.0F;
      }

      this.e.e = azk.b($$0.ad * 0.6662F) * 1.4F * $$0.ae * 0.5F;
      this.f.e = azk.b($$0.ad * 0.6662F + (float) Math.PI) * 1.4F * $$0.ae * 0.5F;
      this.e.f = 0.0F;
      this.f.f = 0.0F;
   }

   @Override
   public gig b() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }

   @Override
   public void a(fiq $$0) {
      this.v.a($$0);
      this.g.a($$0);
   }
}
