import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Locale;

public class ko implements ku {
   public static final ku.a<ko> a = ($$0, $$1, $$2) -> new ko($$0, $$1.readInt());
   private final kv<? extends ko> b;
   private final int c;

   public static Codec<ko> a(kv<ko> $$0) {
      return Codec.INT.xmap($$1 -> new ko($$0, $$1), $$0x -> $$0x.c);
   }

   public static yq<? super ByteBuf, ko> b(kv<ko> $$0) {
      return yo.e.a($$1 -> new ko($$0, $$1), $$0x -> $$0x.c);
   }

   private ko(kv<? extends ko> $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public kv<?> a() {
      return this.b;
   }

   @Override
   public String a(ix.a $$0) {
      return String.format(Locale.ROOT, "%s 0x%x", lc.j.b(this.a()), this.c);
   }

   public float b() {
      return (float)axg.b.b(this.c) / 255.0F;
   }

   public float c() {
      return (float)axg.b.c(this.c) / 255.0F;
   }

   public float d() {
      return (float)axg.b.d(this.c) / 255.0F;
   }

   public float e() {
      return (float)axg.b.a(this.c) / 255.0F;
   }

   public static ko a(kv<? extends ko> $$0, int $$1) {
      return new ko($$0, $$1);
   }

   public static ko a(kv<? extends ko> $$0, float $$1, float $$2, float $$3) {
      return a($$0, axg.b.a(a($$1), a($$2), a($$3)));
   }

   private static int a(float $$0) {
      return axw.d($$0 * 255.0F);
   }
}
