public class haz extends gxu<cts, hgt> {
   private static final alr a = alr.b("textures/entity/wither/wither_invulnerable.png");
   private static final alr g = alr.b("textures/entity/wither/wither.png");
   private final gjk h;

   public haz(gxv.a $$0) {
      super($$0);
      this.h = new gjk($$0.a(gkq.ea));
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      $$1.a("head", gkw.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gkt.a);
      return gkx.a($$0, 64, 64);
   }

   protected int a(cts $$0, iw $$1) {
      return 15;
   }

   public void a(hgt $$0, fld $$1, grn $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      flg $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hkg.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private alr a(hgt $$0) {
      return $$0.a ? a : g;
   }

   public hgt b() {
      return new hgt();
   }

   public void a(cts $$0, hgt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.n();
      $$1.c = $$0.l($$2);
      $$1.b = $$0.k($$2);
   }
}
