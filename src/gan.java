public class gan extends fzw<gwz> {
   public gan(gcl $$0) {
      super($$0);
   }

   public static gcr a() {
      gct $$0 = fzw.a(gcp.a, 0.0F);
      gcv $$1 = $$0.a();
      gcv $$2 = $$1.a("head");
      $$2.a("hat");
      $$1.a("body");
      $$1.a("left_arm");
      $$1.a("right_arm");
      $$1.a("left_leg");
      $$1.a("right_leg");
      gcq $$3 = gcq.c().a(24, 0).a(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, new gcp(1.0F));
      $$2.a("left_ear", $$3, gcn.a(-6.0F, -6.0F, 0.0F));
      $$2.a("right_ear", $$3, gcn.a(6.0F, -6.0F, 0.0F));
      return gcr.a($$0, 64, 64);
   }
}
