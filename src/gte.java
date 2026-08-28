import java.util.Map;

public class gte {
   private Map<ebg, gtp> a = Map.of();
   private final hnq b;

   public gte(hnq $$0) {
      this.b = $$0;
   }

   public hlc a(ebg $$0) {
      return this.b($$0).a();
   }

   public gtp b(ebg $$0) {
      gtp $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public hnq a() {
      return this.b;
   }

   public void a(Map<ebg, gtp> $$0) {
      this.a = $$0;
   }
}
