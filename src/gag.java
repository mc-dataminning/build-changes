public class gag extends gcg<cfn, flr<cfn>> {
   private static final aiy a = new aiy("textures/entity/breeze/breeze.png");

   public gag(gba.a $$0) {
      super($$0, new flr<>($$0.a(fpi.o)), 0.5F);
      this.a(new gek(this));
      this.a(new gej(this));
   }

   public void a(cfn $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      flr<cfn> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cfn $$0) {
      return a;
   }

   public static flr<cfn> a(flr<cfn> $$0, fpj... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fpj $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
