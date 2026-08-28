import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record grf(grg d) {
   public static final grf a = new grf(grg.b);
   public static final Codec<grf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(grg.a.optionalFieldOf("scaling", grg.b).forGetter(grf::a)).apply($$0, grf::new)
   );
   public static final asw<grf> c = asw.a("gui", b);

   public grg a() {
      return this.d;
   }
}
