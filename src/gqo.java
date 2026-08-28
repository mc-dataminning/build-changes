import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqo(gqp d) {
   public static final gqo a = new gqo(gqp.b);
   public static final Codec<gqo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gqp.a.optionalFieldOf("scaling", gqp.b).forGetter(gqo::a)).apply($$0, gqo::new)
   );
   public static final ato<gqo> c = ato.a("gui", b);

   public gqp a() {
      return this.d;
   }
}
