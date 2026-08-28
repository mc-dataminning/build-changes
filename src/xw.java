import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface xw extends wq {
   MapCodec<xw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(xw::b)).apply($$0, xw::a));
   wq.a<xw> b = new wq.a<>(a, "text");
   xw c = new xw() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static xw a(String $$0) {
      return (xw)($$0.isEmpty() ? c : new xw.a($$0));
   }

   String b();

   @Override
   default wq.a<?> a() {
      return b;
   }

   public static record a(String d) implements xw {
      @Override
      public <T> Optional<T> a(wu.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(wu.b<T> $$0, xm $$1) {
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
