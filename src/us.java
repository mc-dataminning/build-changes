import java.util.List;

public record us(List<String> a, ul<?> b, String c) {
   public us(ul<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public us(String $$0, ul<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public us(String $$0, String $$1, ul<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
