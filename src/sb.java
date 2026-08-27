import java.util.List;

public record sb(List<String> a, ru<?> b, String c) {
   public sb(ru<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public sb(String $$0, ru<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public sb(String $$0, String $$1, ru<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
