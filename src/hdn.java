import java.util.Map;

public class hdn extends avp<dfj> {
   public static final dfj a = new dfj(Map.of());
   private Map<alp, dfj> b = Map.of();

   public hdn() {
      super(dfj.a, "models/equipment");
   }

   protected void a(Map<alp, dfj> $$0, avl $$1, bpj $$2) {
      this.b = Map.copyOf($$0);
   }

   public dfj a(alp $$0) {
      return this.b.getOrDefault($$0, a);
   }
}
