import java.util.Map;

public class gtc {
   private Map<ebe, gtn> a = Map.of();
   private final hno b;

   public gtc(hno $$0) {
      this.b = $$0;
   }

   public hla a(ebe $$0) {
      return this.b($$0).a();
   }

   public gtn b(ebe $$0) {
      gtn $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hno a() {
      return this.b;
   }

   public void a(Map<ebe, gtn> $$0) {
      this.a = $$0;
   }
}
