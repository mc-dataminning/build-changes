import java.util.concurrent.CompletableFuture;

public class pn extends pc {
   public pn(js.a $$0, pb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a() {
      this.a(cso.a(csq.b));
      this.e(cxo.qR, dkg.ap);
      this.a(dkg.v, ayd.t, 4);
      this.a((dgz)dkg.u, (dgz)dkg.ae);
      this.a((dgz)dkg.aI, (dgz)dkg.ap);
      this.b(cxo.oC, dkg.v);
      this.c(cxo.oD, cxo.oC);
      this.f(dkg.tQ, dkg.tP);
   }

   public static class a extends pc.b {
      public a(mj $$0, CompletableFuture<js.a> $$1) {
         super($$0, $$1);
      }

      @Override
      protected pc a(js.a $$0, pb $$1) {
         return new pn($$0, $$1);
      }

      @Override
      public String a() {
         return "Winter Drop Recipes";
      }
   }
}
