import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface us extends tm {
   MapCodec<us> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(us::b)).apply($$0, us::a));
   tm.a<us> b = new tm.a<>(a, "text");
   us c = new us() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static us a(String $$0) {
      return (us)($$0.isEmpty() ? c : new us.a($$0));
   }

   String b();

   @Override
   default tm.a<?> a() {
      return b;
   }

   public static record a(String d) implements us {
      @Override
      public <T> Optional<T> a(tq.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(tq.b<T> $$0, ui $$1) {
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
