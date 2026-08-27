import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record xc(ajc d) implements wu {
   public static final MapCodec<xc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ajc.a.fieldOf("storage").forGetter(xc::b)).apply($$0, xc::new));
   public static final wu.a<xc> b = new wu.a<>(a, "storage");

   @Override
   public Stream<sy> a(du $$0) {
      sy $$1 = $$0.l().aL().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public wu.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public ajc b() {
      return this.d;
   }
}
