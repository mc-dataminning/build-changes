import java.util.List;

public record uc(List<String> a, tv<?> b, String c) {
   public uc(tv<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public uc(String $$0, tv<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public uc(String $$0, String $$1, tv<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
