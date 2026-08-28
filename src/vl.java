import java.util.List;

public record vl(List<String> a, ve<?> b, String c) {
   public vl(ve<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vl(String $$0, ve<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vl(String $$0, String $$1, ve<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
