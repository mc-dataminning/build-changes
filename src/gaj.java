public class gaj<T extends blg> extends gaf<T, fjn<T>> {
   private final fhp<T> a;

   public gaj(fxs<T, fjn<T>> $$0, fkk $$1) {
      super($$0);
      this.a = new fjn<>($$1.a(fkn.bn));
   }

   public void a(enw $$0, fqu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      etd $$10 = etd.N();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         eoa $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(frc.q(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(frc.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fwy.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
