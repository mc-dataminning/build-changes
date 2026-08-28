import java.util.List;
import java.util.function.Function;

public class hbb implements hbo {
   private final all a;
   private List<gkn> b = List.of();

   public hbb(all $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hbo.a $$0) {
      if ($$0.a(this.a) instanceof gkj $$2) {
         this.b = $$2.e();
         this.b.forEach($$1 -> $$0.a($$1.a()));
      }
   }

   @Override
   public hav a(hbe $$0, Function<hbc, gyt> $$1, hbk $$2) {
      hav $$3 = $$0.a(this.a, $$2);
      if (this.b.isEmpty()) {
         return $$3;
      } else {
         gkd $$4 = new gkd($$0, this.b);
         return new hbb.a($$3, $$4);
      }
   }

   static class a extends haz {
      private final gkd b;

      public a(hav $$0, gkd $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      public gkd g() {
         return this.b;
      }
   }
}
