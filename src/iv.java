import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;

public record iv(alg d, alg e) {
   public static final Codec<iv> a = alg.a.xmap(iv::new, iv::a);
   public static final MapCodec<iv> b = a.fieldOf("asset_id");
   public static final yw<ByteBuf, iv> c = yw.a(alg.b, iv::a, iv::new);

   public iv(alg $$0) {
      this($$0, $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png")));
   }

   public alg a() {
      return this.d;
   }

   public alg b() {
      return this.e;
   }
}
