import java.util.List;

public record tu(List<String> a, tn<?> b, String c) {
   public tu(tn<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public tu(String $$0, tn<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public tu(String $$0, String $$1, tn<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
