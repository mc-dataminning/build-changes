import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface wm extends vg {
   MapCodec<wm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(wm::b)).apply($$0, wm::a));
   vg.a<wm> b = new vg.a<>(a, "text");
   wm c = new wm() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static wm a(String $$0) {
      return (wm)($$0.isEmpty() ? c : new wm.a($$0));
   }

   String b();

   @Override
   default vg.a<?> a() {
      return b;
   }

   public static record a(String d) implements wm {
      @Override
      public <T> Optional<T> a(vk.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(vk.b<T> $$0, wc $$1) {
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
