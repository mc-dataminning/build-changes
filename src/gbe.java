public class gbe extends gde<cgc, fmn<cgc>> {
   private static final ajc a = new ajc("textures/entity/breeze/breeze.png");

   public gbe(gby.a $$0) {
      super($$0, new fmn<>($$0.a(fqe.o)), 0.5F);
      this.a(new gfi(this));
      this.a(new gfh(this));
   }

   public void a(cgc $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      fmn<cgc> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajc a(cgc $$0) {
      return a;
   }

   public static fmn<cgc> a(fmn<cgc> $$0, fqf... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fqf $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
