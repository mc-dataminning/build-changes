import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yn(alb d) implements yf {
   public static final MapCodec<yn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alb.a.fieldOf("storage").forGetter(yn::b)).apply($$0, yn::new));
   public static final yf.a<yn> b = new yf.a<>(a, "storage");

   @Override
   public Stream<uf> a(et $$0) {
      uf $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yf.a<?> a() {
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
