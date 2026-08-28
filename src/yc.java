import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yc extends ww {
   MapCodec<yc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yc::b)).apply($$0, yc::a));
   ww.a<yc> b = new ww.a<>(a, "text");
   yc c = new yc() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yc a(String $$0) {
      return (yc)($$0.isEmpty() ? c : new yc.a($$0));
   }

   String b();

   @Override
   default ww.a<?> a() {
      return b;
   }

   public static record a(String d) implements yc {
      @Override
      public <T> Optional<T> a(xa.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xa.b<T> $$0, xs $$1) {
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
