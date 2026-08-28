import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqp(gqq d) {
   public static final gqp a = new gqp(gqq.b);
   public static final Codec<gqp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gqq.a.optionalFieldOf("scaling", gqq.b).forGetter(gqp::a)).apply($$0, gqp::new)
   );
   public static final ato<gqp> c = ato.a("gui", b);

   public gqq a() {
      return this.d;
   }
}
