import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import java.util.function.Predicate;

public interface hkv {
   alk a = new alk("textures", ".png");

   void a(avo var1, hkv.a var2);

   MapCodec<? extends hkv> a();

   public interface a {
      default void a(alr $$0, avm $$1) {
         this.a($$0, $$2 -> $$2.loadSprite($$0, $$1));
      }

      void a(alr var1, hkv.b var2);

      void a(Predicate<alr> var1);
   }

   public interface b extends Function<hku, hkk> {
      default void a() {
      }
   }
}
