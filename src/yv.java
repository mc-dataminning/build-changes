import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yv(all d) implements yn {
   public static final MapCodec<yv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(all.a.fieldOf("storage").forGetter(yv::b)).apply($$0, yv::new));
   public static final yn.a<yv> b = new yn.a<>(a, "storage");

   @Override
   public Stream<un> a(ew $$0) {
      un $$1 = $$0.l().aK().a(this.d);
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

   public all b() {
      return this.d;
   }
}
