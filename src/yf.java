import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yf extends wz {
   MapCodec<yf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yf::b)).apply($$0, yf::a));
   wz.a<yf> b = new wz.a<>(a, "text");
   yf c = new yf() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yf a(String $$0) {
      return (yf)($$0.isEmpty() ? c : new yf.a($$0));
   }

   String b();

   @Override
   default wz.a<?> a() {
      return b;
   }

   public static record a(String d) implements yf {
      @Override
      public <T> Optional<T> a(xd.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xd.b<T> $$0, xv $$1) {
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
