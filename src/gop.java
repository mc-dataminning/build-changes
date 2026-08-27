import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gop(goq d) {
   public static final gop a = new gop(goq.b);
   public static final Codec<gop> b = RecordCodecBuilder.create($$0 -> $$0.group(axh.a(goq.a, "scaling", goq.b).forGetter(gop::a)).apply($$0, gop::new));
   public static final asr<gop> c = asr.a("gui", b);

   public goq a() {
      return this.d;
   }
}
