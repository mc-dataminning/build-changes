public class gud extends gro<crc, gzw> {
   public static final alz a = alz.b("textures/entity/trident.png");
   private final gdr b;

   public gud(grp.a $$0) {
      super($$0);
      this.b = new gdr($$0.a(gem.dg));
   }

   public void a(gzw $$0, fgr $$1, glk $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fgv $$4 = gsn.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, hbb.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzw a() {
      return new gzw();
   }

   public void a(crc $$0, gzw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.C();
   }
}
