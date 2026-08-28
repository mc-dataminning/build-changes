import java.util.concurrent.CompletableFuture;

public class ph extends ox {
   ph(js.a $$0, ow $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a() {
      this.a(ov.e, cwj.qV).a('-', cwj.pt).a('#', cwj.qE).b("-").b("#").b("has_string", this.a(cwj.pt)).a(this.b);
      this.b();
   }

   private void b() {
      dap $$0 = this.b(axm.bS);

      for (cvc $$1 : cvc.values()) {
         pf.a(ov.e, $$0, dap.a(cvd.a($$1)), cus.a($$1)).b("bundle_dye").b("has_bundle", this.a(axm.bS)).a(this.b);
      }
   }

   public static class a extends ox.b {
      public a(mi $$0, CompletableFuture<js.a> $$1) {
         super($$0, $$1);
      }

      @Override
      protected ox a(js.a $$0, ow $$1) {
         return new ph($$0, $$1);
      }

      @Override
      public String a() {
         return "Bundle Recipes";
      }
   }
}
