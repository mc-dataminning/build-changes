import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import java.util.function.Predicate;

public interface hie {
   akx a = new akx("textures", ".png");

   void a(avb var1, hie.a var2);

   MapCodec<? extends hie> a();

   public interface a {
      default void a(ale $$0, auz $$1) {
         this.a($$0, $$2 -> $$2.loadSprite($$0, $$1));
      }

      void a(ale var1, hie.b var2);

      void a(Predicate<ale> var1);
   }

   public interface b extends Function<hid, hht> {
      default void a() {
      }
   }
}
