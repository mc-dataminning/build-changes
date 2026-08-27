import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gni(gnj d) {
   public static final gni a = new gni(gnj.b);
   public static final Codec<gni> b = RecordCodecBuilder.create($$0 -> $$0.group(awu.a(gnj.a, "scaling", gnj.b).forGetter(gni::a)).apply($$0, gni::new));
   public static final ase<gni> c = ase.a("gui", b);

   public gnj a() {
      return this.d;
   }
}
