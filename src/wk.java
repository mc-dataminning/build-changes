import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface wk extends ve {
   MapCodec<wk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(wk::b)).apply($$0, wk::a));
   ve.a<wk> b = new ve.a<>(a, "text");
   wk c = new wk() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static wk a(String $$0) {
      return (wk)($$0.isEmpty() ? c : new wk.a($$0));
   }

   String b();

   @Override
   default ve.a<?> a() {
      return b;
   }

   public static record a(String d) implements wk {
      @Override
      public <T> Optional<T> a(vi.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(vi.b<T> $$0, wa $$1) {
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
