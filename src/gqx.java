import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqx(String b, String c, boolean d) {
   public static final Codec<gqx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.y.fieldOf("region").forGetter(gqx::b),
               axo.y.fieldOf("name").forGetter(gqx::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gqx::d)
            )
            .apply($$0, gqx::new)
   );

   public wu a() {
      return wu.b(this.c + " (" + this.b + ")");
   }
}
