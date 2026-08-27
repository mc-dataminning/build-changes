import java.util.List;

public record tp(List<String> a, ti<?> b, String c) {
   public tp(ti<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public tp(String $$0, ti<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public tp(String $$0, String $$1, ti<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
