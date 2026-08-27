import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gpm(gpn d) {
   public static final gpm a = new gpm(gpn.b);
   public static final Codec<gpm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gpn.a.optionalFieldOf("scaling", gpn.b).forGetter(gpm::a)).apply($$0, gpm::new)
   );
   public static final asw<gpm> c = asw.a("gui", b);

   public gpn a() {
      return this.d;
   }
}
