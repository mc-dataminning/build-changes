import java.util.List;

public record sa(List<String> a, rt<?> b, String c) {
   public sa(rt<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public sa(String $$0, rt<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public sa(String $$0, String $$1, rt<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
