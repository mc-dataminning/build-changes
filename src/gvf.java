public class gvf extends gsa<cqc, haw> {
   private static final aku a = aku.b("textures/entity/wither/wither_invulnerable.png");
   private static final aku b = aku.b("textures/entity/wither/wither.png");
   private final gdu h;

   public gvf(gsb.a $$0) {
      super($$0);
      this.h = new gdu($$0.a(gez.dG));
   }

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      $$1.a("head", gff.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gfc.a);
      return gfg.a($$0, 64, 64);
   }

   protected int a(cqc $$0, ji $$1) {
      return 15;
   }

   public void a(haw $$0, ffs $$1, glv $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      ffw $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hec.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private aku a(haw $$0) {
      return $$0.a ? a : b;
   }

   public haw b() {
      return new haw();
   }

   public void a(cqc $$0, haw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.v();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
