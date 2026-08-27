public class fxa<T extends biy> extends fww<T, fgm<T>> {
   private final feo<T> a;

   public fxa(fuj<T, fgm<T>> $$0, fhj $$1) {
      super($$0);
      this.a = new fgm<>($$1.a(fhm.bn));
   }

   public void a(elg $$0, fnl $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      eqm $$10 = eqm.O();
      boolean $$11 = $$10.b($$3) && $$3.cd();
      if (!$$3.cd() || $$11) {
         elk $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fnt.q(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fnt.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, ftp.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
