import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record ye(akk d) implements xw {
   public static final MapCodec<ye> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akk.a.fieldOf("storage").forGetter(ye::b)).apply($$0, ye::new));
   public static final xw.a<ye> b = new xw.a<>(a, "storage");

   @Override
   public Stream<tx> a(eq $$0) {
      tx $$1 = $$0.l().aM().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public xw.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public akk b() {
      return this.d;
   }
}
