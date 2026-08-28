import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record ys(ali d) implements yk {
   public static final MapCodec<ys> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a.fieldOf("storage").forGetter(ys::b)).apply($$0, ys::new));
   public static final yk.a<ys> b = new yk.a<>(a, "storage");

   @Override
   public Stream<uk> a(ew $$0) {
      uk $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yk.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public ali b() {
      return this.d;
   }
}
