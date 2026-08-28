import java.util.Map;

public class hbl extends avh<ddw> {
   public static final ddw a = new ddw(Map.of());
   private Map<alj, ddw> b = Map.of();

   public hbl() {
      super(ddw.a, "models/equipment");
   }

   protected void a(Map<alj, ddw> $$0, avd $$1, bou $$2) {
      this.b = Map.copyOf($$0);
   }

   public ddw a(alj $$0) {
      return this.b.getOrDefault($$0, a);
   }
}
