import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hjh(String b, String c, boolean d) {
   public static final Codec<hjh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.A.fieldOf("region").forGetter(hjh::b),
               ays.A.fieldOf("name").forGetter(hjh::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hjh::d)
            )
            .apply($$0, hjh::new)
   );

   public ww a() {
      return ww.b(this.c + " (" + this.b + ")");
   }
}
