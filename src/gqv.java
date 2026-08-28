import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqv(String b, String c, boolean d) {
   public static final Codec<gqv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.y.fieldOf("region").forGetter(gqv::b),
               axo.y.fieldOf("name").forGetter(gqv::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gqv::d)
            )
            .apply($$0, gqv::new)
   );

   public wu a() {
      return wu.b(this.c + " (" + this.b + ")");
   }
}
