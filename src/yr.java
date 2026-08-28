import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yr extends xl {
   MapCodec<yr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yr::b)).apply($$0, yr::a));
   xl.a<yr> b = new xl.a<>(a, "text");
   yr c = new yr() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yr a(String $$0) {
      return (yr)($$0.isEmpty() ? c : new yr.a($$0));
   }

   String b();

   @Override
   default xl.a<?> a() {
      return b;
   }

   public static record a(String d) implements yr {
      @Override
      public <T> Optional<T> a(xp.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xp.b<T> $$0, yh $$1) {
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
