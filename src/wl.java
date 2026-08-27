import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record wl(agt d) implements wd {
   public static final MapCodec<wl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(agt.a.fieldOf("storage").forGetter(wl::b)).apply($$0, wl::new));
   public static final wd.a<wl> b = new wd.a<>(a, "storage");

   @Override
   public Stream<sj> a(ds $$0) {
      sj $$1 = $$0.l().aI().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public wd.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public agt b() {
      return this.d;
   }
}
