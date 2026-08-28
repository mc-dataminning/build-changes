public class guq extends gsb<cqd, ham> {
   public static final aku a = aku.b("textures/entity/trident.png");
   private final geg b;

   public guq(gsc.a $$0) {
      super($$0);
      this.b = new geg($$0.a(gfb.dl));
   }

   public void a(ham $$0, ffu $$1, glx $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      ffy $$4 = gta.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, hea.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public ham a() {
      return new ham();
   }

   public void a(cqd $$0, ham $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.D();
   }
}
