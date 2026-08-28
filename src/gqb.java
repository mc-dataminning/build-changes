import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gqb(String b, String c, boolean d) {
   public static final Codec<gqb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayc.y.fieldOf("region").forGetter(gqb::b),
               ayc.y.fieldOf("name").forGetter(gqb::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gqb::d)
            )
            .apply($$0, gqb::new)
   );

   public xl a() {
      return xl.b(this.c + " (" + this.b + ")");
   }
}
