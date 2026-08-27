import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gjp(gjq d) {
   public static final gjp a = new gjp(gjq.b);
   public static final Codec<gjp> b = RecordCodecBuilder.create($$0 -> $$0.group(avu.a(gjq.a, "scaling", gjq.b).forGetter(gjp::a)).apply($$0, gjp::new));
   public static final arg<gjp> c = arg.a("gui", b);

   public gjq a() {
      return this.d;
   }
}
