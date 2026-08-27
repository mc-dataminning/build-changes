import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record xe(ajh d) implements ww {
   public static final MapCodec<xe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ajh.a.fieldOf("storage").forGetter(xe::b)).apply($$0, xe::new));
   public static final ww.a<xe> b = new ww.a<>(a, "storage");

   @Override
   public Stream<ta> a(du $$0) {
      ta $$1 = $$0.l().aL().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public ww.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public ajh b() {
      return this.d;
   }
}
