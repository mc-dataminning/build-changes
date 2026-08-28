import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;

public record iw(alg d, alg e) {
   public static final Codec<iw> a = alg.a.xmap(iw::new, iw::a);
   public static final MapCodec<iw> b = a.fieldOf("asset_id");
   public static final yw<ByteBuf, iw> c = yw.a(alg.b, iw::a, iw::new);

   public iw(alg $$0) {
      this($$0, $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png")));
   }

   public alg a() {
      return this.d;
   }

   public alg b() {
      return this.e;
   }
}
