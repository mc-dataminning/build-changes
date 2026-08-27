import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import org.joml.Vector3f;

public class jo extends jq {
   public static final Vector3f a = elb.a(3790560).j();
   public static final jo b = new jo(a, jp.a, 1.0F);
   public static final Codec<jo> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.d.fieldOf("fromColor").forGetter($$0x -> $$0x.g),
               atg.d.fieldOf("toColor").forGetter($$0x -> $$0x.i),
               Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, jo::new)
   );
   public static final jt.a<jo> d = new jt.a<jo>() {
      public jo a(ju<jo> $$0, StringReader $$1) throws CommandSyntaxException {
         Vector3f $$2 = jq.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         Vector3f $$4 = jq.a($$1);
         return new jo($$2, $$4, $$3);
      }

      public jo a(ju<jo> $$0, ue $$1) {
         Vector3f $$2 = jq.b($$1);
         float $$3 = $$1.readFloat();
         Vector3f $$4 = jq.b($$1);
         return new jo($$2, $$4, $$3);
      }
   };
   private final Vector3f i;

   public jo(Vector3f $$0, Vector3f $$1, float $$2) {
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
   public void a(ue $$0) {
      super.a($$0);
      $$0.a(this.i.x());
      $$0.a(this.i.y());
      $$0.a(this.i.z());
   }

   @Override
   public String a() {
      return String.format(
         Locale.ROOT, "%s %.2f %.2f %.2f %.2f %.2f %.2f %.2f", kb.j.b(this.b()), this.g.x(), this.g.y(), this.g.z(), this.h, this.i.x(), this.i.y(), this.i.z()
      );
   }

   @Override
   public ju<jo> b() {
      return jv.p;
   }
}
