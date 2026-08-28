public class grf extends gsp<cmi, gxn, gbd<gxn>> {
   private static final alz a = alz.b("textures/entity/enderman/enderman.png");
   private final bam b = bam.a();

   public grf(grj.a $$0) {
      super($$0, new gbd<>($$0.a(geg.aE)), 0.5F);
      this.a(new gvg(this));
      this.a(new guy(this, $$0.d()));
   }

   public fbs a(gxn $$0) {
      fbs $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alz b(gxn $$0) {
      return a;
   }

   public gxn a() {
      return new gxn();
   }

   public void a(cmi $$0, gxn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsa.a($$0, $$1, $$2);
      $$1.a = $$0.gm();
      $$1.b = $$0.x();
   }
}
