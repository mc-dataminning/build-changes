import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class kv extends kw {
   public static final Vector3f a = ewu.a(16711680).j();
   public static final kv b = new kv(a, 1.0F);
   public static final Codec<kv> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(axu.c.fieldOf("color").forGetter($$0x -> $$0x.h), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.i)).apply($$0, kv::new)
   );
   public static final zc<wp, kv> d = zc.a(za.r, $$0 -> $$0.h, za.i, $$0 -> $$0.i, kv::new);
   public static final kz.a<kv> e = new kz.a<kv>() {
      public kv a(la<kv> $$0, StringReader $$1, jc.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = kw.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         return new kv($$3, $$4);
      }
   };

   public kv(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public la<kv> a() {
      return lb.n;
   }
}
