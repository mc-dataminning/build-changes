import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record wf(agm d) implements vx {
   public static final MapCodec<wf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(agm.a.fieldOf("storage").forGetter(wf::b)).apply($$0, wf::new));
   public static final vx.a<wf> b = new vx.a<>(a, "storage");

   @Override
   public Stream<sd> a(du $$0) {
      sd $$1 = $$0.l().aI().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public vx.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public agm b() {
      return this.d;
   }
}
