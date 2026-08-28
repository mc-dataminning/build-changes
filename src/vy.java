import java.util.List;

public record vy(List<String> a, vr<?> b, String c) {
   public vy(vr<?> $$0, String $$1) {
      this(List.of(), $$0, $$1);
   }

   public vy(String $$0, vr<?> $$1, String $$2) {
      this(List.of($$0), $$1, $$2);
   }

   public vy(String $$0, String $$1, vr<?> $$2, String $$3) {
      this(List.of($$0, $$1), $$2, $$3);
   }
}
