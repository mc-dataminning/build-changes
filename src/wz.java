import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface wz extends vt {
   MapCodec<wz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(wz::b)).apply($$0, wz::a));
   vt.a<wz> b = new vt.a<>(a, "text");
   wz c = new wz() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static wz a(String $$0) {
      return (wz)($$0.isEmpty() ? c : new wz.a($$0));
   }

   String b();

   @Override
   default vt.a<?> a() {
      return b;
   }

   public static record a(String d) implements wz {
      @Override
      public <T> Optional<T> a(vx.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(vx.b<T> $$0, wp $$1) {
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
