import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import org.joml.Vector3f;

public class ju extends jw {
   public static final Vector3f a = eov.a(3790560).j();
   public static final ju b = new ju(a, jv.a, 1.0F);
   public static final Codec<ju> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.d.fieldOf("fromColor").forGetter($$0x -> $$0x.h),
               avu.d.fieldOf("toColor").forGetter($$0x -> $$0x.j),
               Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ju::new)
   );
   public static final xq<vd, ju> d = xq.a(xo.m, $$0 -> $$0.h, xo.m, $$0 -> $$0.j, xo.f, $$0 -> $$0.i, ju::new);
   public static final jz.a<ju> e = new jz.a<ju>() {
      public ju a(ka<ju> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = jw.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         Vector3f $$5 = jw.a($$1);
         return new ju($$3, $$5, $$4);
      }
   };
   private final Vector3f j;

   public ju(Vector3f $$0, Vector3f $$1, float $$2) {
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
         Locale.ROOT, "%s %.2f %.2f %.2f %.2f %.2f %.2f %.2f", kh.j.b(this.a()), this.h.x(), this.h.y(), this.h.z(), this.i, this.j.x(), this.j.y(), this.j.z()
      );
   }

   @Override
   public ka<ju> a() {
      return kb.p;
   }
}
