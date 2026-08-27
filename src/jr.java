import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class jr extends js {
   public static final Vector3f a = elt.a(16711680).j();
   public static final jr b = new jr(a, 1.0F);
   public static final Codec<jr> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(atw.d.fieldOf("color").forGetter($$0x -> $$0x.g), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)).apply($$0, jr::new)
   );
   public static final jv.a<jr> d = new jv.a<jr>() {
      public jr a(jw<jr> $$0, StringReader $$1) throws CommandSyntaxException {
         Vector3f $$2 = js.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new jr($$2, $$3);
      }

      public jr a(jw<jr> $$0, ui $$1) {
         return new jr(js.b($$1), $$1.readFloat());
      }
   };

   public jr(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public jw<jr> b() {
      return jx.o;
   }
}
