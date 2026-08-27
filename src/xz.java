import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface xz extends wt {
   MapCodec<xz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(xz::b)).apply($$0, xz::a));
   wt.a<xz> b = new wt.a<>(a, "text");
   xz c = new xz() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static xz a(String $$0) {
      return (xz)($$0.isEmpty() ? c : new xz.a($$0));
   }

   String b();

   @Override
   default wt.a<?> a() {
      return b;
   }

   public static record a(String d) implements xz {
      @Override
      public <T> Optional<T> a(wx.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(wx.b<T> $$0, xp $$1) {
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
