import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ggd(gge d) {
   public static final ggd a = new ggd(gge.b);
   public static final Codec<ggd> b = RecordCodecBuilder.create($$0 -> $$0.group(atw.a(gge.a, "scaling", gge.b).forGetter(ggd::a)).apply($$0, ggd::new));
   public static final apj<ggd> c = apj.a("gui", b);

   public gge a() {
      return this.d;
   }
}
