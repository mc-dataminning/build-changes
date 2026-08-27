import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import org.joml.Vector3f;

public class ku extends kw {
   public static final Vector3f a = ewu.a(3790560).j();
   public static final ku b = new ku(a, kv.a, 1.0F);
   public static final Codec<ku> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.c.fieldOf("fromColor").forGetter($$0x -> $$0x.h),
               axu.c.fieldOf("toColor").forGetter($$0x -> $$0x.j),
               Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ku::new)
   );
   public static final zc<wp, ku> d = zc.a(za.r, $$0 -> $$0.h, za.r, $$0 -> $$0.j, za.i, $$0 -> $$0.i, ku::new);
   public static final kz.a<ku> e = new kz.a<ku>() {
      public ku a(la<ku> $$0, StringReader $$1, jc.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = kw.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         Vector3f $$5 = kw.a($$1);
         return new ku($$3, $$5, $$4);
      }
   };
   private final Vector3f j;

   public ku(Vector3f $$0, Vector3f $$1, float $$2) {
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
   public String a(jc.a $$0) {
      return String.format(
         Locale.ROOT, "%s %.2f %.2f %.2f %.2f %.2f %.2f %.2f", lh.j.b(this.a()), this.h.x(), this.h.y(), this.h.z(), this.i, this.j.x(), this.j.y(), this.j.z()
      );
   }

   @Override
   public la<ku> a() {
      return lb.o;
   }
}
