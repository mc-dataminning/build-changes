import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import java.util.function.Predicate;

public interface hjv {
   akz a = new akz("textures", ".png");

   void a(avd var1, hjv.a var2);

   MapCodec<? extends hjv> a();

   public interface a {
      default void a(alg $$0, avb $$1) {
         this.a($$0, $$2 -> $$2.loadSprite($$0, $$1));
      }

      void a(alg var1, hjv.b var2);

      void a(Predicate<alg> var1);
   }

   public interface b extends Function<hju, hjk> {
      default void a() {
      }
   }
}
