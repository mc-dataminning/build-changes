public class gvh extends gsc<cqd, hay> {
   private static final akv a = akv.b("textures/entity/wither/wither_invulnerable.png");
   private static final akv b = akv.b("textures/entity/wither/wither.png");
   private final gdw h;

   public gvh(gsd.a $$0) {
      super($$0);
      this.h = new gdw($$0.a(gfb.dG));
   }

   public static gfi a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      $$1.a("head", gfh.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gfe.a);
      return gfi.a($$0, 64, 64);
   }

   protected int a(cqd $$0, ji $$1) {
      return 15;
   }

   public void a(hay $$0, fft $$1, glx $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      ffx $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, heh.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private akv a(hay $$0) {
      return $$0.a ? a : b;
   }

   public hay b() {
      return new hay();
   }

   public void a(cqd $$0, hay $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.v();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
