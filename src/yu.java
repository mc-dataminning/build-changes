import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yu(alp d) implements ym {
   public static final MapCodec<yu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alp.a.fieldOf("storage").forGetter(yu::b)).apply($$0, yu::new));
   public static final ym.a<yu> b = new ym.a<>(a, "storage");

   @Override
   public Stream<um> a(ew $$0) {
      um $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public ym.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public alp b() {
      return this.d;
   }
}
