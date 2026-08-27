import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record xs(ajv d) implements xk {
   public static final MapCodec<xs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ajv.a.fieldOf("storage").forGetter(xs::b)).apply($$0, xs::new));
   public static final xk.a<xs> b = new xk.a<>(a, "storage");

   @Override
   public Stream<to> a(dv $$0) {
      to $$1 = $$0.l().aL().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public xk.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public ajv b() {
      return this.d;
   }
}
