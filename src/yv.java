import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yv(alb d) implements yn {
   public static final MapCodec<yv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alb.a.fieldOf("storage").forGetter(yv::b)).apply($$0, yv::new));
   public static final yn.a<yv> b = new yn.a<>(a, "storage");

   @Override
   public Stream<ur> a(ep $$0) {
      ur $$1 = $$0.l().aL().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yn.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public alb b() {
      return this.d;
   }
}
