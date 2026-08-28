import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface io<A extends ArgumentType<?>, T extends io.a<A>> {
   void a(T var1, vw var2);

   T b(vw var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(ep var1);

      io<A, ?> a();
   }
}
