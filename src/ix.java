import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;

public record ix(alr d, alr e) {
   public static final Codec<ix> a = alr.a.xmap(ix::new, ix::a);
   public static final MapCodec<ix> b = a.fieldOf("asset_id");
   public static final ze<ByteBuf, ix> c = ze.a(alr.b, ix::a, ix::new);

   public ix(alr $$0) {
      this($$0, $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png")));
   }

   public alr a() {
      return this.d;
   }

   public alr b() {
      return this.e;
   }
}
