import java.util.List;

public record ru(List<String> a, rn<?> b, String c) {
   public ru(rn<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public ru(String $$0, rn<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public ru(String $$0, String $$1, rn<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
