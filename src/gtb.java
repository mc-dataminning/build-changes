public class gtb extends gsx<gwj, gai> {
   private final gai a;

   public gtb(gqg<gwj, gai> $$0, gbi $$1) {
      super($$0);
      this.a = new gai($$1.a(gbl.ct));
   }

   public void a(feb $$0, gih $$1, int $$2, gwj $$3, float $$4, float $$5) {
      boolean $$6 = $$3.aj && $$3.u;
      if (!$$3.u || $$6) {
         fef $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gir.r(gqn.a));
         } else {
            $$7 = $$1.getBuffer(gir.i(gqn.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gpl.a($$3, 0.0F));
      }
   }
}
