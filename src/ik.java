import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record ik(ajg<cxb> c, ib d) {
   public static final Codec<ik> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxb.g.fieldOf("dimension").forGetter(ik::a), ib.a.fieldOf("pos").forGetter(ik::b)).apply($$0, ik::a)
   );
   public static final xs<ByteBuf, ik> b = xs.a(ajg.b(kj.aN), ik::a, ib.b, ik::b, ik::a);

   public static ik a(ajg<cxb> $$0, ib $$1) {
      return new ik($$0, $$1);
   }

   @Override
   public String toString() {
      return this.c + " " + this.d;
   }

   public ajg<cxb> a() {
      return this.c;
   }

   public ib b() {
      return this.d;
   }
}
