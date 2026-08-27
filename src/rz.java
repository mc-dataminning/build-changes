import java.util.List;

public record rz(List<String> a, rs<?> b, String c) {
   public rz(rs<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public rz(String $$0, rs<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public rz(String $$0, String $$1, rs<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
