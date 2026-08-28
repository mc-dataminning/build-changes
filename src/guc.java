public class guc extends gty<gxk, gbh> {
   private final gbh a;

   public guc(grh<gxk, gbh> $$0, gch $$1) {
      super($$0);
      this.a = new gbh($$1.a(gck.cJ));
   }

   public void a(fer $$0, gjg $$1, int $$2, gxk $$3, float $$4, float $$5) {
      boolean $$6 = $$3.aj && $$3.u;
      if (!$$3.u || $$6) {
         fev $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(gjq.r(gro.a));
         } else {
            $$7 = $$1.getBuffer(gjq.i(gro.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gql.a($$3, 0.0F));
      }
   }
}
