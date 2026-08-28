import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hib(String b, String c, boolean d) {
   public static final Codec<hib> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.A.fieldOf("region").forGetter(hib::b),
               ays.A.fieldOf("name").forGetter(hib::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hib::d)
            )
            .apply($$0, hib::new)
   );

   public wv a() {
      return wv.b(this.c + " (" + this.b + ")");
   }
}
