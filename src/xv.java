import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface xv extends wp {
   MapCodec<xv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(xv::b)).apply($$0, xv::a));
   wp.a<xv> b = new wp.a<>(a, "text");
   xv c = new xv() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static xv a(String $$0) {
      return (xv)($$0.isEmpty() ? c : new xv.a($$0));
   }

   String b();

   @Override
   default wp.a<?> a() {
      return b;
   }

   public static record a(String d) implements xv {
      @Override
      public <T> Optional<T> a(wt.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(wt.b<T> $$0, xl $$1) {
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
