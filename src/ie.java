import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface ie<A extends ArgumentType<?>, T extends ie.a<A>> {
   void a(T var1, vs var2);

   T b(vs var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(ee var1);

      ie<A, ?> a();
   }
}
