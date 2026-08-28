import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yz(alf d) implements yr {
   public static final MapCodec<yz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alf.a.fieldOf("storage").forGetter(yz::b)).apply($$0, yz::new));
   public static final yr.a<yz> b = new yr.a<>(a, "storage");

   @Override
   public Stream<us> a(ep $$0) {
      us $$1 = $$0.l().aL().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yr.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public alf b() {
      return this.d;
   }
}
