import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record wq(ahh d) implements wi {
   public static final MapCodec<wq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ahh.a.fieldOf("storage").forGetter(wq::b)).apply($$0, wq::new));
   public static final wi.a<wq> b = new wi.a<>(a, "storage");

   @Override
   public Stream<so> a(ds $$0) {
      so $$1 = $$0.l().aI().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public wi.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public ahh b() {
      return this.d;
   }
}
