import java.util.List;

public record tt(List<String> a, tm<?> b, String c) {
   public tt(tm<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public tt(String $$0, tm<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public tt(String $$0, String $$1, tm<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
