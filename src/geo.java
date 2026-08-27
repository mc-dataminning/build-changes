public class geo extends ggo<chv, fpv<chv>> {
   private static final ajt a = new ajt("textures/entity/breeze/breeze.png");

   public geo(gfi.a $$0) {
      super($$0, new fpv<>($$0.a(ftl.s)), 0.5F);
      this.a(new gis(this));
      this.a(new gir(this));
   }

   public void a(chv $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      fpv<chv> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajt a(chv $$0) {
      return a;
   }

   public static fpv<chv> a(fpv<chv> $$0, ftm... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (ftm $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
