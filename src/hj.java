import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface hj<A extends ArgumentType<?>, T extends hj.a<A>> {
   void a(T var1, ty var2);

   T b(ty var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dp var1);

      hj<A, ?> a();
   }
}
