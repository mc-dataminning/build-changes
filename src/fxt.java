public class fxt extends fwq<gty> {
   private final gbb e = this.c.b("left_chest");
   private final gbb f = this.c.b("right_chest");

   public fxt(gbb $$0) {
      super($$0);
   }

   public static gbh a() {
      gbj $$0 = fwq.a(gbf.a);
      a($$0.a());
      return gbh.a($$0, 64, 64);
   }

   public static gbh b() {
      gbj $$0 = fwq.c(gbf.a);
      a($$0.a());
      return gbh.a(fwq.b.apply($$0), 64, 64);
   }

   private static void a(gbl $$0) {
      gbl $$1 = $$0.b("body");
      gbg $$2 = gbg.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gbd.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gbd.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gbl $$3 = $$0.b("head_parts").b("head");
      gbg $$4 = gbg.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gbd.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gbd.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(gty $$0) {
      super.a($$0);
      this.e.k = $$0.a;
      this.f.k = $$0.a;
   }
}
