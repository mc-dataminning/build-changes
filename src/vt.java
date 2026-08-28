import java.util.List;

public record vt(List<String> a, vm<?> b, String c) {
   public vt(vm<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vt(String $$0, vm<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vt(String $$0, String $$1, vm<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
