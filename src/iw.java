import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;

public record iw(ali d, ali e) {
   public static final Codec<iw> a = ali.a.xmap(iw::new, iw::a);
   public static final MapCodec<iw> b = a.fieldOf("asset_id");
   public static final yy<ByteBuf, iw> c = yy.a(ali.b, iw::a, iw::new);

   public iw(ali $$0) {
      this($$0, $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png")));
   }

   public ali a() {
      return this.d;
   }

   public ali b() {
      return this.e;
   }
}
