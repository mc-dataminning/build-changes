public class fyu extends fxr<guz> {
   private final gcc e = this.c.b("left_chest");
   private final gcc f = this.c.b("right_chest");

   public fyu(gcc $$0) {
      super($$0);
   }

   public static gci a() {
      gck $$0 = fxr.a(gcg.a);
      a($$0.a());
      return gci.a($$0, 64, 64);
   }

   public static gci b() {
      gck $$0 = fxr.c(gcg.a);
      a($$0.a());
      return gci.a(fxr.b.apply($$0), 64, 64);
   }

   private static void a(gcm $$0) {
      gcm $$1 = $$0.b("body");
      gch $$2 = gch.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gce.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gce.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gcm $$3 = $$0.b("head_parts").b("head");
      gch $$4 = gch.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gce.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gce.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(guz $$0) {
      super.a($$0);
      this.e.k = $$0.a;
      this.f.k = $$0.a;
   }
}
