import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class jp extends jq {
   public static final Vector3f a = elb.a(16711680).j();
   public static final jp b = new jp(a, 1.0F);
   public static final Codec<jp> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(atg.d.fieldOf("color").forGetter($$0x -> $$0x.g), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)).apply($$0, jp::new)
   );
   public static final jt.a<jp> d = new jt.a<jp>() {
      public jp a(ju<jp> $$0, StringReader $$1) throws CommandSyntaxException {
         Vector3f $$2 = jq.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new jp($$2, $$3);
      }

      public jp a(ju<jp> $$0, ue $$1) {
         return new jp(jq.b($$1), $$1.readFloat());
      }
   };

   public jp(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public ju<jp> b() {
      return jv.o;
   }
}
