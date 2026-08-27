import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface hn<A extends ArgumentType<?>, T extends hn.a<A>> {
   void a(T var1, us var2);

   T b(us var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dq var1);

      hn<A, ?> a();
   }
}
