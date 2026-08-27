import java.util.List;

public record tf(List<String> a, sy<?> b, String c) {
   public tf(sy<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public tf(String $$0, sy<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public tf(String $$0, String $$1, sy<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
