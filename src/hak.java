import java.util.Map;

public class hak extends avf<ddl> {
   public static final ddl a = new ddl(Map.of());
   private Map<ali, ddl> b = Map.of();

   public hak() {
      super(ddl.a, "models/equipment");
   }

   protected void a(Map<ali, ddl> $$0, avb $$1, bon $$2) {
      this.b = Map.copyOf($$0);
   }

   public ddl a(ali $$0) {
      return this.b.getOrDefault($$0, a);
   }
}
