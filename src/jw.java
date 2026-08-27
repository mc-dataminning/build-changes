import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class jw extends jx {
   public static final Vector3f a = epr.a(16711680).j();
   public static final jw b = new jw(a, 1.0F);
   public static final Codec<jw> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.d.fieldOf("color").forGetter($$0x -> $$0x.h), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)).apply($$0, jw::new)
   );
   public static final xs<vf, jw> d = xs.a(xq.m, $$0 -> $$0.h, xq.f, $$0 -> $$0.i, jw::new);
   public static final ka.a<jw> e = new ka.a<jw>() {
      public jw a(kb<jw> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = jx.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         return new jw($$3, $$4);
      }
   };

   public jw(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public kb<jw> a() {
      return kc.o;
   }
}
