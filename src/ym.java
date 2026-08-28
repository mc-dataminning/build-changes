import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record ym(alk d) implements ye {
   public static final MapCodec<ym> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alk.a.fieldOf("storage").forGetter(ym::b)).apply($$0, ym::new));
   public static final ye.a<ym> b = new ye.a<>(a, "storage");

   @Override
   public Stream<ua> a(ek $$0) {
      ua $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public ye.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public alk b() {
      return this.d;
   }
}
