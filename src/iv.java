import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;

public record iv(ale d, ale e) {
   public static final Codec<iv> a = ale.a.xmap(iv::new, iv::a);
   public static final MapCodec<iv> b = a.fieldOf("asset_id");
   public static final yu<ByteBuf, iv> c = yu.a(ale.b, iv::a, iv::new);

   public iv(ale $$0) {
      this($$0, $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png")));
   }

   public ale a() {
      return this.d;
   }

   public ale b() {
      return this.e;
   }
}
