import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import org.joml.Vector3f;

public class kg extends ki {
   public static final Vector3f a = esj.a(3790560).j();
   public static final kg b = new kg(a, kh.a, 1.0F);
   public static final Codec<kg> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.c.fieldOf("fromColor").forGetter($$0x -> $$0x.h),
               awu.c.fieldOf("toColor").forGetter($$0x -> $$0x.j),
               Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, kg::new)
   );
   public static final yg<vt, kg> d = yg.a(ye.q, $$0 -> $$0.h, ye.q, $$0 -> $$0.j, ye.h, $$0 -> $$0.i, kg::new);
   public static final kl.a<kg> e = new kl.a<kg>() {
      public kg a(km<kg> $$0, StringReader $$1, ip.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = ki.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         Vector3f $$5 = ki.a($$1);
         return new kg($$3, $$5, $$4);
      }
   };
   private final Vector3f j;

   public kg(Vector3f $$0, Vector3f $$1, float $$2) {
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
   public String a(ip.a $$0) {
      return String.format(
         Locale.ROOT, "%s %.2f %.2f %.2f %.2f %.2f %.2f %.2f", kt.j.b(this.a()), this.h.x(), this.h.y(), this.h.z(), this.i, this.j.x(), this.j.y(), this.j.z()
      );
   }

   @Override
   public km<kg> a() {
      return kn.p;
   }
}
