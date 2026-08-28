import java.util.List;

public class fze extends fym<gvn> {
   private static final String f = "left_sleeve";
   private static final String g = "right_sleeve";
   private static final String x = "left_pants";
   private static final String y = "right_pants";
   private final List<gbb> z;
   public final gbb a;
   public final gbb b;
   public final gbb c;
   public final gbb d;
   public final gbb e;
   private final boolean A;

   public fze(gbb $$0, boolean $$1) {
      super($$0, gig::i);
      this.A = $$1;
      this.a = this.s.b("left_sleeve");
      this.b = this.r.b("right_sleeve");
      this.c = this.u.b("left_pants");
      this.d = this.t.b("right_pants");
      this.e = this.q.b("jacket");
      this.z = List.of(this.o, this.q, this.s, this.r, this.u, this.t);
   }

   public static gbj a(gbf $$0, boolean $$1) {
      gbj $$2 = fym.a($$0, 0.0F);
      gbl $$3 = $$2.a();
      float $$4 = 0.25F;
      if ($$1) {
         gbl $$5 = $$3.a("left_arm", gbg.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gbd.a(5.0F, 2.0F, 0.0F));
         gbl $$6 = $$3.a("right_arm", gbg.c().a(40, 16).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gbd.a(-5.0F, 2.0F, 0.0F));
         $$5.a("left_sleeve", gbg.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gbd.a);
         $$6.a("right_sleeve", gbg.c().a(40, 32).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gbd.a);
      } else {
         gbl $$7 = $$3.a("left_arm", gbg.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gbd.a(5.0F, 2.0F, 0.0F));
         gbl $$8 = $$3.b("right_arm");
         $$7.a("left_sleeve", gbg.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gbd.a);
         $$8.a("right_sleeve", gbg.c().a(40, 32).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gbd.a);
      }

      gbl $$9 = $$3.a("left_leg", gbg.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gbd.a(1.9F, 12.0F, 0.0F));
      gbl $$10 = $$3.b("right_leg");
      $$9.a("left_pants", gbg.c().a(0, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gbd.a);
      $$10.a("right_pants", gbg.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gbd.a);
      gbl $$11 = $$3.b("body");
      $$11.a("jacket", gbg.c().a(16, 32).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.25F)), gbd.a);
      return $$2;
   }

   public void a(gvn $$0) {
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
   public void a(bup $$0, fdt $$1) {
      this.e().a($$1);
      gbb $$2 = this.a($$0);
      if (this.A) {
         float $$3 = 0.5F * (float)($$0 == bup.b ? 1 : -1);
         $$2.b += $$3;
         $$2.a($$1);
         $$2.b -= $$3;
      } else {
         $$2.a($$1);
      }
   }

   public gbb a(azr $$0) {
      return ad.a(this.z, $$0);
   }

   protected fym.a a(gvn $$0, bup $$1) {
      fym.a $$2 = gtf.a($$0, $$0.aB, brx.a);
      fym.a $$3 = gtf.a($$0, $$0.aC, brx.b);
      if ($$2.a()) {
         $$3 = $$0.aC.a ? fym.a.a : fym.a.b;
      }

      return $$0.ap == $$1 ? $$2 : $$3;
   }
}
