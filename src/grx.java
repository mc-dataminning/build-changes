public class grx extends gsx<gvy, fzp> {
   private final fyx<gvy> a;
   private final hak b;

   public grx(gqg<gvy, fzp> $$0, gbi $$1, hak $$2) {
      super($$0);
      this.a = new fzn<>($$1.a(gbl.bK));
      this.b = $$2;
   }

   private boolean a(cwb $$0, ddl.d $$1) {
      ddn $$2 = $$0.a(ku.D);
      if ($$2 != null && !$$2.c().isEmpty()) {
         ddl $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(feb $$0, gih $$1, int $$2, gvy $$3, float $$4, float $$5) {
      if (!$$3.u && $$3.aw) {
         gze $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.Q, ddl.d.c)) {
               $$0.a();
               if (this.a($$3.Q, ddl.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fef $$7 = $$1.getBuffer(gir.c($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, gxu.d);
               $$0.b();
            }
         }
      }
   }
}
