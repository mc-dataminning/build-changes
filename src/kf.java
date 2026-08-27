import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class kf extends kg {
   public static final Vector3f a = esa.a(16711680).j();
   public static final kf b = new kf(a, 1.0F);
   public static final Codec<kf> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(aws.c.fieldOf("color").forGetter($$0x -> $$0x.h), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)).apply($$0, kf::new)
   );
   public static final ye<vr, kf> d = ye.a(yc.q, $$0 -> $$0.h, yc.h, $$0 -> $$0.i, kf::new);
   public static final kj.a<kf> e = new kj.a<kf>() {
      public kf a(kk<kf> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = kg.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         return new kf($$3, $$4);
      }
   };

   public kf(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public kk<kf> a() {
      return kl.o;
   }
}
