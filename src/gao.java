import java.util.List;

public class gao extends fzw<gwz> {
   private static final String f = "left_sleeve";
   private static final String g = "right_sleeve";
   private static final String x = "left_pants";
   private static final String y = "right_pants";
   private final List<gcl> z;
   public final gcl a;
   public final gcl b;
   public final gcl c;
   public final gcl d;
   public final gcl e;
   private final boolean A;

   public gao(gcl $$0, boolean $$1) {
      super($$0, gjq::i);
      this.A = $$1;
      this.a = this.s.b("left_sleeve");
      this.b = this.r.b("right_sleeve");
      this.c = this.u.b("left_pants");
      this.d = this.t.b("right_pants");
      this.e = this.q.b("jacket");
      this.z = List.of(this.o, this.q, this.s, this.r, this.u, this.t);
   }

   public static gct a(gcp $$0, boolean $$1) {
      gct $$2 = fzw.a($$0, 0.0F);
      gcv $$3 = $$2.a();
      float $$4 = 0.25F;
      if ($$1) {
         gcv $$5 = $$3.a("left_arm", gcq.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gcn.a(5.0F, 2.0F, 0.0F));
         gcv $$6 = $$3.a("right_arm", gcq.c().a(40, 16).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gcn.a(-5.0F, 2.0F, 0.0F));
         $$5.a("left_sleeve", gcq.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gcn.a);
         $$6.a("right_sleeve", gcq.c().a(40, 32).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gcn.a);
      } else {
         gcv $$7 = $$3.a("left_arm", gcq.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gcn.a(5.0F, 2.0F, 0.0F));
         gcv $$8 = $$3.b("right_arm");
         $$7.a("left_sleeve", gcq.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gcn.a);
         $$8.a("right_sleeve", gcq.c().a(40, 32).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gcn.a);
      }

      gcv $$9 = $$3.a("left_leg", gcq.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gcn.a(1.9F, 12.0F, 0.0F));
      gcv $$10 = $$3.b("right_leg");
      $$9.a("left_pants", gcq.c().a(0, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gcn.a);
      $$10.a("right_pants", gcq.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gcn.a);
      gcv $$11 = $$3.b("body");
      $$11.a("jacket", gcq.c().a(16, 32).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.25F)), gcn.a);
      return $$2;
   }

   public void a(gwz $$0) {
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
   public void a(bvb $$0, fer $$1) {
      this.e().a($$1);
      gcl $$2 = this.a($$0);
      if (this.A) {
         float $$3 = 0.5F * (float)($$0 == bvb.b ? 1 : -1);
         $$2.b += $$3;
         $$2.a($$1);
         $$2.b -= $$3;
      } else {
         $$2.a($$1);
      }
   }

   public gcl a(azu $$0) {
      return ae.a(this.z, $$0);
   }

   protected fzw.a a(gwz $$0, bvb $$1) {
      return gur.a($$0, $$1);
   }
}
