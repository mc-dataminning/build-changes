import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record je(alf<djm> d, iv e) {
   public static final MapCodec<je> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djm.h.fieldOf("dimension").forGetter(je::a), iv.a.fieldOf("pos").forGetter(je::b)).apply($$0, je::a)
   );
   public static final Codec<je> b = a.codec();
   public static final yw<ByteBuf, je> c = yw.a(alf.b(mh.bp), je::a, iv.b, je::b, je::a);

   public static je a(alf<djm> $$0, iv $$1) {
      return new je($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public boolean a(alf<djm> $$0, iv $$1, int $$2) {
      return this.d.equals($$0) && this.e.l($$1) <= $$2;
   }

   public alf<djm> a() {
      return this.d;
   }

   public iv b() {
      return this.e;
   }
}
