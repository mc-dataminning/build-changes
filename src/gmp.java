public class gmp extends gop<clw, gta, fwv> {
   private static final alc a = alc.b("textures/entity/breeze/breeze.png");

   public gmp(gnj.a $$0) {
      super($$0, new fwv($$0.a(gak.B)), 0.5F);
      this.a(new gqv($$0, this));
      this.a(new gqu(this));
   }

   public void a(gta $$0, fde $$1, ghg $$2, int $$3) {
      fwv $$4 = this.e();
      a($$4, $$4.b(), $$4.d());
      super.a($$0, $$1, $$2, $$3);
   }

   public alc a(gta $$0) {
      return a;
   }

   public gta a() {
      return new gta();
   }

   public void a(clw $$0, gta $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.bY);
      $$1.b.a($$0.c);
      $$1.c.a($$0.d);
      $$1.d.a($$0.bZ);
      $$1.e.a($$0.e);
   }

   public static fwv a(fwv $$0, gal... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (gal $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
