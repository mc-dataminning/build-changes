import java.util.List;
import java.util.function.Function;

public class hdr implements hee {
   private final alz a;
   private List<gmz> b = List.of();

   public hdr(alz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hee.a $$0) {
      if ($$0.a(this.a) instanceof gmv $$2) {
         this.b = $$2.e();
         this.b.forEach($$1 -> $$0.a($$1.a()));
      }
   }

   @Override
   public hdl a(hdu $$0, Function<hds, hbj> $$1, hea $$2) {
      hdl $$3 = $$0.a(this.a, $$2);
      if (this.b.isEmpty()) {
         return $$3;
      } else {
         gmp $$4 = new gmp($$0, this.b);
         return new hdr.a($$3, $$4);
      }
   }

   static class a extends hdp {
      private final gmp b;

      public a(hdl $$0, gmp $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      public gmp g() {
         return this.b;
      }
   }
}
