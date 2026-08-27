import java.util.List;

public record ve(List<String> a, ux<?> b, String c) {
   public ve(ux<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public ve(String $$0, ux<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public ve(String $$0, String $$1, ux<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
