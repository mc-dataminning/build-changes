import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yt(alj d) implements yl {
   public static final MapCodec<yt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alj.a.fieldOf("storage").forGetter(yt::b)).apply($$0, yt::new));
   public static final yl.a<yt> b = new yl.a<>(a, "storage");

   @Override
   public Stream<ul> a(ew $$0) {
      ul $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yl.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public alj b() {
      return this.d;
   }
}
