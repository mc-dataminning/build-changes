import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record wn(ahd d) implements wf {
   public static final MapCodec<wn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ahd.a.fieldOf("storage").forGetter(wn::b)).apply($$0, wn::new));
   public static final wf.a<wn> b = new wf.a<>(a, "storage");

   @Override
   public Stream<sl> a(ds $$0) {
      sl $$1 = $$0.l().aI().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public wf.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public ahd b() {
      return this.d;
   }
}
