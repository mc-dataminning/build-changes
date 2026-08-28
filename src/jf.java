import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jf(alq<dkj> d, iw e) {
   public static final MapCodec<jf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dkj.h.fieldOf("dimension").forGetter(jf::a), iw.a.fieldOf("pos").forGetter(jf::b)).apply($$0, jf::a)
   );
   public static final Codec<jf> b = a.codec();
   public static final ze<ByteBuf, jf> c = ze.a(alq.b(mi.bp), jf::a, iw.b, jf::b, jf::a);

   public static jf a(alq<dkj> $$0, iw $$1) {
      return new jf($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public boolean a(alq<dkj> $$0, iw $$1, int $$2) {
      return this.d.equals($$0) && this.e.l($$1) <= $$2;
   }

   public alq<dkj> a() {
      return this.d;
   }

   public iw b() {
      return this.e;
   }
}
