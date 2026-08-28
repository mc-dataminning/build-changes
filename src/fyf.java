import java.util.List;

public class fyf extends fxn<guf> {
   private static final String f = "left_sleeve";
   private static final String g = "right_sleeve";
   private static final String w = "left_pants";
   private static final String x = "right_pants";
   private final List<gab> y;
   public final gab a;
   public final gab b;
   public final gab c;
   public final gab d;
   public final gab e;
   private final boolean z;

   public fyf(gab $$0, boolean $$1) {
      super($$0, ghe::j);
      this.z = $$1;
      this.a = this.s.b("left_sleeve");
      this.b = this.r.b("right_sleeve");
      this.c = this.u.b("left_pants");
      this.d = this.t.b("right_pants");
      this.e = this.q.b("jacket");
      this.y = List.of(this.o, this.q, this.s, this.r, this.u, this.t);
   }

   public static gaj a(gaf $$0, boolean $$1) {
      gaj $$2 = fxn.a($$0, 0.0F);
      gal $$3 = $$2.a();
      float $$4 = 0.25F;
      if ($$1) {
         gal $$5 = $$3.a("left_arm", gag.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gad.a(5.0F, 2.5F, 0.0F));
         gal $$6 = $$3.a("right_arm", gag.c().a(40, 16).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gad.a(-5.0F, 2.5F, 0.0F));
         $$5.a("left_sleeve", gag.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gad.a);
         $$6.a("right_sleeve", gag.c().a(40, 32).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gad.a);
      } else {
         gal $$7 = $$3.a("left_arm", gag.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gad.a(5.0F, 2.0F, 0.0F));
         gal $$8 = $$3.b("right_arm");
         $$7.a("left_sleeve", gag.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gad.a);
         $$8.a("right_sleeve", gag.c().a(40, 32).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gad.a);
      }

      gal $$9 = $$3.a("left_leg", gag.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gad.a(1.9F, 12.0F, 0.0F));
      gal $$10 = $$3.b("right_leg");
      $$9.a("left_pants", gag.c().a(0, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gad.a);
      $$10.a("right_pants", gag.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gad.a);
      gal $$11 = $$3.b("body");
      $$11.a("jacket", gag.c().a(16, 32).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.25F)), gad.a);
      return $$2;
   }

   public void a(guf $$0) {
      boolean $$1 = !$$0.h;
      this.q.k = $$1;
      this.r.k = $$1;
      this.s.k = $$1;
      this.t.k = $$1;
      this.u.k = $$1;
      this.p.k = $$0.i;
      this.e.k = $$0.j;
      this.c.k = $$0.k;
      this.d.k = $$0.l;
      this.a.k = $$0.au;
      this.b.k = $$0.av;
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
   public void a(btz $$0, fcu $$1) {
      this.a().a($$1);
      gab $$2 = this.a($$0);
      if (this.z) {
         float $$3 = 0.5F * (float)($$0 == btz.b ? 1 : -1);
         $$2.b += $$3;
         $$2.a($$1);
         $$2.b -= $$3;
      } else {
         $$2.a($$1);
      }
   }

   public gab a(azk $$0) {
      return ad.a(this.y, $$0);
   }

   protected fxn.a a(guf $$0, btz $$1) {
      fxn.a $$2 = grx.a($$0, $$0.aC, brj.a);
      fxn.a $$3 = grx.a($$0, $$0.aD, brj.b);
      if ($$2.a()) {
         $$3 = $$0.aD.a ? fxn.a.a : fxn.a.b;
      }

      return $$0.ap == $$1 ? $$2 : $$3;
   }
}
