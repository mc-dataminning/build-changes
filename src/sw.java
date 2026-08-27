import java.util.List;

public record sw(List<String> a, sp<?> b, String c) {
   public sw(sp<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public sw(String $$0, sp<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public sw(String $$0, String $$1, sp<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
