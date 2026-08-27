import java.util.List;

public record ug(List<String> a, tz<?> b, String c) {
   public ug(tz<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public ug(String $$0, tz<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public ug(String $$0, String $$1, tz<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
