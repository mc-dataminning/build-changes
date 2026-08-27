import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gmp(String b, String c, boolean d) {
   public static final Codec<gmp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aws.w.fieldOf("region").forGetter(gmp::b),
               aws.w.fieldOf("name").forGetter(gmp::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gmp::d)
            )
            .apply($$0, gmp::new)
   );

   public wg a() {
      return wg.b(this.c + " (" + this.b + ")");
   }
}
