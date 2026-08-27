import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record iw(akm<daz> d, io e) {
   public static final MapCodec<iw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(daz.g.fieldOf("dimension").forGetter(iw::a), io.a.fieldOf("pos").forGetter(iw::b)).apply($$0, iw::a)
   );
   public static final Codec<iw> b = a.codec();
   public static final yv<ByteBuf, iw> c = yv.a(akm.b(lf.aS), iw::a, io.b, iw::b, iw::a);

   public static iw a(akm<daz> $$0, io $$1) {
      return new iw($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public akm<daz> a() {
      return this.d;
   }

   public io b() {
      return this.e;
   }
}
