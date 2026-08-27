import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record vs(afw d) implements vk {
   public static final MapCodec<vs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(afw.a.fieldOf("storage").forGetter(vs::b)).apply($$0, vs::new));
   public static final vk.a<vs> b = new vk.a<>(a, "storage");

   @Override
   public Stream<rt> a(du $$0) {
      rt $$1 = $$0.m().aG().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public vk.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public afw b() {
      return this.d;
   }
}
