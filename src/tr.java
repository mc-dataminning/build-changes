import java.util.List;

public record tr(List<String> a, tk<?> b, String c) {
   public tr(tk<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public tr(String $$0, tk<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public tr(String $$0, String $$1, tk<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
