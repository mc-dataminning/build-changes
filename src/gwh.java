public class gwh extends gtc<cqy, hby> {
   private static final aku a = aku.b("textures/entity/wither/wither_invulnerable.png");
   private static final aku b = aku.b("textures/entity/wither/wither.png");
   private final gew h;

   public gwh(gtd.a $$0) {
      super($$0);
      this.h = new gew($$0.a(ggb.dI));
   }

   public static ggi a() {
      ggk $$0 = new ggk();
      ggm $$1 = $$0.a();
      $$1.a("head", ggh.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gge.a);
      return ggi.a($$0, 64, 64);
   }

   protected int a(cqy $$0, ji $$1) {
      return 15;
   }

   public void a(hby $$0, fgr $$1, gmx $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fgv $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hfh.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private aku a(hby $$0) {
      return $$0.a ? a : b;
   }

   public hby b() {
      return new hby();
   }

   public void a(cqy $$0, hby $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      $$1.c = $$0.l($$2);
      $$1.b = $$0.k($$2);
   }
}
