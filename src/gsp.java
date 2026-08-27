import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gsp(gsq d) {
   public static final gsp a = new gsp(gsq.b);
   public static final Codec<gsp> b = RecordCodecBuilder.create($$0 -> $$0.group(axu.a(gsq.a, "scaling", gsq.b).forGetter(gsp::a)).apply($$0, gsp::new));
   public static final atd<gsp> c = atd.a("gui", b);

   public gsq a() {
      return this.d;
   }
}
