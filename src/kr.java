import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import org.joml.Vector3f;

public class kr extends kt {
   public static final Vector3f a = eum.a(3790560).j();
   public static final kr b = new kr(a, ks.a, 1.0F);
   public static final MapCodec<kr> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axn.c.fieldOf("fromColor").forGetter($$0x -> $$0x.h),
               axn.c.fieldOf("toColor").forGetter($$0x -> $$0x.j),
               Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, kr::new)
   );
   public static final yv<wi, kr> d = yv.a(yt.q, $$0 -> $$0.h, yt.q, $$0 -> $$0.j, yt.h, $$0 -> $$0.i, kr::new);
   public static final kw.a<kr> e = new kw.a<kr>() {
      public kr a(kx<kr> $$0, StringReader $$1, iz.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = kt.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         Vector3f $$5 = kt.a($$1);
         return new kr($$3, $$5, $$4);
      }
   };
   private final Vector3f j;

   public kr(Vector3f $$0, Vector3f $$1, float $$2) {
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
   public String a(iz.a $$0) {
      return String.format(
         Locale.ROOT, "%s %.2f %.2f %.2f %.2f %.2f %.2f %.2f", le.j.b(this.a()), this.h.x(), this.h.y(), this.h.z(), this.i, this.j.x(), this.j.y(), this.j.z()
      );
   }

   @Override
   public kx<kr> a() {
      return ky.o;
   }
}
