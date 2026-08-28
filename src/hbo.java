public class hbo extends gyj<ctj, hhf> {
   private static final alk a = alk.b("textures/entity/wither/wither_invulnerable.png");
   private static final alk g = alk.b("textures/entity/wither/wither.png");
   private final gjz h;

   public hbo(gyk.a $$0) {
      super($$0);
      this.h = new gjz($$0.a(glf.ea));
   }

   public static glm a() {
      glo $$0 = new glo();
      glq $$1 = $$0.a();
      $$1.a("head", gll.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gli.a);
      return glm.a($$0, 64, 64);
   }

   protected int a(ctj $$0, iw $$1) {
      return 15;
   }

   public void a(hhf $$0, flq $$1, gsc $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      flt $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hks.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private alk a(hhf $$0) {
      return $$0.a ? a : g;
   }

   public hhf b() {
      return new hhf();
   }

   public void a(ctj $$0, hhf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      $$1.c = $$0.l($$2);
      $$1.b = $$0.k($$2);
   }
}
