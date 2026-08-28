import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hkf(String b, String c, boolean d) {
   public static final Codec<hkf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.A.fieldOf("region").forGetter(hkf::b),
               ayu.A.fieldOf("name").forGetter(hkf::c),
               Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(hkf::d)
            )
            .apply($$0, hkf::new)
   );

   public wy a() {
      return wy.b(this.c + " (" + this.b + ")");
   }
}
