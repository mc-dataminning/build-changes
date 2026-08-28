public class gzx extends gws<cst, hfn> {
   private static final alg a = alg.b("textures/entity/wither/wither_invulnerable.png");
   private static final alg g = alg.b("textures/entity/wither/wither.png");
   private final gih h;

   public gzx(gwt.a $$0) {
      super($$0);
      this.h = new gih($$0.a(gjn.dY));
   }

   public static gju a() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      $$1.a("head", gjt.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gjq.a);
      return gju.a($$0, 64, 64);
   }

   protected int a(cst $$0, iv $$1) {
      return 15;
   }

   public void a(hfn $$0, fjy $$1, gqm $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fkc $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hja.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private alg a(hfn $$0) {
      return $$0.a ? a : g;
   }

   public hfn b() {
      return new hfn();
   }

   public void a(cst $$0, hfn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      $$1.c = $$0.l($$2);
      $$1.b = $$0.k($$2);
   }
}
