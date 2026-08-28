import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yg(ale d) implements xy {
   public static final MapCodec<yg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("storage").forGetter(yg::b)).apply($$0, yg::new));
   public static final xy.a<yg> b = new xy.a<>(a, "storage");

   @Override
   public Stream<tx> a(ei $$0) {
      tx $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public xy.a<?> a() {
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
