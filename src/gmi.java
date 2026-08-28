public class gmi implements fgw {
   private final fgw a;
   private final hbl b;

   public gmi(fgw $$0, hbl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public fgw a(float $$0, float $$1, float $$2) {
      return this.a.a($$0, $$1, $$2);
   }

   @Override
   public fgw a(int $$0, int $$1, int $$2, int $$3) {
      return this.a.a($$0, $$1, $$2, $$3);
   }

   @Override
   public fgw a(float $$0, float $$1) {
      return this.a.a(this.b.a($$0), this.b.c($$1));
   }

   @Override
   public fgw a(int $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   @Override
   public fgw b(int $$0, int $$1) {
      return this.a.b($$0, $$1);
   }

   @Override
   public fgw b(float $$0, float $$1, float $$2) {
      return this.a.b($$0, $$1, $$2);
   }

   @Override
   public void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
      this.a.a($$0, $$1, $$2, $$3, this.b.a($$4), this.b.c($$5), $$6, $$7, $$8, $$9, $$10);
   }
}
