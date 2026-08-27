import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Locale;
import org.joml.Vector3f;

public class kp implements kv {
   public static final kv.a<kp> a = new kv.a<kp>() {
      public kp a(kw<kp> $$0, StringReader $$1, iy.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = ks.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         int $$5 = axj.b.a(kp.a($$4), kp.a($$3.x), kp.a($$3.y), kp.a($$3.z));
         return new kp($$0, $$5);
      }
   };
   private final kw<? extends kp> b;
   private final int c;

   public static Codec<kp> a(kw<kp> $$0) {
      return Codec.INT.xmap($$1 -> new kp($$0, $$1), $$0x -> $$0x.c);
   }

   public static ys<? super ByteBuf, kp> b(kw<kp> $$0) {
      return yq.e.a($$1 -> new kp($$0, $$1), $$0x -> $$0x.c);
   }

   kp(kw<? extends kp> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public kw<?> a() {
      return this.b;
   }

   @Override
   public String a(iy.a $$0) {
      return String.format(Locale.ROOT, "%s 0x%x", ld.j.b(this.a()), this.c);
   }

   public float b() {
      return (float)axj.b.b(this.c) / 255.0F;
   }

   public float c() {
      return (float)axj.b.c(this.c) / 255.0F;
   }

   public float d() {
      return (float)axj.b.d(this.c) / 255.0F;
   }

   public float e() {
      return (float)axj.b.a(this.c) / 255.0F;
   }

   public static kp a(kw<? extends kp> $$0, int $$1) {
      return new kp($$0, $$1);
   }

   public static kp a(kw<? extends kp> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axj.b.a(a($$1), a($$2), a($$3)));
   }

   static int a(float $$0) {
      return axz.d($$0 * 255.0F);
   }
}
