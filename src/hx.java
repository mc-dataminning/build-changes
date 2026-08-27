import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface hx<A extends ArgumentType<?>, T extends hx.a<A>> {
   void a(T var1, vu var2);

   T b(vu var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dz var1);

      hx<A, ?> a();
   }
}
