import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yk extends xe {
   MapCodec<yk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yk::b)).apply($$0, yk::a));
   xe.a<yk> b = new xe.a<>(a, "text");
   yk c = new yk() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yk a(String $$0) {
      return (yk)($$0.isEmpty() ? c : new yk.a($$0));
   }

   String b();

   @Override
   default xe.a<?> a() {
      return b;
   }

   public static record a(String d) implements yk {
      @Override
      public <T> Optional<T> a(xi.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xi.b<T> $$0, ya $$1) {
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
