import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yh(akm d) implements xz {
   public static final MapCodec<yh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akm.a.fieldOf("storage").forGetter(yh::b)).apply($$0, yh::new));
   public static final xz.a<yh> b = new xz.a<>(a, "storage");

   @Override
   public Stream<ud> a(ee $$0) {
      ud $$1 = $$0.l().aL().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public xz.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public akm b() {
      return this.d;
   }
}
