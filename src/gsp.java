import java.util.Map;

public class gsp {
   private Map<ebq, gta> a = Map.of();
   private final hne b;

   public gsp(hne $$0) {
      this.b = $$0;
   }

   public hkq a(ebq $$0) {
      return this.b($$0).a();
   }

   public gta b(ebq $$0) {
      gta $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hne a() {
      return this.b;
   }

   public void a(Map<ebq, gta> $$0) {
      this.a = $$0;
   }
}
