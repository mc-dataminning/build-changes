import java.util.List;

public record ue(List<String> a, tx<?> b, String c) {
   public ue(tx<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public ue(String $$0, tx<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public ue(String $$0, String $$1, tx<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
