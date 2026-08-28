import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hco(String b, String c, boolean d) {
   public static final Codec<hco> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azd.A.fieldOf("region").forGetter(hco::b),
               azd.A.fieldOf("name").forGetter(hco::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hco::d)
            )
            .apply($$0, hco::new)
   );

   public xk a() {
      return xk.b(this.c + " (" + this.b + ")");
   }
}
