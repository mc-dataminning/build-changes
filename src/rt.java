import java.util.List;

public record rt(List<String> a, rm<?> b, String c) {
   public rt(rm<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public rt(String $$0, rm<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public rt(String $$0, String $$1, rm<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
