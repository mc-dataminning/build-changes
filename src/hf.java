import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface hf<A extends ArgumentType<?>, T extends hf.a<A>> {
   void a(T var1, tu var2);

   T b(tu var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dp var1);

      hf<A, ?> a();
   }
}
