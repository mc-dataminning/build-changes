import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class wj implements vg {
   public static final MapCodec<wj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("keybind").forGetter($$0x -> $$0x.c)).apply($$0, wj::new)
   );
   public static final vg.a<wj> b = new vg.a<>(a, "keybind");
   private final String c;
   @Nullable
   private Supplier<vf> d;

   public wj(String $$0) {
      this.c = $$0;
   }

   private vf c() {
      if (this.d == null) {
         this.d = wk.a.apply(this.c);
      }

      return this.d.get();
   }

   @Override
   public <T> Optional<T> a(vk.a<T> $$0) {
      return this.c().a($$0);
   }

   @Override
   public <T> Optional<T> a(vk.b<T> $$0, wc $$1) {
      return this.c().a($$0, $$1);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wj $$1 && this.c.equals($$1.c)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   @Override
   public String toString() {
      return "keybind{" + this.c + "}";
   }

   public String b() {
      return this.c;
   }

   @Override
   public vg.a<?> a() {
      return b;
   }
}
