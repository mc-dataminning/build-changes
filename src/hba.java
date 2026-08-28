import java.util.Map;

public class hba extends avi<ddp> {
   public static final ddp a = new ddp(Map.of());
   private Map<all, ddp> b = Map.of();

   public hba() {
      super(ddp.a, "models/equipment");
   }

   protected void a(Map<all, ddp> $$0, ave $$1, bor $$2) {
      this.b = Map.copyOf($$0);
   }

   public ddp a(all $$0) {
      return this.b.getOrDefault($$0, a);
   }
}
