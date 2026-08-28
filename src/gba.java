public class gba extends fza<gwb> {
   private static final String a = "upper_body";
   private final gcc b;
   private final gcc c;
   private final gcc d;
   private final gcc e;

   public gba(gcc $$0) {
      super($$0);
      this.c = $$0.b("head");
      this.d = $$0.b("left_arm");
      this.e = $$0.b("right_arm");
      this.b = $$0.b("upper_body");
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      float $$2 = 4.0F;
      gcg $$3 = new gcg(-0.5F);
      $$1.a("head", gch.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$3), gce.a(0.0F, 4.0F, 0.0F));
      gch $$4 = gch.c().a(32, 0).a(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, $$3);
      $$1.a("left_arm", $$4, gce.a(5.0F, 6.0F, 1.0F, 0.0F, 0.0F, 1.0F));
      $$1.a("right_arm", $$4, gce.a(-5.0F, 6.0F, -1.0F, 0.0F, (float) Math.PI, -1.0F));
      $$1.a("upper_body", gch.c().a(0, 16).a(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, $$3), gce.a(0.0F, 13.0F, 0.0F));
      $$1.a("lower_body", gch.c().a(0, 36).a(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, $$3), gce.a(0.0F, 24.0F, 0.0F));
      return gci.a($$0, 64, 64);
   }

   public void a(gwb $$0) {
      super.a($$0);
      this.c.f = $$0.U * (float) (Math.PI / 180.0);
      this.c.e = $$0.V * (float) (Math.PI / 180.0);
      this.b.f = $$0.U * (float) (Math.PI / 180.0) * 0.25F;
      float $$1 = azn.a(this.b.f);
      float $$2 = azn.b(this.b.f);
      this.d.f = this.b.f;
      this.e.f = this.b.f + (float) Math.PI;
      this.d.b = $$2 * 5.0F;
      this.d.d = -$$1 * 5.0F;
      this.e.b = -$$2 * 5.0F;
      this.e.d = $$1 * 5.0F;
   }

   public gcc b() {
      return this.c;
   }
}
