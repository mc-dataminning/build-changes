public class fzf extends fzj<gwe> {
   public static final gcu a = gcu.scaling(0.5F);
   private final gcl b;
   private final gcl c;

   public fzf(gcl $$0) {
      super($$0);
      this.c = $$0.b("left_wing");
      this.b = $$0.b("right_wing");
   }

   public static gcr a() {
      gct $$0 = new gct();
      gcv $$1 = $$0.a();
      gcp $$2 = new gcp(1.0F);
      $$1.a(
         "left_wing",
         gcq.c().a(22, 0).a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gcn.a(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      $$1.a(
         "right_wing",
         gcq.c().a(22, 0).a().a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gcn.a(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return gcr.a($$0, 64, 32);
   }

   public void a(gwe $$0) {
      super.a($$0);
      this.c.c = $$0.I ? 3.0F : 0.0F;
      this.c.e = $$0.N;
      this.c.g = $$0.P;
      this.c.f = $$0.O;
      this.b.f = -this.c.f;
      this.b.c = this.c.c;
      this.b.e = this.c.e;
      this.b.g = -this.c.g;
   }
}
