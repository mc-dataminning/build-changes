import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yi(alg d) implements ya {
   public static final MapCodec<yi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("storage").forGetter(yi::b)).apply($$0, yi::new));
   public static final ya.a<yi> b = new ya.a<>(a, "storage");

   @Override
   public Stream<tz> a(ei $$0) {
      tz $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public ya.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public alg b() {
      return this.d;
   }
}
