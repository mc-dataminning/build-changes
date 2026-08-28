public class gqt extends gsu<cns, gxh, gau> {
   private static final alz a = alz.b("textures/entity/breeze/breeze.png");

   public gqt(gro.a $$0) {
      super($$0, new gau($$0.a(gel.H)), 0.5F);
      this.a(new gvb($$0, this));
      this.a(new gva(this));
   }

   public void a(gxh $$0, fgq $$1, glj $$2, int $$3) {
      gau $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alz a(gxh $$0) {
      return a;
   }

   public gxh a() {
      return new gxh();
   }

   public void a(cns $$0, gxh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.bZ);
      $$1.b.a($$0.b);
      $$1.c.a($$0.c);
      $$1.d.a($$0.ca);
      $$1.e.a($$0.d);
   }

   public static gau a(gau $$0, gem... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gem $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
