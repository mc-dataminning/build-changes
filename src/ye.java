import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface ye extends wy {
   MapCodec<ye> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(ye::b)).apply($$0, ye::a));
   wy.a<ye> b = new wy.a<>(a, "text");
   ye c = new ye() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static ye a(String $$0) {
      return (ye)($$0.isEmpty() ? c : new ye.a($$0));
   }

   String b();

   @Override
   default wy.a<?> a() {
      return b;
   }

   public static record a(String d) implements ye {
      @Override
      public <T> Optional<T> a(xc.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xc.b<T> $$0, xu $$1) {
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
