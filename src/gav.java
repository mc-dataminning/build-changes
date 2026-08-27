import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gav(gaw d) {
   public static final gav a = new gav(gaw.b);
   public static final Codec<gav> b = RecordCodecBuilder.create($$0 -> $$0.group(arg.a(gaw.a, "scaling", gaw.b).forGetter(gav::a)).apply($$0, gav::new));
   public static final amv<gav> c = amv.a("gui", b);

   public gaw a() {
      return this.d;
   }
}
