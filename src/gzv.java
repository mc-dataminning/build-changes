import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gzv(gzw d) {
   public static final gzv a = new gzv(gzw.b);
   public static final Codec<gzv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(gzw.a.optionalFieldOf("scaling", gzw.b).forGetter(gzv::a)).apply($$0, gzv::new)
   );
   public static final aua<gzv> c = aua.a("gui", b);

   public gzw a() {
      return this.d;
   }
}
