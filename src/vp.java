import java.util.List;

public record vp(List<String> a, vi<?> b, String c) {
   public vp(vi<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vp(String $$0, vi<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vp(String $$0, String $$1, vi<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
