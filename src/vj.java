import java.util.List;

public record vj(List<String> a, vc<?> b, String c) {
   public vj(vc<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vj(String $$0, vc<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vj(String $$0, String $$1, vc<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
