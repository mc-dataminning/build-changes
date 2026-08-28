public class gqo extends gsp<cno, gxc, gap> {
   private static final alz a = alz.b("textures/entity/breeze/breeze.png");

   public gqo(grj.a $$0) {
      super($$0, new gap($$0.a(geg.H)), 0.5F);
      this.a(new guw($$0, this));
      this.a(new guv(this));
   }

   public void a(gxc $$0, fgl $$1, gle $$2, int $$3) {
      gap $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alz a(gxc $$0) {
      return a;
   }

   public gxc a() {
      return new gxc();
   }

   public void a(cno $$0, gxc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.bZ);
      $$1.b.a($$0.b);
      $$1.c.a($$0.c);
      $$1.d.a($$0.ca);
      $$1.e.a($$0.d);
   }

   public static gap a(gap $$0, geh... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (geh $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
