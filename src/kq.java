import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class kq extends kr {
   public static final Vector3f a = etf.a(16711680).j();
   public static final kq b = new kq(a, 1.0F);
   public static final Codec<kq> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.c.fieldOf("color").forGetter($$0x -> $$0x.h), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)).apply($$0, kq::new)
   );
   public static final yq<wd, kq> d = yq.a(yo.q, $$0 -> $$0.h, yo.h, $$0 -> $$0.i, kq::new);
   public static final ku.a<kq> e = new ku.a<kq>() {
      public kq a(kv<kq> $$0, StringReader $$1, ix.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = kr.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         return new kq($$3, $$4);
      }
   };

   public kq(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public kv<kq> a() {
      return kw.n;
   }
}
