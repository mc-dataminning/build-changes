import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class jt extends ju {
   public static final Vector3f a = ens.a(16711680).j();
   public static final jt b = new jt(a, 1.0F);
   public static final Codec<jt> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(avp.d.fieldOf("color").forGetter($$0x -> $$0x.h), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)).apply($$0, jt::new)
   );
   public static final xo<vb, jt> d = xo.a(xm.l, $$0 -> $$0.h, xm.f, $$0 -> $$0.i, jt::new);
   public static final jx.a<jt> e = new jx.a<jt>() {
      public jt a(jy<jt> $$0, StringReader $$1) throws CommandSyntaxException {
         Vector3f $$2 = ju.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new jt($$2, $$3);
      }
   };

   public jt(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public jy<jt> b() {
      return jz.o;
   }
}
