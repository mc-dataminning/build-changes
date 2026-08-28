import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hgc(String b, String c, boolean d) {
   public static final Codec<hgc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.A.fieldOf("region").forGetter(hgc::b),
               ayi.A.fieldOf("name").forGetter(hgc::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hgc::d)
            )
            .apply($$0, hgc::new)
   );

   public wp a() {
      return wp.b(this.c + " (" + this.b + ")");
   }
}
