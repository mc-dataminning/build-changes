import java.util.List;

public record tj(List<String> a, tc<?> b, String c) {
   public tj(tc<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public tj(String $$0, tc<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public tj(String $$0, String $$1, tc<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
