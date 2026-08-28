public class fzd extends fya<gvk> {
   private final gcl e = this.c.b("left_chest");
   private final gcl f = this.c.b("right_chest");

   public fzd(gcl $$0) {
      super($$0);
   }

   public static gcr a() {
      gct $$0 = fya.a(gcp.a);
      a($$0.a());
      return gcr.a($$0, 64, 64);
   }

   public static gcr b() {
      gct $$0 = fya.c(gcp.a);
      a($$0.a());
      return gcr.a(fya.b.apply($$0), 64, 64);
   }

   private static void a(gcv $$0) {
      gcv $$1 = $$0.b("body");
      gcq $$2 = gcq.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gcn.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gcn.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gcv $$3 = $$0.b("head_parts").b("head");
      gcq $$4 = gcq.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gcn.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gcn.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gvk $$0) {
      super.a($$0);
      this.e.k = $$0.a;
      this.f.k = $$0.a;
   }
}
