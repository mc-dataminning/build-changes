import java.util.List;

public record rw(List<String> a, rp<?> b, String c) {
   public rw(rp<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public rw(String $$0, rp<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public rw(String $$0, String $$1, rp<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
