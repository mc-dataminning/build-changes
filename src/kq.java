import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.Locale;
import org.joml.Vector3f;

public class kq implements kw {
   public static final kw.a<kq> a = new kw.a<kq>() {
      public kq a(kx<kq> $$0, StringReader $$1, iz.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = kt.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         int $$5 = axp.b.a(kq.a($$4), kq.a($$3.x), kq.a($$3.y), kq.a($$3.z));
         return new kq($$0, $$5);
      }
   };
   private final kx<? extends kq> b;
   private final int c;

   public static MapCodec<kq> a(kx<kq> $$0) {
      return Codec.INT.xmap($$1 -> new kq($$0, $$1), $$0x -> $$0x.c).fieldOf("value");
   }

   public static yv<? super ByteBuf, kq> b(kx<kq> $$0) {
      return yt.e.a($$1 -> new kq($$0, $$1), $$0x -> $$0x.c);
   }

   kq(kx<? extends kq> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public kx<? extends kq> a() {
      return this.b;
   }

   @Override
   public String a(iz.a $$0) {
      return String.format(Locale.ROOT, "%s 0x%x", le.j.b(this.a()), this.c);
   }

   public float b() {
      return (float)axp.b.b(this.c) / 255.0F;
   }

   public float c() {
      return (float)axp.b.c(this.c) / 255.0F;
   }

   public float d() {
      return (float)axp.b.d(this.c) / 255.0F;
   }

   public float e() {
      return (float)axp.b.a(this.c) / 255.0F;
   }

   public static kq a(kx<? extends kq> $$0, int $$1) {
      return new kq($$0, $$1);
   }

   public static kq a(kx<? extends kq> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axp.b.a(a($$1), a($$2), a($$3)));
   }

   static int a(float $$0) {
      return ayf.d($$0 * 255.0F);
   }
}
