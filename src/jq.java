import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class jq extends jr {
   public static final Vector3f a = ejz.a(16711680).j();
   public static final jq b = new jq(a, 1.0F);
   public static final Codec<jq> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(asy.d.fieldOf("color").forGetter($$0x -> $$0x.g), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)).apply($$0, jq::new)
   );
   public static final ju.a<jq> d = new ju.a<jq>() {
      public jq a(jv<jq> $$0, StringReader $$1) throws CommandSyntaxException {
         Vector3f $$2 = jr.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new jq($$2, $$3);
      }

      public jq a(jv<jq> $$0, ty $$1) {
         return new jq(jr.b($$1), $$1.readFloat());
      }
   };

   public jq(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public jv<jq> b() {
      return jw.o;
   }
}
