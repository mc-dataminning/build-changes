import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record wp(ahg d) implements wh {
   public static final MapCodec<wp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ahg.a.fieldOf("storage").forGetter(wp::b)).apply($$0, wp::new));
   public static final wh.a<wp> b = new wh.a<>(a, "storage");

   @Override
   public Stream<sn> a(ds $$0) {
      sn $$1 = $$0.l().aI().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public wh.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public ahg b() {
      return this.d;
   }
}
