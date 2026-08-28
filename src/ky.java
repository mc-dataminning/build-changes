import com.mojang.serialization.Codec;
import java.util.Optional;

public record ky(ji<dax> c) implements dk<daz> {
   public static final Codec<ky> a = jt.a(mg.ae).xmap(ky::new, ky::b);

   @Override
   public ki<daz> a() {
      return kj.R;
   }

   public boolean a(daz $$0) {
      Optional<je<dax>> $$1 = $$0.e();
      return !$$1.isEmpty() && this.c.a($$1.get());
   }

   public static ks a(ji<dax> $$0) {
      return new ky($$0);
   }

   public ji<dax> b() {
      return this.c;
   }
}
