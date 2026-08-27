import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record xa(aiy d) implements ws {
   public static final MapCodec<xa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aiy.a.fieldOf("storage").forGetter(xa::b)).apply($$0, xa::new));
   public static final ws.a<xa> b = new ws.a<>(a, "storage");

   @Override
   public Stream<sw> a(du $$0) {
      sw $$1 = $$0.l().aI().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public ws.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public aiy b() {
      return this.d;
   }
}
