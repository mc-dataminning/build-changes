public class gbg extends gac<gxr> {
   private final geo e = this.c.b("left_chest");
   private final geo f = this.c.b("right_chest");

   public gbg(geo $$0) {
      super($$0);
   }

   public static geu a() {
      gew $$0 = gac.a(ges.a);
      a($$0.a());
      return geu.a($$0, 64, 64);
   }

   public static geu b() {
      gew $$0 = gac.c(ges.a);
      a($$0.a());
      return geu.a(gac.b.apply($$0), 64, 64);
   }

   private static void a(gey $$0) {
      gey $$1 = $$0.b("body");
      get $$2 = get.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, geq.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, geq.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gey $$3 = $$0.b("head_parts").b("head");
      get $$4 = get.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, geq.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, geq.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gxr $$0) {
      super.a($$0);
      this.e.k = $$0.a;
      this.f.k = $$0.a;
   }
}
