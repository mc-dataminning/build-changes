import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface hf<A extends ArgumentType<?>, T extends hf.a<A>> {
   void a(T var1, tl var2);

   T b(tl var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dp var1);

      hf<A, ?> a();
   }
}
