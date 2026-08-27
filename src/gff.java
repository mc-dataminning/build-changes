import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gff(gfg d) {
   public static final gff a = new gff(gfg.b);
   public static final Codec<gff> b = RecordCodecBuilder.create($$0 -> $$0.group(atg.a(gfg.a, "scaling", gfg.b).forGetter(gff::a)).apply($$0, gff::new));
   public static final aot<gff> c = aot.a("gui", b);

   public gfg a() {
      return this.d;
   }
}
