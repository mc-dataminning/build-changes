import java.util.Optional;
import java.util.UUID;

public record zo(Optional<UUID> b) implements zc<zi> {
   public static final yt<vr, zo> a = zc.a(zo::a, zo::new);

   private zo(vr $$0) {
      this($$0.b(km.g));
   }

   private void a(vr $$0) {
      $$0.a(this.b, km.g);
   }

   @Override
   public ze<zo> a() {
      return zu.f;
   }

   public void a(zi $$0) {
      $$0.a(this);
   }
}
