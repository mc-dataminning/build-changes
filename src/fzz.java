public class fzz extends gbz<cfj, flk<cfj>> {
   private static final aiy a = new aiy("textures/entity/breeze/breeze.png");

   public fzz(gat.a $$0) {
      super($$0, new flk<>($$0.a(fpb.o)), 0.5F);
      this.a(new ged(this));
      this.a(new gec(this));
   }

   public void a(cfj $$0, float $$1, float $$2, esa $$3, fvm $$4, int $$5) {
      flk<cfj> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cfj $$0) {
      return a;
   }

   public static flk<cfj> a(flk<cfj> $$0, fpc... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fpc $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
