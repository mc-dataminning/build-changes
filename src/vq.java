import java.util.List;

public record vq(List<String> a, vj<?> b, String c) {
   public vq(vj<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vq(String $$0, vj<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vq(String $$0, String $$1, vj<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
