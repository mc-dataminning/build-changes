import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ks extends kt {
   public static final Vector3f a = euk.a(16711680).j();
   public static final ks b = new ks(a, 1.0F);
   public static final MapCodec<ks> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axm.c.fieldOf("color").forGetter($$0x -> $$0x.h), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)).apply($$0, ks::new)
   );
   public static final yv<wi, ks> d = yv.a(yt.q, $$0 -> $$0.h, yt.h, $$0 -> $$0.i, ks::new);
   public static final kw.a<ks> e = new kw.a<ks>() {
      public ks a(kx<ks> $$0, StringReader $$1, iz.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = kt.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         return new ks($$3, $$4);
      }
   };

   public ks(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public kx<ks> a() {
      return ky.n;
   }
}
