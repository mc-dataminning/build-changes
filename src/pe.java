import java.util.concurrent.CompletableFuture;

public class pe extends ov {
   pe(jr.a $$0, ou $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a() {
      this.a(ot.e, cwb.qV).a('-', cwb.pt).a('#', cwb.qE).b("-").b("#").b("has_string", this.a(cwb.pt)).a(this.b);
   }

   public static class a extends ov.b {
      public a(mg $$0, CompletableFuture<jr.a> $$1) {
         super($$0, $$1);
      }

      @Override
      protected ov a(jr.a $$0, ou $$1) {
         return new pe($$0, $$1);
      }

      @Override
      public String a() {
         return "Bundle Recipes";
      }
   }
}
