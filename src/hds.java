import java.util.Map;

public class hds extends avz<dfs> {
   public static final dfs a = new dfs(Map.of());
   private Map<alz, dfs> b = Map.of();

   public hds() {
      super(dfs.a, "models/equipment");
   }

   protected void a(Map<alz, dfs> $$0, avv $$1, bpt $$2) {
      this.b = Map.copyOf($$0);
   }

   public dfs a(alz $$0) {
      return this.b.getOrDefault($$0, a);
   }
}
