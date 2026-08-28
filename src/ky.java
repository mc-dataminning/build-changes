import com.mojang.serialization.Codec;
import java.util.Optional;

public record ky(ji<das> c) implements dk<dau> {
   public static final Codec<ky> a = jt.a(mg.ae).xmap(ky::new, ky::b);

   @Override
   public ki<dau> a() {
      return kj.R;
   }

   public boolean a(dau $$0) {
      Optional<je<das>> $$1 = $$0.e();
      return !$$1.isEmpty() && this.c.a($$1.get());
   }

   public static ks a(ji<das> $$0) {
      return new ky($$0);
   }

   public ji<das> b() {
      return this.c;
   }
}
