import java.util.List;
import java.util.UUID;

public record yw(List<UUID> a) implements va<ws> {
   public yw(sl $$0) {
      this($$0.a(sl::o));
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a, sl::a);
   }

   public void a(ws $$0) {
      $$0.a(this);
   }
}
