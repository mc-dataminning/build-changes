public class fwc<S extends gub> extends fxx<S> {
   private static final String w = "left_sleeve";
   private static final String x = "right_sleeve";
   private static final String y = "left_pants";
   private static final String z = "right_pants";
   public final gal a = this.s.b("left_sleeve");
   public final gal b = this.r.b("right_sleeve");
   public final gal c = this.u.b("left_pants");
   public final gal d = this.t.b("right_pants");
   public final gal e = this.q.b("jacket");
   public final gal f = this.o.b("right_ear");
   public final gal g = this.o.b("left_ear");

   public fwc(gal $$0) {
      super($$0, ghq::i);
   }

   public static gat a(gap $$0) {
      gat $$1 = fyp.a($$0, false);
      gav $$2 = $$1.a();
      $$2.a("body", gaq.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), gan.a);
      gav $$3 = a($$0, $$1);
      $$3.a("hat");
      return $$1;
   }

   public static gav a(gap $$0, gat $$1) {
      gav $$2 = $$1.a();
      gav $$3 = $$2.a(
         "head",
         gaq.c()
            .a(0, 0)
            .a(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, $$0)
            .a(31, 1)
            .a(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, $$0)
            .a(2, 4)
            .a(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0)
            .a(2, 0)
            .a(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0),
         gan.a
      );
      $$3.a("left_ear", gaq.c().a(51, 6).a(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), gan.a(4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 6)));
      $$3.a("right_ear", gaq.c().a(39, 6).a(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), gan.a(-4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 6)));
      return $$3;
   }

   @Override
   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.X;
      float $$2 = $$0.Y;
      float $$3 = (float) (Math.PI / 6);
      float $$4 = $$0.p * 0.1F + $$1 * 0.5F;
      float $$5 = 0.08F + $$2 * 0.4F;
      this.g.g = (float) (-Math.PI / 6) - azd.b($$4 * 1.2F) * $$5;
      this.f.g = (float) (Math.PI / 6) + azd.b($$4) * $$5;
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
}
