import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import org.joml.Vector3f;

public class js extends ju {
   public static final Vector3f a = enz.a(3790560).j();
   public static final js b = new js(a, jt.a, 1.0F);
   public static final Codec<js> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avq.d.fieldOf("fromColor").forGetter($$0x -> $$0x.h),
               avq.d.fieldOf("toColor").forGetter($$0x -> $$0x.j),
               Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, js::new)
   );
   public static final xo<vb, js> d = xo.a(xm.l, $$0 -> $$0.h, xm.l, $$0 -> $$0.j, xm.f, $$0 -> $$0.i, js::new);
   public static final jx.a<js> e = new jx.a<js>() {
      public js a(jy<js> $$0, StringReader $$1) throws CommandSyntaxException {
         Vector3f $$2 = ju.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         Vector3f $$4 = ju.a($$1);
         return new js($$2, $$4, $$3);
      }
   };
   private final Vector3f j;

   public js(Vector3f $$0, Vector3f $$1, float $$2) {
      super($$0, $$2);
      this.j = $$1;
   }

   public Vector3f c() {
      return this.h;
   }

   public Vector3f d() {
      return this.j;
   }

   @Override
   public String a() {
      return String.format(
         Locale.ROOT, "%s %.2f %.2f %.2f %.2f %.2f %.2f %.2f", kf.j.b(this.b()), this.h.x(), this.h.y(), this.h.z(), this.i, this.j.x(), this.j.y(), this.j.z()
      );
   }

   @Override
   public jy<js> b() {
      return jz.p;
   }
}
