import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record yi(akq d) implements ya {
   public static final MapCodec<yi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akq.a.fieldOf("storage").forGetter(yi::b)).apply($$0, yi::new));
   public static final ya.a<yi> b = new ya.a<>(a, "storage");

   @Override
   public Stream<ua> a(et $$0) {
      ua $$1 = $$0.l().aL().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public ya.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public akq b() {
      return this.d;
   }
}
