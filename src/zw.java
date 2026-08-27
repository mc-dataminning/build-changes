import java.util.Optional;
import java.util.UUID;

public record zw(Optional<UUID> b) implements zl<zr> {
   public static final zc<we, zw> a = zl.a(zw::a, zw::new);

   private zw(we $$0) {
      this($$0.b(ju.g));
   }

   private void a(we $$0) {
      $$0.a(this.b, ju.g);
   }

   @Override
   public zn<zw> a() {
      return aab.e;
   }

   public void a(zr $$0) {
      $$0.a(this);
   }
}
