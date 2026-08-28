import java.util.List;

public record vm(List<String> a, vf<?> b, String c) {
   public vm(vf<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vm(String $$0, vf<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vm(String $$0, String $$1, vf<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
