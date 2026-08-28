import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface zc extends xw {
   MapCodec<zc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(zc::b)).apply($$0, zc::a));
   xw.a<zc> b = new xw.a<>(a, "text");
   zc c = new zc() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static zc a(String $$0) {
      return (zc)($$0.isEmpty() ? c : new zc.a($$0));
   }

   String b();

   @Override
   default xw.a<?> a() {
      return b;
   }

   public static record a(String d) implements zc {
      @Override
      public <T> Optional<T> a(ya.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(ya.b<T> $$0, ys $$1) {
         return $$0.accept($$1, this.d);
      }

      @Override
      public String toString() {
         return "literal{" + this.d + "}";
      }

      @Override
      public String b() {
         return this.d;
      }
   }
}
