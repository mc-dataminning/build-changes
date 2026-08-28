import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import java.util.function.Predicate;

public interface hjc {
   akz a = new akz("textures", ".png");

   void a(avd var1, hjc.a var2);

   MapCodec<? extends hjc> a();

   public interface a {
      default void a(alg $$0, avb $$1) {
         this.a($$0, $$2 -> $$2.loadSprite($$0, $$1));
      }

      void a(alg var1, hjc.b var2);

      void a(Predicate<alg> var1);
   }

   public interface b extends Function<hjb, hir> {
      default void a() {
      }
   }
}
