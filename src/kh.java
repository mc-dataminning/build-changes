import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class kh extends ki {
   public static final Vector3f a = esj.a(16711680).j();
   public static final kh b = new kh(a, 1.0F);
   public static final Codec<kh> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.c.fieldOf("color").forGetter($$0x -> $$0x.h), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)).apply($$0, kh::new)
   );
   public static final yg<vt, kh> d = yg.a(ye.q, $$0 -> $$0.h, ye.h, $$0 -> $$0.i, kh::new);
   public static final kl.a<kh> e = new kl.a<kh>() {
      public kh a(km<kh> $$0, StringReader $$1, ip.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = ki.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         return new kh($$3, $$4);
      }
   };

   public kh(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public km<kh> a() {
      return kn.o;
   }
}
