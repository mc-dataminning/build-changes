public class fyg extends gag<cds, fjs<cds>> {
   private static final ahh a = new ahh("textures/entity/breeze/breeze.png");

   public fyg(fza.a $$0) {
      super($$0, new fjs<>($$0.a(fni.o)), 0.5F);
      this.a(new gck(this));
      this.a(new gcj(this));
   }

   public void a(cds $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      fjs<cds> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahh a(cds $$0) {
      return a;
   }

   public static fjs<cds> a(fjs<cds> $$0, fnj... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fnj $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
