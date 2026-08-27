import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record im(aju<czg> d, id e) {
   public static final MapCodec<im> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czg.g.fieldOf("dimension").forGetter(im::a), id.a.fieldOf("pos").forGetter(im::b)).apply($$0, im::a)
   );
   public static final Codec<im> b = a.codec();
   public static final yg<ByteBuf, im> c = yg.a(aju.b(ku.aP), im::a, id.b, im::b, im::a);

   public static im a(aju<czg> $$0, id $$1) {
      return new im($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public aju<czg> a() {
      return this.d;
   }

   public id b() {
      return this.e;
   }
}
