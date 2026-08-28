import java.util.Map;

public class hdr extends avz<dfr> {
   public static final dfr a = new dfr(Map.of());
   private Map<alz, dfr> b = Map.of();

   public hdr() {
      super(dfr.a, "models/equipment");
   }

   protected void a(Map<alz, dfr> $$0, avv $$1, bps $$2) {
      this.b = Map.copyOf($$0);
   }

   public dfr a(alz $$0) {
      return this.b.getOrDefault($$0, a);
   }
}
