public class gqv extends gsw<cnt, gxj, gaw> {
   private static final alz a = alz.b("textures/entity/breeze/breeze.png");

   public gqv(grq.a $$0) {
      super($$0, new gaw($$0.a(gen.H)), 0.5F);
      this.a(new gvd($$0, this));
      this.a(new gvc(this));
   }

   public void a(gxj $$0, fgs $$1, gll $$2, int $$3) {
      gaw $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alz a(gxj $$0) {
      return a;
   }

   public gxj a() {
      return new gxj();
   }

   public void a(cnt $$0, gxj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bZ);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.ca);
      $$1.f.a($$0.d);
   }

   public static gaw a(gaw $$0, geo... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (geo $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
