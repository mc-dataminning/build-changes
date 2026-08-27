import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yo(akt d) implements yg {
   public static final MapCodec<yo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akt.a.fieldOf("storage").forGetter(yo::b)).apply($$0, yo::new));
   public static final yg.a<yo> b = new yg.a<>(a, "storage");

   @Override
   public Stream<uk> a(eh $$0) {
      uk $$1 = $$0.l().aL().a(this.d);
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

   public akt b() {
      return this.d;
   }
}
