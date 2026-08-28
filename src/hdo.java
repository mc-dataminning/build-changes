import java.util.List;
import java.util.function.Function;

public class hdo implements heb {
   private final alp a;
   private List<gmw> b = List.of();

   public hdo(alp $$0) {
      this.a = $$0;
   }

   @Override
   public void a(heb.a $$0) {
      if ($$0.a(this.a) instanceof gms $$2) {
         this.b = $$2.e();
         this.b.forEach($$1 -> $$0.a($$1.a()));
      }
   }

   @Override
   public hdi a(hdr $$0, Function<hdp, hbg> $$1, hdx $$2) {
      hdi $$3 = $$0.a(this.a, $$2);
      if (this.b.isEmpty()) {
         return $$3;
      } else {
         gmm $$4 = new gmm($$0, this.b);
         return new hdo.a($$3, $$4);
      }
   }

   static class a extends hdm {
      private final gmm b;

      public a(hdi $$0, gmm $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      public gmm g() {
         return this.b;
      }
   }
}
