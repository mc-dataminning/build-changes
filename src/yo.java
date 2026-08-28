import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yo(ale d) implements yg {
   public static final MapCodec<yo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("storage").forGetter(yo::b)).apply($$0, yo::new));
   public static final yg.a<yo> b = new yg.a<>(a, "storage");

   @Override
   public Stream<ug> a(eu $$0) {
      ug $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yg.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public ale b() {
      return this.d;
   }
}
