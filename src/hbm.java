import java.util.List;
import java.util.function.Function;

public class hbm implements hbz {
   private final alj a;
   private List<gkw> b = List.of();

   public hbm(alj $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hbz.a $$0) {
      if ($$0.a(this.a) instanceof gks $$2) {
         this.b = $$2.e();
         this.b.forEach($$1 -> $$0.a($$1.a()));
      }
   }

   @Override
   public hbg a(hbp $$0, Function<hbn, gze> $$1, hbv $$2) {
      hbg $$3 = $$0.a(this.a, $$2);
      if (this.b.isEmpty()) {
         return $$3;
      } else {
         gkm $$4 = new gkm($$0, this.b);
         return new hbm.a($$3, $$4);
      }
   }

   static class a extends hbk {
      private final gkm b;

      public a(hbg $$0, gkm $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      public gkm g() {
         return this.b;
      }
   }
}
