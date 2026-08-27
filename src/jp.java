import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import org.joml.Vector3f;

public class jp extends jr {
   public static final Vector3f a = ejz.a(3790560).j();
   public static final jp b = new jp(a, jq.a, 1.0F);
   public static final Codec<jp> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asy.d.fieldOf("fromColor").forGetter($$0x -> $$0x.g),
               asy.d.fieldOf("toColor").forGetter($$0x -> $$0x.i),
               Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, jp::new)
   );
   public static final ju.a<jp> d = new ju.a<jp>() {
      public jp a(jv<jp> $$0, StringReader $$1) throws CommandSyntaxException {
         Vector3f $$2 = jr.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         Vector3f $$4 = jr.a($$1);
         return new jp($$2, $$4, $$3);
      }

      public jp a(jv<jp> $$0, ty $$1) {
         Vector3f $$2 = jr.b($$1);
         float $$3 = $$1.readFloat();
         Vector3f $$4 = jr.b($$1);
         return new jp($$2, $$4, $$3);
      }
   };
   private final Vector3f i;

   public jp(Vector3f $$0, Vector3f $$1, float $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   public Vector3f c() {
      return this.g;
   }

   public Vector3f d() {
      return this.i;
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      $$0.a(this.i.x());
      $$0.a(this.i.y());
      $$0.a(this.i.z());
   }

   @Override
   public String a() {
      return String.format(
         Locale.ROOT, "%s %.2f %.2f %.2f %.2f %.2f %.2f %.2f", kc.k.b(this.b()), this.g.x(), this.g.y(), this.g.z(), this.h, this.i.x(), this.i.y(), this.i.z()
      );
   }

   @Override
   public jv<jp> b() {
      return jw.p;
   }
}
