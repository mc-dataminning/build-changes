import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hlz(String b, String c, boolean d) {
   public static final Codec<hlz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azg.A.fieldOf("region").forGetter(hlz::b),
               azg.A.fieldOf("name").forGetter(hlz::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hlz::d)
            )
            .apply($$0, hlz::new)
   );

   public xg a() {
      return xg.b(this.c + " (" + this.b + ")");
   }
}
