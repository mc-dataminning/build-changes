import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ggc(ggd d) {
   public static final ggc a = new ggc(ggd.b);
   public static final Codec<ggc> b = RecordCodecBuilder.create($$0 -> $$0.group(atv.a(ggd.a, "scaling", ggd.b).forGetter(ggc::a)).apply($$0, ggc::new));
   public static final api<ggc> c = api.a("gui", b);

   public ggd a() {
      return this.d;
   }
}
