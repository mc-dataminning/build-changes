import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gco(String b, String c, boolean d) {
   public static final Codec<gco> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asq.v.fieldOf("region").forGetter(gco::b),
               asq.v.fieldOf("name").forGetter(gco::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gco::d)
            )
            .apply($$0, gco::new)
   );

   public ur a() {
      return ur.b(this.c + " (" + this.b + ")");
   }
}
