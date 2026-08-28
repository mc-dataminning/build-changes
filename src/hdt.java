import java.util.List;
import java.util.function.Function;

public class hdt implements heg {
   private final alz a;
   private List<gnb> b = List.of();

   public hdt(alz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(heg.a $$0) {
      if ($$0.a(this.a) instanceof gmx $$2) {
         this.b = $$2.e();
         this.b.forEach($$1 -> $$0.a($$1.a()));
      }
   }

   @Override
   public hdn a(hdw $$0, Function<hdu, hbl> $$1, hec $$2) {
      hdn $$3 = $$0.a(this.a, $$2);
      if (this.b.isEmpty()) {
         return $$3;
      } else {
         gmr $$4 = new gmr($$0, this.b);
         return new hdt.a($$3, $$4);
      }
   }

   static class a extends hdr {
      private final gmr b;

      public a(hdn $$0, gmr $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      public gmr g() {
         return this.b;
      }
   }
}
