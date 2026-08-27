import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ip extends iq {
   public static final Vector3f a = ehd.a(16711680).j();
   public static final ip b = new ip(a, 1.0F);
   public static final Codec<ip> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.d.fieldOf("color").forGetter($$0x -> $$0x.g), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)).apply($$0, ip::new)
   );
   public static final it.a<ip> d = new it.a<ip>() {
      public ip a(iu<ip> $$0, StringReader $$1) throws CommandSyntaxException {
         Vector3f $$2 = iq.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new ip($$2, $$3);
      }

      public ip a(iu<ip> $$0, si $$1) {
         return new ip(iq.b($$1), $$1.readFloat());
      }
   };

   public ip(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public iu<ip> b() {
      return iv.o;
   }
}
