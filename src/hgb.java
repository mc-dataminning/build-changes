import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgb(String b, String c, boolean d) {
   public static final Codec<hgb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.A.fieldOf("region").forGetter(hgb::b),
               ayi.A.fieldOf("name").forGetter(hgb::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hgb::d)
            )
            .apply($$0, hgb::new)
   );

   public wp a() {
      return wp.b(this.c + " (" + this.b + ")");
   }
}
