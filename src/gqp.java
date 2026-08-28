import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqp(String b, String c, boolean d) {
   public static final Codec<gqp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.y.fieldOf("region").forGetter(gqp::b),
               axm.y.fieldOf("name").forGetter(gqp::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gqp::d)
            )
            .apply($$0, gqp::new)
   );

   public wu a() {
      return wu.b(this.c + " (" + this.b + ")");
   }
}
