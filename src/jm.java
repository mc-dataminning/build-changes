import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class jm extends jn {
   public static final Vector3f a = eju.a(16711680).j();
   public static final jm b = new jm(a, 1.0F);
   public static final Codec<jm> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(asu.d.fieldOf("color").forGetter($$0x -> $$0x.g), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)).apply($$0, jm::new)
   );
   public static final jq.a<jm> d = new jq.a<jm>() {
      public jm a(jr<jm> $$0, StringReader $$1) throws CommandSyntaxException {
         Vector3f $$2 = jn.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new jm($$2, $$3);
      }

      public jm a(jr<jm> $$0, tu $$1) {
         return new jm(jn.b($$1), $$1.readFloat());
      }
   };

   public jm(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public jr<jm> b() {
      return js.o;
   }
}
