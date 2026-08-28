import java.util.List;
import java.util.function.Function;

public class hdm implements hdz {
   private final alz a;
   private List<gmu> b = List.of();

   public hdm(alz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hdz.a $$0) {
      if ($$0.a(this.a) instanceof gmq $$2) {
         this.b = $$2.e();
         this.b.forEach($$1 -> $$0.a($$1.a()));
      }
   }

   @Override
   public hdg a(hdp $$0, Function<hdn, hbe> $$1, hdv $$2) {
      hdg $$3 = $$0.a(this.a, $$2);
      if (this.b.isEmpty()) {
         return $$3;
      } else {
         gmk $$4 = new gmk($$0, this.b);
         return new hdm.a($$3, $$4);
      }
   }

   static class a extends hdk {
      private final gmk b;

      public a(hdg $$0, gmk $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      public gmk g() {
         return this.b;
      }
   }
}
