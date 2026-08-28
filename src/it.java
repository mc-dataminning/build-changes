import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface it<A extends ArgumentType<?>, T extends it.a<A>> {
   void a(T var1, vl var2);

   T b(vl var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(et var1);

      it<A, ?> a();
   }
}
