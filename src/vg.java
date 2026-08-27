import java.util.List;

public record vg(List<String> a, uz<?> b, String c) {
   public vg(uz<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vg(String $$0, uz<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vg(String $$0, String $$1, uz<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
