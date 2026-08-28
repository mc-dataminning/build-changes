import java.util.List;

public record vx(List<String> a, vq<?> b, String c) {
   public vx(vq<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vx(String $$0, vq<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vx(String $$0, String $$1, vq<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
