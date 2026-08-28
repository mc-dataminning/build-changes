import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record xz(akv d) implements xr {
   public static final MapCodec<xz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akv.a.fieldOf("storage").forGetter(xz::b)).apply($$0, xz::new));
   public static final xr.a<xz> b = new xr.a<>(a, "storage");

   @Override
   public Stream<tq> a(ex $$0) {
      tq $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public xr.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public akv b() {
      return this.d;
   }
}
