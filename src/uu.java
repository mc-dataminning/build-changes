import java.util.List;

public record uu(List<String> a, un<?> b, String c) {
   public uu(un<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public uu(String $$0, un<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public uu(String $$0, String $$1, un<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
