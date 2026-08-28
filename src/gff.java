public class gff extends geo<hbw> {
   public gff(ghd $$0) {
      super($$0);
   }

   public static ghj a() {
      ghl $$0 = geo.a(ghh.a, 0.0F);
      ghn $$1 = $$0.a();
      ghn $$2 = $$1.a("head");
      $$2.a("hat");
      $$1.a("body");
      $$1.a("left_arm");
      $$1.a("right_arm");
      $$1.a("left_leg");
      $$1.a("right_leg");
      ghi $$3 = ghi.c().a(24, 0).a(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, new ghh(1.0F));
      $$2.a("left_ear", $$3, ghf.a(-6.0F, -6.0F, 0.0F));
      $$2.a("right_ear", $$3, ghf.a(6.0F, -6.0F, 0.0F));
      return ghj.a($$0, 64, 64);
   }
}
