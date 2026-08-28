import com.mojang.serialization.Codec;
import java.util.Optional;

public record ky(ji<dam> c) implements dk<dao> {
   public static final Codec<ky> a = jt.a(mg.ae).xmap(ky::new, ky::b);

   @Override
   public ki<dao> a() {
      return kj.R;
   }

   public boolean a(dao $$0) {
      Optional<je<dam>> $$1 = $$0.e();
      return !$$1.isEmpty() && this.c.a($$1.get());
   }

   public static ks a(ji<dam> $$0) {
      return new ky($$0);
   }

   public ji<dam> b() {
      return this.c;
   }
}
