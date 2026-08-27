import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gdg(String b, String c, boolean d) {
   public static final Codec<gdg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asy.v.fieldOf("region").forGetter(gdg::b),
               asy.v.fieldOf("name").forGetter(gdg::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(gdg::d)
            )
            .apply($$0, gdg::new)
   );

   public uv a() {
      return uv.b(this.c + " (" + this.b + ")");
   }
}
