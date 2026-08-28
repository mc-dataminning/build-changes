import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yf(ald d) implements xx {
   public static final MapCodec<yf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.a.fieldOf("storage").forGetter(yf::b)).apply($$0, yf::new));
   public static final xx.a<yf> b = new xx.a<>(a, "storage");

   @Override
   public Stream<tw> a(ex $$0) {
      tw $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public xx.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public ald b() {
      return this.d;
   }
}
