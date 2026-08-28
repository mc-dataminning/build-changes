import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hjp(hjq d) {
   public static final hjp a = new hjp(hjq.b);
   public static final Codec<hjp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hjq.a.optionalFieldOf("scaling", hjq.b).forGetter(hjp::a)).apply($$0, hjp::new)
   );
   public static final aua<hjp> c = new aua<>("gui", b);

   public hjq a() {
      return this.d;
   }
}
