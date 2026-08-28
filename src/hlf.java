import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import java.util.function.Predicate;

public interface hlf {
   alb a = new alb("textures", ".png");

   void a(avf var1, hlf.a var2);

   MapCodec<? extends hlf> a();

   public interface a {
      default void a(ali $$0, avd $$1) {
         this.a($$0, $$2 -> $$2.loadSprite($$0, $$1));
      }

      void a(ali var1, hlf.b var2);

      void a(Predicate<ali> var1);
   }

   public interface b extends Function<hle, hku> {
      default void a() {
      }
   }
}
