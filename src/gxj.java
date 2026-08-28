public class gxj extends gue<crp, hcy> {
   private static final ald a = ald.b("textures/entity/wither/wither_invulnerable.png");
   private static final ald g = ald.b("textures/entity/wither/wither.png");
   private final gfx h;

   public gxj(guf.a $$0) {
      super($$0);
      this.h = new gfx($$0.a(ghc.dS));
   }

   public static ghj a() {
      ghl $$0 = new ghl();
      ghn $$1 = $$0.a();
      $$1.a("head", ghi.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), ghf.a);
      return ghj.a($$0, 64, 64);
   }

   protected int a(crp $$0, jj $$1) {
      return 15;
   }

   public void a(hcy $$0, fho $$1, gny $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fhs $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hgi.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private ald a(hcy $$0) {
      return $$0.a ? a : g;
   }

   public hcy b() {
      return new hcy();
   }

   public void a(crp $$0, hcy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      $$1.c = $$0.l($$2);
      $$1.b = $$0.k($$2);
   }
}
