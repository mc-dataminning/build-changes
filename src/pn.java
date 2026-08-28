import java.util.concurrent.CompletableFuture;

public class pn extends pc {
   public pn(js.a $$0, pb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a() {
      this.a(cst.a(csv.b));
      this.e(cxt.qR, dko.ap);
      this.a(dko.v, ayd.t, 4);
      this.a((dhh)dko.u, (dhh)dko.ae);
      this.a((dhh)dko.aI, (dhh)dko.ap);
      this.b(cxt.oC, dko.v);
      this.c(cxt.oD, cxt.oC);
      this.f(dko.tQ, dko.tP);
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
