import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hcw(hcx d) {
   public static final hcw a = new hcw(hcx.b);
   public static final Codec<hcw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(hcx.a.optionalFieldOf("scaling", hcx.b).forGetter(hcw::a)).apply($$0, hcw::new)
   );
   public static final auu<hcw> c = auu.a("gui", b);

   public hcx a() {
      return this.d;
   }
}
