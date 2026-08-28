import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface ir<A extends ArgumentType<?>, T extends ir.a<A>> {
   void a(T var1, we var2);

   T b(we var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(er var1);

      ir<A, ?> a();
   }
}
