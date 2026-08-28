import java.util.List;

public record vs(List<String> a, vl<?> b, String c) {
   public vs(vl<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vs(String $$0, vl<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vs(String $$0, String $$1, vl<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
