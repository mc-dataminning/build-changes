import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record je(alh<djx> d, iv e) {
   public static final MapCodec<je> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djx.h.fieldOf("dimension").forGetter(je::a), iv.a.fieldOf("pos").forGetter(je::b)).apply($$0, je::a)
   );
   public static final Codec<je> b = a.codec();
   public static final yy<ByteBuf, je> c = yy.a(alh.b(mh.bp), je::a, iv.b, je::b, je::a);

   public static je a(alh<djx> $$0, iv $$1) {
      return new je($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public boolean a(alh<djx> $$0, iv $$1, int $$2) {
      return this.d.equals($$0) && this.e.l($$1) <= $$2;
   }

   public alh<djx> a() {
      return this.d;
   }

   public iv b() {
      return this.e;
   }
}
