import java.util.List;
import java.util.UUID;

public record zx(List<UUID> a) implements wb<xu> {
   public zx(tl $$0) {
      this($$0.a(tl::p));
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a, tl::a);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }
}
