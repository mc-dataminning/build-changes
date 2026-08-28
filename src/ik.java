import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface ik<A extends ArgumentType<?>, T extends ik.a<A>> {
   void a(T var1, wm var2);

   T b(wm var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(el var1);

      ik<A, ?> a();
   }
}
