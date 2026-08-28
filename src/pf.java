import java.util.concurrent.CompletableFuture;

public class pf extends ow {
   pf(js.a $$0, ov $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a() {
      this.a(ou.e, cwf.qV).a('-', cwf.pt).a('#', cwf.qE).b("-").b("#").b("has_string", this.a(cwf.pt)).a(this.b);
   }

   public static class a extends ow.b {
      public a(mh $$0, CompletableFuture<js.a> $$1) {
         super($$0, $$1);
      }

      @Override
      protected ow a(js.a $$0, ov $$1) {
         return new pf($$0, $$1);
      }

      @Override
      public String a() {
         return "Bundle Recipes";
      }
   }
}
