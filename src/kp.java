import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import org.joml.Vector3f;

public class kp extends kr {
   public static final Vector3f a = etf.a(3790560).j();
   public static final kp b = new kp(a, kq.a, 1.0F);
   public static final Codec<kp> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.c.fieldOf("fromColor").forGetter($$0x -> $$0x.h),
               axe.c.fieldOf("toColor").forGetter($$0x -> $$0x.j),
               Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, kp::new)
   );
   public static final yq<wd, kp> d = yq.a(yo.q, $$0 -> $$0.h, yo.q, $$0 -> $$0.j, yo.h, $$0 -> $$0.i, kp::new);
   public static final ku.a<kp> e = new ku.a<kp>() {
      public kp a(kv<kp> $$0, StringReader $$1, ix.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = kr.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         Vector3f $$5 = kr.a($$1);
         return new kp($$3, $$5, $$4);
      }
   };
   private final Vector3f j;

   public kp(Vector3f $$0, Vector3f $$1, float $$2) {
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
   public String a(ix.a $$0) {
      return String.format(
         Locale.ROOT, "%s %.2f %.2f %.2f %.2f %.2f %.2f %.2f", lc.j.b(this.a()), this.h.x(), this.h.y(), this.h.z(), this.i, this.j.x(), this.j.y(), this.j.z()
      );
   }

   @Override
   public kv<kp> a() {
      return kw.o;
   }
}
