import java.util.Optional;
import java.util.UUID;

public record zs(Optional<UUID> b) implements zg<zm> {
   public static final yx<vw, zs> a = zg.a(zs::a, zs::new);

   private zs(vw $$0) {
      this($$0.b(kg.g));
   }

   private void a(vw $$0) {
      $$0.a(this.b, kg.g);
   }

   @Override
   public zi<zs> a() {
      return zy.f;
   }

   public void a(zm $$0) {
      $$0.a(this);
   }
}
