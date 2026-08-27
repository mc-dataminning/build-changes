import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface vy extends us {
   MapCodec<vy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(vy::b)).apply($$0, vy::a));
   us.a<vy> b = new us.a<>(a, "text");
   vy c = new vy() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static vy a(String $$0) {
      return (vy)($$0.isEmpty() ? c : new vy.a($$0));
   }

   String b();

   @Override
   default us.a<?> a() {
      return b;
   }

   public static record a(String d) implements vy {
      @Override
      public <T> Optional<T> a(uw.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(uw.b<T> $$0, vo $$1) {
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
