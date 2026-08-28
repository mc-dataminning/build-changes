public class hbm extends gyh<cth, hhd> {
   private static final ali a = ali.b("textures/entity/wither/wither_invulnerable.png");
   private static final ali g = ali.b("textures/entity/wither/wither.png");
   private final gjx h;

   public hbm(gyi.a $$0) {
      super($$0);
      this.h = new gjx($$0.a(gld.ea));
   }

   public static glk a() {
      glm $$0 = new glm();
      glo $$1 = $$0.a();
      $$1.a("head", glj.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), glg.a);
      return glk.a($$0, 64, 64);
   }

   protected int a(cth $$0, iv $$1) {
      return 15;
   }

   public void a(hhd $$0, flo $$1, gsa $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      flr $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hkq.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private ali a(hhd $$0) {
      return $$0.a ? a : g;
   }

   public hhd b() {
      return new hhd();
   }

   public void a(cth $$0, hhd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      $$1.c = $$0.l($$2);
      $$1.b = $$0.k($$2);
   }
}
