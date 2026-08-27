import java.util.Optional;
import java.util.UUID;

public record za(Optional<UUID> b) implements yp<yv> {
   public static final yg<vi, za> a = yp.a(za::a, za::new);

   private za(vi $$0) {
      this($$0.b(jh.g));
   }

   private void a(vi $$0) {
      $$0.a(this.b, jh.g);
   }

   @Override
   public yr<za> a() {
      return zf.e;
   }

   public void a(yv $$0) {
      $$0.a(this);
   }
}
