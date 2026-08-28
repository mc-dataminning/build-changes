import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yn extends xh {
   MapCodec<yn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yn::b)).apply($$0, yn::a));
   xh.a<yn> b = new xh.a<>(a, "text");
   yn c = new yn() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yn a(String $$0) {
      return (yn)($$0.isEmpty() ? c : new yn.a($$0));
   }

   String b();

   @Override
   default xh.a<?> a() {
      return b;
   }

   public static record a(String d) implements yn {
      @Override
      public <T> Optional<T> a(xl.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xl.b<T> $$0, yd $$1) {
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
