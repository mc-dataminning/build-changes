import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import org.joml.Vector3f;

public class ke extends kg {
   public static final Vector3f a = esa.a(3790560).j();
   public static final ke b = new ke(a, kf.a, 1.0F);
   public static final Codec<ke> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aws.c.fieldOf("fromColor").forGetter($$0x -> $$0x.h),
               aws.c.fieldOf("toColor").forGetter($$0x -> $$0x.j),
               Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ke::new)
   );
   public static final ye<vr, ke> d = ye.a(yc.q, $$0 -> $$0.h, yc.q, $$0 -> $$0.j, yc.h, $$0 -> $$0.i, ke::new);
   public static final kj.a<ke> e = new kj.a<ke>() {
      public ke a(kk<ke> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = kg.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         Vector3f $$5 = kg.a($$1);
         return new ke($$3, $$5, $$4);
      }
   };
   private final Vector3f j;

   public ke(Vector3f $$0, Vector3f $$1, float $$2) {
      super($$0, $$2);
      this.j = $$1;
   }

   public Vector3f b() {
      return this.h;
   }

   public Vector3f c() {
      return this.j;
   }

   @Override
   public String a(in.a $$0) {
      return String.format(
         Locale.ROOT, "%s %.2f %.2f %.2f %.2f %.2f %.2f %.2f", kr.j.b(this.a()), this.h.x(), this.h.y(), this.h.z(), this.i, this.j.x(), this.j.y(), this.j.z()
      );
   }

   @Override
   public kk<ke> a() {
      return kl.p;
   }
}
