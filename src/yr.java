import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yr(alh d) implements yj {
   public static final MapCodec<yr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alh.a.fieldOf("storage").forGetter(yr::b)).apply($$0, yr::new));
   public static final yj.a<yr> b = new yj.a<>(a, "storage");

   @Override
   public Stream<uj> a(ev $$0) {
      uj $$1 = $$0.l().aK().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public yj.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public alh b() {
      return this.d;
   }
}
