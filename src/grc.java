public class grc extends gny<cpp, gwp> {
   private static final alh a = alh.b("textures/entity/wither/wither_invulnerable.png");
   private static final alh b = alh.b("textures/entity/wither/wither.png");
   private final fzv h;

   public grc(gnz.a $$0) {
      super($$0);
      this.h = new fzv($$0.a(gba.df));
   }

   public static gbh a() {
      gbj $$0 = new gbj();
      gbl $$1 = $$0.a();
      $$1.a("head", gbg.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gbd.a);
      return gbh.a($$0, 64, 64);
   }

   protected int a(cpp $$0, jg $$1) {
      return 15;
   }

   public void a(gwp $$0, fdt $$1, ghw $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fdx $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, gxj.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private alh a(gwp $$0) {
      return $$0.a ? a : b;
   }

   public gwp c() {
      return new gwp();
   }

   public void a(cpp $$0, gwp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.w();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
