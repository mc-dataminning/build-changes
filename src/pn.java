import java.util.concurrent.CompletableFuture;

public class pn extends pc {
   public pn(js.a $$0, pb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a() {
      this.a(css.a(csu.b));
      this.e(cxs.qR, dkn.ap);
      this.a(dkn.v, ayd.t, 4);
      this.a((dhg)dkn.u, (dhg)dkn.ae);
      this.a((dhg)dkn.aI, (dhg)dkn.ap);
      this.b(cxs.oC, dkn.v);
      this.c(cxs.oD, cxs.oC);
      this.f(dkn.tQ, dkn.tP);
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
