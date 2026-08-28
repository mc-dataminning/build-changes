import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import java.util.function.Predicate;

public interface hlh {
   ald a = new ald("textures", ".png");

   void a(avh var1, hlh.a var2);

   MapCodec<? extends hlh> a();

   public interface a {
      default void a(alk $$0, avf $$1) {
         this.a($$0, $$2 -> $$2.loadSprite($$0, $$1));
      }

      void a(alk var1, hlh.b var2);

      void a(Predicate<alk> var1);
   }

   public interface b extends Function<hlg, hkw> {
      default void a() {
      }
   }
}
