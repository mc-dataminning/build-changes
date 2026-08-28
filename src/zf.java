import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record zf(alz d) implements yx {
   public static final MapCodec<zf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alz.a.fieldOf("storage").forGetter(zf::b)).apply($$0, zf::new));
   public static final yx.a<zf> b = new yx.a<>(a, "storage");

   @Override
   public Stream<ux> a(ew $$0) {
      ux $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yx.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public alz b() {
      return this.d;
   }
}
