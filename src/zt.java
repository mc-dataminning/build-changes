import java.util.Optional;
import java.util.UUID;

public record zt(Optional<UUID> b) implements zh<zn> {
   public static final yy<vw, zt> a = zh.a(zt::a, zt::new);

   private zt(vw $$0) {
      this($$0.b(jz.g));
   }

   private void a(vw $$0) {
      $$0.a(this.b, jz.g);
   }

   @Override
   public zj<zt> a() {
      return zz.f;
   }

   public void a(zn $$0) {
      $$0.a(this);
   }
}
