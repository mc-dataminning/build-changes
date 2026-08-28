public class gog extends gqg<cmr, gus, fyl> {
   private static final all a = all.b("textures/entity/breeze/breeze.png");

   public gog(gpa.a $$0) {
      super($$0, new fyl($$0.a(gcb.B)), 0.5F);
      this.a(new gsm($$0, this));
      this.a(new gsl(this));
   }

   public void a(gus $$0, fek $$1, gix $$2, int $$3) {
      fyl $$4 = this.e();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public all a(gus $$0) {
      return a;
   }

   public gus a() {
      return new gus();
   }

   public void a(cmr $$0, gus $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.bY);
      $$1.b.a($$0.c);
      $$1.c.a($$0.d);
      $$1.d.a($$0.bZ);
      $$1.e.a($$0.e);
   }

   public static fyl a(fyl $$0, gcc... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gcc $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
