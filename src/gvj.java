public class gvj extends gse<cqf, hba> {
   private static final akv a = akv.b("textures/entity/wither/wither_invulnerable.png");
   private static final akv b = akv.b("textures/entity/wither/wither.png");
   private final gdy h;

   public gvj(gsf.a $$0) {
      super($$0);
      this.h = new gdy($$0.a(gfd.dG));
   }

   public static gfk a() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      $$1.a("head", gfj.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gfg.a);
      return gfk.a($$0, 64, 64);
   }

   protected int a(cqf $$0, ji $$1) {
      return 15;
   }

   public void a(hba $$0, ffv $$1, glz $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      ffz $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hej.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private akv a(hba $$0) {
      return $$0.a ? a : b;
   }

   public hba b() {
      return new hba();
   }

   public void a(cqf $$0, hba $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.v();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
