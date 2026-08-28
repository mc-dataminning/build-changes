import java.util.Set;

public class gca extends fzj<gyc> {
   public static final gcu a = new fyl(Set.of("head"));
   private static final String b = "real_head";
   private static final String c = "upper_body";
   private static final String d = "real_tail";
   private final gcl e;
   private final gcl f;
   private final gcl g;
   private final gcl i;
   private final gcl j;
   private final gcl k;
   private final gcl l;
   private final gcl m;
   private final gcl n;
   private final gcl o;
   private static final int p = 8;

   public gca(gcl $$0) {
      super($$0);
      this.e = $$0.b("head");
      this.f = this.e.b("real_head");
      this.g = $$0.b("body");
      this.o = $$0.b("upper_body");
      this.i = $$0.b("right_hind_leg");
      this.j = $$0.b("left_hind_leg");
      this.k = $$0.b("right_front_leg");
      this.l = $$0.b("left_front_leg");
      this.m = $$0.b("tail");
      this.n = this.m.b("real_tail");
   }

   public static gct a(gcp $$0) {
      gct $$1 = new gct();
      gcv $$2 = $$1.a();
      float $$3 = 13.5F;
      gcv $$4 = $$2.a("head", gcq.c(), gcn.a(-1.0F, 13.5F, -7.0F));
      $$4.a(
         "real_head",
         gcq.c()
            .a(0, 0)
            .a(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, $$0)
            .a(16, 14)
            .a(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, $$0)
            .a(16, 14)
            .a(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, $$0)
            .a(0, 10)
            .a(-0.5F, -0.001F, -5.0F, 3.0F, 3.0F, 4.0F, $$0),
         gcn.a
      );
      $$2.a("body", gcq.c().a(18, 14).a(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, $$0), gcn.a(0.0F, 14.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("upper_body", gcq.c().a(21, 0).a(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, $$0), gcn.a(-1.0F, 14.0F, -3.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gcq $$5 = gcq.c().a(0, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, $$0);
      $$2.a("right_hind_leg", $$5, gcn.a(-2.5F, 16.0F, 7.0F));
      $$2.a("left_hind_leg", $$5, gcn.a(0.5F, 16.0F, 7.0F));
      $$2.a("right_front_leg", $$5, gcn.a(-2.5F, 16.0F, -4.0F));
      $$2.a("left_front_leg", $$5, gcn.a(0.5F, 16.0F, -4.0F));
      gcv $$6 = $$2.a("tail", gcq.c(), gcn.a(-1.0F, 12.0F, 8.0F, (float) (Math.PI / 5), 0.0F, 0.0F));
      $$6.a("real_tail", gcq.c().a(9, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, $$0), gcn.a);
      return $$1;
   }

   public void a(gyc $$0) {
      super.a($$0);
      float $$1 = $$0.X;
      float $$2 = $$0.Y;
      if ($$0.a) {
         this.m.f = 0.0F;
      } else {
         this.m.f = azm.b($$1 * 0.6662F) * 1.4F * $$2;
      }

      if ($$0.b) {
         float $$3 = $$0.ab;
         this.o.c += 2.0F * $$3;
         this.o.e = (float) (Math.PI * 2.0 / 5.0);
         this.o.f = 0.0F;
         this.g.c += 4.0F * $$3;
         this.g.d -= 2.0F * $$3;
         this.g.e = (float) (Math.PI / 4);
         this.m.c += 9.0F * $$3;
         this.m.d -= 2.0F * $$3;
         this.i.c += 6.7F * $$3;
         this.i.d -= 5.0F * $$3;
         this.i.e = (float) (Math.PI * 3.0 / 2.0);
         this.j.c += 6.7F * $$3;
         this.j.d -= 5.0F * $$3;
         this.j.e = (float) (Math.PI * 3.0 / 2.0);
         this.k.e = 5.811947F;
         this.k.b += 0.01F * $$3;
         this.k.c += 1.0F * $$3;
         this.l.e = 5.811947F;
         this.l.b -= 0.01F * $$3;
         this.l.c += 1.0F * $$3;
      } else {
         this.i.e = azm.b($$1 * 0.6662F) * 1.4F * $$2;
         this.j.e = azm.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.k.e = azm.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.l.e = azm.b($$1 * 0.6662F) * 1.4F * $$2;
      }

      this.f.g = $$0.d + $$0.a(0.0F);
      this.o.g = $$0.a(-0.08F);
      this.g.g = $$0.a(-0.16F);
      this.n.g = $$0.a(-0.2F);
      this.e.e = $$0.V * (float) (Math.PI / 180.0);
      this.e.f = $$0.U * (float) (Math.PI / 180.0);
      this.m.e = $$0.c;
   }
}
