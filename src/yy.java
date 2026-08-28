import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yy(ale d) implements yq {
   public static final MapCodec<yy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("storage").forGetter(yy::b)).apply($$0, yy::new));
   public static final yq.a<yy> b = new yq.a<>(a, "storage");

   @Override
   public Stream<ur> a(ep $$0) {
      ur $$1 = $$0.l().aL().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yq.a<?> a() {
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
