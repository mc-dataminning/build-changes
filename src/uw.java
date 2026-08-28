import java.util.List;

public record uw(List<String> a, up<?> b, String c) {
   public uw(up<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public uw(String $$0, up<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public uw(String $$0, String $$1, up<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
