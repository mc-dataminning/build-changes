import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yo extends xi {
   MapCodec<yo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yo::b)).apply($$0, yo::a));
   xi.a<yo> b = new xi.a<>(a, "text");
   yo c = new yo() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yo a(String $$0) {
      return (yo)($$0.isEmpty() ? c : new yo.a($$0));
   }

   String b();

   @Override
   default xi.a<?> a() {
      return b;
   }

   public static record a(String d) implements yo {
      @Override
      public <T> Optional<T> a(xm.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xm.b<T> $$0, ye $$1) {
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
