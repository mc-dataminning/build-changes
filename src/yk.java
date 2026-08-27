import java.util.Optional;
import java.util.UUID;

public record yk(Optional<UUID> b) implements xz<yf> {
   public static final xq<us, yk> a = xz.a(yk::a, yk::new);

   private yk(us $$0) {
      this($$0.b(je.g));
   }

   private void a(us $$0) {
      $$0.a(this.b, je.g);
   }

   @Override
   public yb<yk> a() {
      return yp.e;
   }

   public void a(yf $$0) {
      $$0.a(this);
   }
}
