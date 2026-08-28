import java.util.Map;

public class hdl extends avz<dfk> {
   public static final dfk a = new dfk(Map.of());
   private Map<alz, dfk> b = Map.of();

   public hdl() {
      super(dfk.a, "models/equipment");
   }

   protected void a(Map<alz, dfk> $$0, avv $$1, bpo $$2) {
      this.b = Map.copyOf($$0);
   }

   public dfk a(alz $$0) {
      return this.b.getOrDefault($$0, a);
   }
}
