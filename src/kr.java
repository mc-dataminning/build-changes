import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class kr extends ks {
   public static final Vector3f a = etp.a(16711680).j();
   public static final kr b = new kr(a, 1.0F);
   public static final Codec<kr> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.c.fieldOf("color").forGetter($$0x -> $$0x.h), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)).apply($$0, kr::new)
   );
   public static final ys<wf, kr> d = ys.a(yq.q, $$0 -> $$0.h, yq.h, $$0 -> $$0.i, kr::new);
   public static final kv.a<kr> e = new kv.a<kr>() {
      public kr a(kw<kr> $$0, StringReader $$1, iy.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = ks.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         return new kr($$3, $$4);
      }
   };

   public kr(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public kw<kr> a() {
      return kx.n;
   }
}
