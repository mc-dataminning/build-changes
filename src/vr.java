import java.util.List;

public record vr(List<String> a, vk<?> b, String c) {
   public vr(vk<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vr(String $$0, vk<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vr(String $$0, String $$1, vk<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
