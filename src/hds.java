import java.util.List;
import java.util.function.Function;

public class hds implements hef {
   private final alz a;
   private List<gna> b = List.of();

   public hds(alz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hef.a $$0) {
      if ($$0.a(this.a) instanceof gmw $$2) {
         this.b = $$2.e();
         this.b.forEach($$1 -> $$0.a($$1.a()));
      }
   }

   @Override
   public hdm a(hdv $$0, Function<hdt, hbk> $$1, heb $$2) {
      hdm $$3 = $$0.a(this.a, $$2);
      if (this.b.isEmpty()) {
         return $$3;
      } else {
         gmq $$4 = new gmq($$0, this.b);
         return new hds.a($$3, $$4);
      }
   }

   static class a extends hdq {
      private final gmq b;

      public a(hdm $$0, gmq $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      public gmq g() {
         return this.b;
      }
   }
}
