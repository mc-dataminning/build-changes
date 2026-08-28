import java.util.List;

public class fyp extends fxx<guw> {
   private static final String f = "left_sleeve";
   private static final String g = "right_sleeve";
   private static final String w = "left_pants";
   private static final String x = "right_pants";
   private final List<gal> y;
   public final gal a;
   public final gal b;
   public final gal c;
   public final gal d;
   public final gal e;
   private final boolean z;

   public fyp(gal $$0, boolean $$1) {
      super($$0, ghq::i);
      this.z = $$1;
      this.a = this.s.b("left_sleeve");
      this.b = this.r.b("right_sleeve");
      this.c = this.u.b("left_pants");
      this.d = this.t.b("right_pants");
      this.e = this.q.b("jacket");
      this.y = List.of(this.o, this.q, this.s, this.r, this.u, this.t);
   }

   public static gat a(gap $$0, boolean $$1) {
      gat $$2 = fxx.a($$0, 0.0F);
      gav $$3 = $$2.a();
      float $$4 = 0.25F;
      if ($$1) {
         gav $$5 = $$3.a("left_arm", gaq.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gan.a(5.0F, 2.0F, 0.0F));
         gav $$6 = $$3.a("right_arm", gaq.c().a(40, 16).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), gan.a(-5.0F, 2.0F, 0.0F));
         $$5.a("left_sleeve", gaq.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gan.a);
         $$6.a("right_sleeve", gaq.c().a(40, 32).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), gan.a);
      } else {
         gav $$7 = $$3.a("left_arm", gaq.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gan.a(5.0F, 2.0F, 0.0F));
         gav $$8 = $$3.b("right_arm");
         $$7.a("left_sleeve", gaq.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gan.a);
         $$8.a("right_sleeve", gaq.c().a(40, 32).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gan.a);
      }

      gav $$9 = $$3.a("left_leg", gaq.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gan.a(1.9F, 12.0F, 0.0F));
      gav $$10 = $$3.b("right_leg");
      $$9.a("left_pants", gaq.c().a(0, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gan.a);
      $$10.a("right_pants", gaq.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), gan.a);
      gav $$11 = $$3.b("body");
      $$11.a("jacket", gaq.c().a(16, 32).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.25F)), gan.a);
      return $$2;
   }

   public void a(guw $$0) {
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
   public void a(bue $$0, fde $$1) {
      this.a().a($$1);
      gal $$2 = this.a($$0);
      if (this.z) {
         float $$3 = 0.5F * (float)($$0 == bue.b ? 1 : -1);
         $$2.b += $$3;
         $$2.a($$1);
         $$2.b -= $$3;
      } else {
         $$2.a($$1);
      }
   }

   public gal a(azl $$0) {
      return ad.a(this.y, $$0);
   }

   protected fxx.a a(guw $$0, bue $$1) {
      fxx.a $$2 = gso.a($$0, $$0.aB, bro.a);
      fxx.a $$3 = gso.a($$0, $$0.aC, bro.b);
      if ($$2.a()) {
         $$3 = $$0.aC.a ? fxx.a.a : fxx.a.b;
      }

      return $$0.ap == $$1 ? $$2 : $$3;
   }
}
