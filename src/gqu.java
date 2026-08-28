public class gqu extends gsv<cns, gxi, gav> {
   private static final alz a = alz.b("textures/entity/breeze/breeze.png");

   public gqu(grp.a $$0) {
      super($$0, new gav($$0.a(gem.H)), 0.5F);
      this.a(new gvc($$0, this));
      this.a(new gvb(this));
   }

   public void a(gxi $$0, fgr $$1, glk $$2, int $$3) {
      gav $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alz a(gxi $$0) {
      return a;
   }

   public gxi a() {
      return new gxi();
   }

   public void a(cns $$0, gxi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bZ);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.ca);
      $$1.f.a($$0.d);
   }

   public static gav a(gav $$0, gen... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gen $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
