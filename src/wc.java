import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface wc extends uw {
   MapCodec<wc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(wc::b)).apply($$0, wc::a));
   uw.a<wc> b = new uw.a<>(a, "text");
   wc c = new wc() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static wc a(String $$0) {
      return (wc)($$0.isEmpty() ? c : new wc.a($$0));
   }

   String b();

   @Override
   default uw.a<?> a() {
      return b;
   }

   public static record a(String d) implements wc {
      @Override
      public <T> Optional<T> a(va.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(va.b<T> $$0, vs $$1) {
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
