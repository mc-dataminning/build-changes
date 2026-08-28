import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yk(ali d) implements yc {
   public static final MapCodec<yk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a.fieldOf("storage").forGetter(yk::b)).apply($$0, yk::new));
   public static final yc.a<yk> b = new yc.a<>(a, "storage");

   @Override
   public Stream<tz> a(ej $$0) {
      tz $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yc.a<?> a() {
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
