public class guc extends grn<crc, gzv> {
   public static final alz a = alz.b("textures/entity/trident.png");
   private final gdq b;

   public guc(gro.a $$0) {
      super($$0);
      this.b = new gdq($$0.a(gel.dg));
   }

   public void a(gzv $$0, fgq $$1, glj $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fgu $$4 = gsm.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, hba.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzv a() {
      return new gzv();
   }

   public void a(crc $$0, gzv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.C();
   }
}
