public class gsn extends gtn<gwo, gaf> {
   private final fzn<gwo> a;
   private final hba b;

   public gsn(gqw<gwo, gaf> $$0, gby $$1, hba $$2) {
      super($$0);
      this.a = new gad<>($$1.a(gcb.bK));
      this.b = $$2;
   }

   private boolean a(cwf $$0, ddp.d $$1) {
      ddr $$2 = $$0.a(ku.D);
      if ($$2 != null && !$$2.c().isEmpty()) {
         ddp $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fek $$0, gix $$1, int $$2, gwo $$3, float $$4, float $$5) {
      if (!$$3.u && $$3.aw) {
         gzu $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.Q, ddp.d.c)) {
               $$0.a();
               if (this.a($$3.Q, ddp.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               feo $$7 = $$1.getBuffer(gjh.c($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, gyk.d);
               $$0.b();
            }
         }
      }
   }
}
