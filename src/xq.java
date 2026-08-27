import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record xq(ajt d) implements xi {
   public static final MapCodec<xq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ajt.a.fieldOf("storage").forGetter(xq::b)).apply($$0, xq::new));
   public static final xi.a<xq> b = new xi.a<>(a, "storage");

   @Override
   public Stream<tm> a(du $$0) {
      tm $$1 = $$0.l().aL().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public xi.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public ajt b() {
      return this.d;
   }
}
