import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ir extends is {
   public static final Vector3f a = ehn.a(16711680).j();
   public static final ir b = new ir(a, 1.0F);
   public static final Codec<ir> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(arg.d.fieldOf("color").forGetter($$0x -> $$0x.g), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)).apply($$0, ir::new)
   );
   public static final iv.a<ir> d = new iv.a<ir>() {
      public ir a(iw<ir> $$0, StringReader $$1) throws CommandSyntaxException {
         Vector3f $$2 = is.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new ir($$2, $$3);
      }

      public ir a(iw<ir> $$0, sp $$1) {
         return new ir(is.b($$1), $$1.readFloat());
      }
   };

   public ir(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public iw<ir> b() {
      return ix.o;
   }
}
