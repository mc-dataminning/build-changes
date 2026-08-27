import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class jv extends jw {
   public static final Vector3f a = eov.a(16711680).j();
   public static final jv b = new jv(a, 1.0F);
   public static final Codec<jv> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(avu.d.fieldOf("color").forGetter($$0x -> $$0x.h), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)).apply($$0, jv::new)
   );
   public static final xq<vd, jv> d = xq.a(xo.m, $$0 -> $$0.h, xo.f, $$0 -> $$0.i, jv::new);
   public static final jz.a<jv> e = new jz.a<jv>() {
      public jv a(ka<jv> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = jw.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         return new jv($$3, $$4);
      }
   };

   public jv(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public ka<jv> a() {
      return kb.o;
   }
}
