import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface wn extends vh {
   MapCodec<wn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(wn::b)).apply($$0, wn::a));
   vh.a<wn> b = new vh.a<>(a, "text");
   wn c = new wn() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static wn a(String $$0) {
      return (wn)($$0.isEmpty() ? c : new wn.a($$0));
   }

   String b();

   @Override
   default vh.a<?> a() {
      return b;
   }

   public static record a(String d) implements wn {
      @Override
      public <T> Optional<T> a(vl.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(vl.b<T> $$0, wd $$1) {
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
