import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;

public record ix(alk d, alk e) {
   public static final Codec<ix> a = alk.a.xmap(ix::new, ix::a);
   public static final MapCodec<ix> b = a.fieldOf("asset_id");
   public static final za<ByteBuf, ix> c = za.a(alk.b, ix::a, ix::new);

   public ix(alk $$0) {
      this($$0, $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png")));
   }

   public alk a() {
      return this.d;
   }

   public alk b() {
      return this.e;
   }
}
