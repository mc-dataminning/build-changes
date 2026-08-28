import java.util.List;

public record vh(List<String> a, va<?> b, String c) {
   public vh(va<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vh(String $$0, va<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vh(String $$0, String $$1, va<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
