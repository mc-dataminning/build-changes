public class gus extends grn<crd, hag> {
   private static final alz a = alz.b("textures/entity/wither/wither_invulnerable.png");
   private static final alz b = alz.b("textures/entity/wither/wither.png");
   private final gdg h;

   public gus(gro.a $$0) {
      super($$0);
      this.h = new gdg($$0.a(gel.dA));
   }

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      $$1.a("head", ger.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), geo.a);
      return ges.a($$0, 64, 64);
   }

   protected int a(crd $$0, jh $$1) {
      return 15;
   }

   public void a(hag $$0, fgq $$1, glj $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fgu $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, hba.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private alz a(hag $$0) {
      return $$0.a ? a : b;
   }

   public hag b() {
      return new hag();
   }

   public void a(crd $$0, hag $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.v();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
