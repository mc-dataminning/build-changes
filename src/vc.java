import java.util.List;

public record vc(List<String> a, uv<?> b, String c) {
   public vc(uv<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vc(String $$0, uv<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vc(String $$0, String $$1, uv<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
