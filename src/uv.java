import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record uv(aez d) implements un {
   public static final MapCodec<uv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aez.a.fieldOf("storage").forGetter(uv::b)).apply($$0, uv::new));
   public static final un.a<uv> b = new un.a<>(a, "storage");

   @Override
   public Stream<qw> a(dt $$0) {
      qw $$1 = $$0.l().aG().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public un.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public aez b() {
      return this.d;
   }
}
