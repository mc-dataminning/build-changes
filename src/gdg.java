import java.util.List;

public class gdg extends gco<gzw> {
   private static final String f = "left_sleeve";
   private static final String g = "right_sleeve";
   private static final String x = "left_pants";
   private static final String y = "right_pants";
   private final List<gfd> z;
   public final gfd a;
   public final gfd b;
   public final gfd c;
   public final gfd d;
   public final gfd e;
   private final boolean A;

   public gdg(gfd $$0, boolean $$1) {
      super($$0, gmi::j);
      this.A = $$1;
      this.a = this.s.b("left_sleeve");
      this.b = this.r.b("right_sleeve");
      this.c = this.u.b("left_pants");
      this.d = this.t.b("right_pants");
      this.e = this.q.b("jacket");
      this.z = List.of(this.o, this.q, this.s, this.r, this.u, this.t);
   }

   public static gfl a(gfh $$0, boolean $$1) {
      gfl $$2 = gco.a($$0, 0.0F);
      gfn $$3 = $$2.a();
      float $$4 = 0.25F;
      if ($$1) {
         gfn $$5 = $$3.a("left_arm", gfi.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gff.a(5.0F, 2.0F, 0.0F));
         gfn $$6 = $$3.a("right_arm", gfi.c().a(40, 16).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gff.a(-5.0F, 2.0F, 0.0F));
         $$5.a("left_sleeve", gfi.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gff.a);
         $$6.a("right_sleeve", gfi.c().a(40, 32).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gff.a);
      } else {
         gfn $$7 = $$3.a("left_arm", gfi.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gff.a(5.0F, 2.0F, 0.0F));
         gfn $$8 = $$3.b("right_arm");
         $$7.a("left_sleeve", gfi.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gff.a);
         $$8.a("right_sleeve", gfi.c().a(40, 32).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gff.a);
      }

      gfn $$9 = $$3.a("left_leg", gfi.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gff.a(1.9F, 12.0F, 0.0F));
      gfn $$10 = $$3.b("right_leg");
      $$9.a("left_pants", gfi.c().a(0, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gff.a);
      $$10.a("right_pants", gfi.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gff.a);
      gfn $$11 = $$3.b("body");
      $$11.a("jacket", gfi.c().a(16, 32).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.25F)), gff.a);
      return $$2;
   }

   public void a(gzw $$0) {
      boolean $$1 = !$$0.m;
      this.q.k = $$1;
      this.r.k = $$1;
      this.s.k = $$1;
      this.t.k = $$1;
      this.u.k = $$1;
      this.p.k = $$0.n;
      this.e.k = $$0.o;
      this.c.k = $$0.p;
      this.d.k = $$0.q;
      this.a.k = $$0.aw;
      this.b.k = $$0.ax;
      super.a($$0);
   }

   @Override
   public void c_(boolean $$0) {
      super.c_($$0);
      this.a.k = $$0;
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
      this.e.k = $$0;
   }

   @Override
   public void a(bvb $$0, ffu $$1) {
      this.e().a($$1);
      gfd $$2 = this.a($$0);
      if (this.A) {
         float $$3 = 0.5F * (float)($$0 == bvb.b ? 1 : -1);
         $$2.b += $$3;
         $$2.a($$1);
         $$2.b -= $$3;
      } else {
         $$2.a($$1);
      }
   }

   public gfd a(azh $$0) {
      return af.a(this.z, $$0);
   }
}
