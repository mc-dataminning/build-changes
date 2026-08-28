public class gut extends gse<cqe, hap> {
   public static final akv a = akv.b("textures/entity/trident.png");
   private final gei b;

   public gut(gsf.a $$0) {
      super($$0);
      this.b = new gei($$0.a(gfd.dl));
   }

   public void a(hap $$0, ffv $$1, glz $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      ffz $$4 = gtd.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, hej.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hap a() {
      return new hap();
   }

   public void a(cqe $$0, hap $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.D();
   }
}
