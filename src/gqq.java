public class gqq extends gsr<cnk, gxe, gar> {
   private static final alp a = alp.b("textures/entity/breeze/breeze.png");

   public gqq(grl.a $$0) {
      super($$0, new gar($$0.a(gei.K)), 0.5F);
      this.a(new guy($$0, this));
      this.a(new gux(this));
   }

   public void a(gxe $$0, fgl $$1, glg $$2, int $$3) {
      gar $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alp a(gxe $$0) {
      return a;
   }

   public gxe a() {
      return new gxe();
   }

   public void a(cnk $$0, gxe $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bZ);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.ca);
      $$1.f.a($$0.d);
   }

   public static gar a(gar $$0, gej... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gej $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
