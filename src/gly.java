public class gly extends gny<clr, gsj, fwl> {
   private static final alb a = alb.b("textures/entity/breeze/breeze.png");

   public gly(gms.a $$0) {
      super($$0, new fwl($$0.a(gaa.B)), 0.5F);
      this.a(new gqe($$0, this));
      this.a(new gqd(this));
   }

   public void a(gsj $$0, fcu $$1, ggv $$2, int $$3) {
      fwl $$4 = this.e();
      a($$4, $$4.b(), $$4.d());
      super.a($$0, $$1, $$2, $$3);
   }

   public alb a(gsj $$0) {
      return a;
   }

   public gsj a() {
      return new gsj();
   }

   public void a(clr $$0, gsj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.bZ);
      $$1.b.a($$0.c);
      $$1.c.a($$0.d);
      $$1.d.a($$0.ca);
      $$1.e.a($$0.e);
   }

   public static fwl a(fwl $$0, gab... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (gab $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
