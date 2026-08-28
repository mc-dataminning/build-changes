import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hha(String b, String c, boolean d) {
   public static final Codec<hha> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.A.fieldOf("region").forGetter(hha::b),
               ayi.A.fieldOf("name").forGetter(hha::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hha::d)
            )
            .apply($$0, hha::new)
   );

   public wp a() {
      return wp.b(this.c + " (" + this.b + ")");
   }
}
