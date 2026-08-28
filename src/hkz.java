import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hkz(String b, String c, boolean d) {
   public static final Codec<hkz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.A.fieldOf("region").forGetter(hkz::b),
               ayu.A.fieldOf("name").forGetter(hkz::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hkz::d)
            )
            .apply($$0, hkz::new)
   );

   public wy a() {
      return wy.b(this.c + " (" + this.b + ")");
   }
}
