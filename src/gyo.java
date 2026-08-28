public class gyo extends gvj<csb, hed> {
   private static final ale a = ale.b("textures/entity/wither/wither_invulnerable.png");
   private static final ale g = ale.b("textures/entity/wither/wither.png");
   private final gha h;

   public gyo(gvk.a $$0) {
      super($$0);
      this.h = new gha($$0.a(gif.dS));
   }

   public static gim a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("head", gil.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gii.a);
      return gim.a($$0, 64, 64);
   }

   protected int a(csb $$0, iu $$1) {
      return 15;
   }

   public void a(hed $$0, fiq $$1, gpd $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fiu $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hhp.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private ale a(hed $$0) {
      return $$0.a ? a : g;
   }

   public hed b() {
      return new hed();
   }

   public void a(csb $$0, hed $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      $$1.c = $$0.l($$2);
      $$1.b = $$0.k($$2);
   }
}
