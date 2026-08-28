public class gbe extends fza<gxc> {
   private static final String a = "right_bottom_bristle";
   private static final String b = "right_middle_bristle";
   private static final String c = "right_top_bristle";
   private static final String d = "left_top_bristle";
   private static final String e = "left_middle_bristle";
   private static final String f = "left_bottom_bristle";
   private final gcc g;
   private final gcc i;
   private final gcc j;
   private final gcc k;
   private final gcc l;
   private final gcc m;
   private final gcc n;
   private final gcc o;
   private final gcc p;

   public gbe(gcc $$0) {
      super($$0);
      this.g = $$0.b("right_leg");
      this.i = $$0.b("left_leg");
      this.j = $$0.b("body");
      this.k = this.j.b("right_bottom_bristle");
      this.l = this.j.b("right_middle_bristle");
      this.m = this.j.b("right_top_bristle");
      this.n = this.j.b("left_top_bristle");
      this.o = this.j.b("left_middle_bristle");
      this.p = this.j.b("left_bottom_bristle");
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      $$1.a("right_leg", gch.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F), gce.a(-4.0F, 8.0F, 0.0F));
      $$1.a("left_leg", gch.c().a(0, 55).a(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F), gce.a(4.0F, 8.0F, 0.0F));
      gcm $$2 = $$1.a("body", gch.c().a(0, 0).a(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F), gce.a(0.0F, 1.0F, 0.0F));
      $$2.a("right_bottom_bristle", gch.c().a(16, 65).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), gce.a(-8.0F, 4.0F, -8.0F, 0.0F, 0.0F, -1.2217305F));
      $$2.a("right_middle_bristle", gch.c().a(16, 49).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), gce.a(-8.0F, -1.0F, -8.0F, 0.0F, 0.0F, -1.134464F));
      $$2.a("right_top_bristle", gch.c().a(16, 33).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), gce.a(-8.0F, -5.0F, -8.0F, 0.0F, 0.0F, -0.87266463F));
      $$2.a("left_top_bristle", gch.c().a(16, 33).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), gce.a(8.0F, -6.0F, -8.0F, 0.0F, 0.0F, 0.87266463F));
      $$2.a("left_middle_bristle", gch.c().a(16, 49).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), gce.a(8.0F, -2.0F, -8.0F, 0.0F, 0.0F, 1.134464F));
      $$2.a("left_bottom_bristle", gch.c().a(16, 65).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), gce.a(8.0F, 3.0F, -8.0F, 0.0F, 0.0F, 1.2217305F));
      return gci.a($$0, 64, 128);
   }

   public void a(gxc $$0) {
      super.a($$0);
      float $$1 = $$0.X;
      float $$2 = Math.min($$0.Y, 0.25F);
      if (!$$0.c) {
         this.j.e = $$0.V * (float) (Math.PI / 180.0);
         this.j.f = $$0.U * (float) (Math.PI / 180.0);
      } else {
         this.j.e = 0.0F;
         this.j.f = 0.0F;
      }

      float $$3 = 1.5F;
      this.j.g = 0.1F * azn.a($$1 * 1.5F) * 4.0F * $$2;
      this.j.c = 2.0F;
      this.j.c = this.j.c - 2.0F * azn.b($$1 * 1.5F) * 2.0F * $$2;
      this.i.e = azn.a($$1 * 1.5F * 0.5F) * 2.0F * $$2;
      this.g.e = azn.a($$1 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * $$2;
      this.i.g = (float) (Math.PI / 18) * azn.b($$1 * 1.5F * 0.5F) * $$2;
      this.g.g = (float) (Math.PI / 18) * azn.b($$1 * 1.5F * 0.5F + (float) Math.PI) * $$2;
      this.i.c = 8.0F + 2.0F * azn.a($$1 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * $$2;
      this.g.c = 8.0F + 2.0F * azn.a($$1 * 1.5F * 0.5F) * 2.0F * $$2;
      this.k.g = -1.2217305F;
      this.l.g = -1.134464F;
      this.m.g = -0.87266463F;
      this.n.g = 0.87266463F;
      this.o.g = 1.134464F;
      this.p.g = 1.2217305F;
      float $$4 = azn.b($$1 * 1.5F + (float) Math.PI) * $$2;
      this.k.g += $$4 * 1.3F;
      this.l.g += $$4 * 1.2F;
      this.m.g += $$4 * 0.6F;
      this.n.g += $$4 * 0.6F;
      this.o.g += $$4 * 1.2F;
      this.p.g += $$4 * 1.3F;
      float $$5 = 1.0F;
      float $$6 = 1.0F;
      this.k.g = this.k.g + 0.05F * azn.a($$0.p * 1.0F * -0.4F);
      this.l.g = this.l.g + 0.1F * azn.a($$0.p * 1.0F * 0.2F);
      this.m.g = this.m.g + 0.1F * azn.a($$0.p * 1.0F * 0.4F);
      this.n.g = this.n.g + 0.1F * azn.a($$0.p * 1.0F * 0.4F);
      this.o.g = this.o.g + 0.1F * azn.a($$0.p * 1.0F * 0.2F);
      this.p.g = this.p.g + 0.05F * azn.a($$0.p * 1.0F * -0.4F);
   }
}
