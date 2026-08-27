import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class iq extends ir {
   public static final Vector3f a = ehf.a(16711680).j();
   public static final iq b = new iq(a, 1.0F);
   public static final Codec<iq> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqw.d.fieldOf("color").forGetter($$0x -> $$0x.g), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)).apply($$0, iq::new)
   );
   public static final iu.a<iq> d = new iu.a<iq>() {
      public iq a(iv<iq> $$0, StringReader $$1) throws CommandSyntaxException {
         Vector3f $$2 = ir.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new iq($$2, $$3);
      }

      public iq a(iv<iq> $$0, sh $$1) {
         return new iq(ir.b($$1), $$1.readFloat());
      }
   };

   public iq(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public iv<iq> b() {
      return iw.o;
   }
}
