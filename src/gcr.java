import java.util.List;

public class gcr extends gbz<gzg> {
   private static final String f = "left_sleeve";
   private static final String g = "right_sleeve";
   private static final String x = "left_pants";
   private static final String y = "right_pants";
   private final List<geo> z;
   public final geo a;
   public final geo b;
   public final geo c;
   public final geo d;
   public final geo e;
   private final boolean A;

   public gcr(geo $$0, boolean $$1) {
      super($$0, glv::j);
      this.A = $$1;
      this.a = this.s.b("left_sleeve");
      this.b = this.r.b("right_sleeve");
      this.c = this.u.b("left_pants");
      this.d = this.t.b("right_pants");
      this.e = this.q.b("jacket");
      this.z = List.of(this.o, this.q, this.s, this.r, this.u, this.t);
   }

   public static gew a(ges $$0, boolean $$1) {
      gew $$2 = gbz.a($$0, 0.0F);
      gey $$3 = $$2.a();
      float $$4 = 0.25F;
      if ($$1) {
         gey $$5 = $$3.a("left_arm", get.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), geq.a(5.0F, 2.0F, 0.0F));
         gey $$6 = $$3.a("right_arm", get.c().a(40, 16).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), geq.a(-5.0F, 2.0F, 0.0F));
         $$5.a("left_sleeve", get.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), geq.a);
         $$6.a("right_sleeve", get.c().a(40, 32).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), geq.a);
      } else {
         gey $$7 = $$3.a("left_arm", get.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), geq.a(5.0F, 2.0F, 0.0F));
         gey $$8 = $$3.b("right_arm");
         $$7.a("left_sleeve", get.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), geq.a);
         $$8.a("right_sleeve", get.c().a(40, 32).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), geq.a);
      }

      gey $$9 = $$3.a("left_leg", get.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), geq.a(1.9F, 12.0F, 0.0F));
      gey $$10 = $$3.b("right_leg");
      $$9.a("left_pants", get.c().a(0, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), geq.a);
      $$10.a("right_pants", get.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), geq.a);
      gey $$11 = $$3.b("body");
      $$11.a("jacket", get.c().a(16, 32).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.25F)), geq.a);
      return $$2;
   }

   public void a(gzg $$0) {
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
   public void a(bwa $$0, fgs $$1) {
      this.e().a($$1);
      geo $$2 = this.a($$0);
      if (this.A) {
         float $$3 = 0.5F * (float)($$0 == bwa.b ? 1 : -1);
         $$2.b += $$3;
         $$2.a($$1);
         $$2.b -= $$3;
      } else {
         $$2.a($$1);
      }
   }

   public geo a(bam $$0) {
      return ae.a(this.z, $$0);
   }

   protected gbz.a a(gzg $$0, bwa $$1) {
      return gwx.a($$0, $$1);
   }
}
