import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Locale;
import org.joml.Vector3f;

public class kt implements kz {
   public static final kz.a<kt> a = new kz.a<kt>() {
      public kt a(la<kt> $$0, StringReader $$1, jc.a $$2) throws CommandSyntaxException {
         Vector3f $$3 = kw.a($$1);
         $$1.expect(' ');
         float $$4 = $$1.readFloat();
         int $$5 = axw.b.a(kt.a($$4), kt.a($$3.x), kt.a($$3.y), kt.a($$3.z));
         return new kt($$0, $$5);
      }
   };
   private final la<? extends kt> b;
   private final int c;

   public static Codec<kt> a(la<kt> $$0) {
      return Codec.INT.xmap($$1 -> new kt($$0, $$1), $$0x -> $$0x.c);
   }

   public static zc<? super ByteBuf, kt> b(la<kt> $$0) {
      return za.f.a($$1 -> new kt($$0, $$1), $$0x -> $$0x.c);
   }

   kt(la<? extends kt> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public la<?> a() {
      return this.b;
   }

   @Override
   public String a(jc.a $$0) {
      return String.format(Locale.ROOT, "%s 0x%x", lh.j.b(this.a()), this.c);
   }

   public float b() {
      return (float)axw.b.b(this.c) / 255.0F;
   }

   public float c() {
      return (float)axw.b.c(this.c) / 255.0F;
   }

   public float d() {
      return (float)axw.b.d(this.c) / 255.0F;
   }

   public float e() {
      return (float)axw.b.a(this.c) / 255.0F;
   }

   public static kt a(la<? extends kt> $$0, int $$1) {
      return new kt($$0, $$1);
   }

   public static kt a(la<? extends kt> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axw.b.a(a($$1), a($$2), a($$3)));
   }

   static int a(float $$0) {
      return aym.d($$0 * 255.0F);
   }
}
