import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public record wb(agi d) implements vt {
   public static final MapCodec<wb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(agi.a.fieldOf("storage").forGetter(wb::b)).apply($$0, wb::new));
   public static final vt.a<wb> b = new vt.a<>(a, "storage");

   @Override
   public Stream<rz> a(du $$0) {
      rz $$1 = $$0.m().aI().a(this.d);
      return Stream.of($$1);
   }

   @Override
   public vt.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "storage=" + this.d;
   }

   public agi b() {
      return this.d;
   }
}
