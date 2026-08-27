import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ggr(ggs d) {
   public static final ggr a = new ggr(ggs.b);
   public static final Codec<ggr> b = RecordCodecBuilder.create($$0 -> $$0.group(atx.a(ggs.a, "scaling", ggs.b).forGetter(ggr::a)).apply($$0, ggr::new));
   public static final apk<ggr> c = apk.a("gui", b);

   public ggs a() {
      return this.d;
   }
}
