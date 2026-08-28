import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yq(alr d) implements yi {
   public static final MapCodec<yq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alr.a.fieldOf("storage").forGetter(yq::b)).apply($$0, yq::new));
   public static final yi.a<yq> b = new yi.a<>(a, "storage");

   @Override
   public Stream<ua> a(ek $$0) {
      ua $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yi.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public alr b() {
      return this.d;
   }
}
