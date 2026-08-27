import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface hy<A extends ArgumentType<?>, T extends hy.a<A>> {
   void a(T var1, vx var2);

   T b(vx var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(ea var1);

      hy<A, ?> a();
   }
}
