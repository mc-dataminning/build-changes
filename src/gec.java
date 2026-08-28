public class gec extends gcc<gzl> {
   private static final String a = "upper_body";
   private final gfe b;
   private final gfe c;
   private final gfe d;
   private final gfe e;

   public gec(gfe $$0) {
      super($$0);
      this.c = $$0.b("head");
      this.d = $$0.b("left_arm");
      this.e = $$0.b("right_arm");
      this.b = $$0.b("upper_body");
   }

   public static gfk a() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      float $$2 = 4.0F;
      gfi $$3 = new gfi(-0.5F);
      $$1.a("head", gfj.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$3), gfg.a(0.0F, 4.0F, 0.0F));
      gfj $$4 = gfj.c().a(32, 0).a(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, $$3);
      $$1.a("left_arm", $$4, gfg.a(5.0F, 6.0F, 1.0F, 0.0F, 0.0F, 1.0F));
      $$1.a("right_arm", $$4, gfg.a(-5.0F, 6.0F, -1.0F, 0.0F, (float) Math.PI, -1.0F));
      $$1.a("upper_body", gfj.c().a(0, 16).a(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, $$3), gfg.a(0.0F, 13.0F, 0.0F));
      $$1.a("lower_body", gfj.c().a(0, 36).a(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, $$3), gfg.a(0.0F, 24.0F, 0.0F));
      return gfk.a($$0, 64, 64);
   }

   public void a(gzl $$0) {
      super.a($$0);
      this.c.f = $$0.aa * (float) (Math.PI / 180.0);
      this.c.e = $$0.ab * (float) (Math.PI / 180.0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0) * 0.25F;
      float $$1 = ayz.a(this.b.f);
      float $$2 = ayz.b(this.b.f);
      this.d.f = this.b.f;
      this.e.f = this.b.f + (float) Math.PI;
      this.d.b = $$2 * 5.0F;
      this.d.d = -$$1 * 5.0F;
      this.e.b = -$$2 * 5.0F;
      this.e.d = $$1 * 5.0F;
   }

   public gfe b() {
      return this.c;
   }
}
