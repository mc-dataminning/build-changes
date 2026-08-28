import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record xy(aku d) implements xq {
   public static final MapCodec<xy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a.fieldOf("storage").forGetter(xy::b)).apply($$0, xy::new));
   public static final xq.a<xy> b = new xq.a<>(a, "storage");

   @Override
   public Stream<tq> a(ex $$0) {
      tq $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public xq.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public aku b() {
      return this.d;
   }
}
