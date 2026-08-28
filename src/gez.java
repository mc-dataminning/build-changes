public class gez<S extends hdw> extends ghd<S> {
   private static final String x = "left_sleeve";
   private static final String y = "right_sleeve";
   private static final String z = "left_pants";
   private static final String A = "right_pants";
   public final gjt a = this.s.b("left_sleeve");
   public final gjt b = this.r.b("right_sleeve");
   public final gjt c = this.u.b("left_pants");
   public final gjt d = this.t.b("right_pants");
   public final gjt e = this.q.b("jacket");
   public final gjt f = this.o.b("right_ear");
   public final gjt g = this.o.b("left_ear");

   public gez(gjt $$0) {
      super($$0, grc::j);
   }

   public static gkb a(gjx $$0) {
      gkb $$1 = ghv.a($$0, false);
      gkd $$2 = $$1.a();
      $$2.a("body", gjy.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), gjv.a);
      gkd $$3 = a($$0, $$1);
      $$3.a("hat");
      return $$1;
   }

   public static gkd a(gjx $$0, gkb $$1) {
      gkd $$2 = $$1.a();
      gkd $$3 = $$2.a(
         "head",
         gjy.c()
            .a(0, 0)
            .a(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, $$0)
            .a(31, 1)
            .a(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, $$0)
            .a(2, 4)
            .a(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0)
            .a(2, 0)
            .a(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, $$0),
         gjv.a
      );
      $$3.a("left_ear", gjy.c().a(51, 6).a(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), gjv.a(4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 6)));
      $$3.a("right_ear", gjy.c().a(39, 6).a(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, $$0), gjv.a(-4.5F, -6.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 6)));
      return $$3;
   }

   @Override
   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.ad;
      float $$2 = $$0.ae;
      float $$3 = (float) (Math.PI / 6);
      float $$4 = $$0.u * 0.1F + $$1 * 0.5F;
      float $$5 = 0.08F + $$2 * 0.4F;
      this.g.g = (float) (-Math.PI / 6) - azm.b($$4 * 1.2F) * $$5;
      this.f.g = (float) (Math.PI / 6) + azm.b($$4) * $$5;
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
