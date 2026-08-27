import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ggb(ggc d) {
   public static final ggb a = new ggb(ggc.b);
   public static final Codec<ggb> b = RecordCodecBuilder.create($$0 -> $$0.group(atv.a(ggc.a, "scaling", ggc.b).forGetter(ggb::a)).apply($$0, ggb::new));
   public static final api<ggb> c = api.a("gui", b);

   public ggc a() {
      return this.d;
   }
}
