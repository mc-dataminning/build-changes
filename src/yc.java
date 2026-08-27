import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yc(akf d) implements xu {
   public static final MapCodec<yc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akf.a.fieldOf("storage").forGetter(yc::b)).apply($$0, yc::new));
   public static final xu.a<yc> b = new xu.a<>(a, "storage");

   @Override
   public Stream<ty> a(ec $$0) {
      ty $$1 = $$0.l().aL().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public xu.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public akf b() {
      return this.d;
   }
}
