public class gvi extends gsd<cqe, haz> {
   private static final akv a = akv.b("textures/entity/wither/wither_invulnerable.png");
   private static final akv b = akv.b("textures/entity/wither/wither.png");
   private final gdx h;

   public gvi(gse.a $$0) {
      super($$0);
      this.h = new gdx($$0.a(gfc.dG));
   }

   public static gfj a() {
      gfl $$0 = new gfl();
      gfn $$1 = $$0.a();
      $$1.a("head", gfi.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gff.a);
      return gfj.a($$0, 64, 64);
   }

   protected int a(cqe $$0, ji $$1) {
      return 15;
   }

   public void a(haz $$0, ffu $$1, gly $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      ffy $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hei.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private akv a(haz $$0) {
      return $$0.a ? a : b;
   }

   public haz b() {
      return new haz();
   }

   public void a(cqe $$0, haz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.v();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
