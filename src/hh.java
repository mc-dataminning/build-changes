import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface hh<A extends ArgumentType<?>, T extends hh.a<A>> {
   void a(T var1, ue var2);

   T b(ue var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dn var1);

      hh<A, ?> a();
   }
}
