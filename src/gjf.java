import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public record gjf(@Nullable jl b, int c, String d, gjh e) {
   public static final int a = -1;

   @Nullable
   public jl a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public gjh d() {
      return this.e;
   }

   protected static class a implements JsonDeserializer<gjf> {
      private static final int a = -1;

      public gjf a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         jl $$4 = this.c($$3);
         int $$5 = this.a($$3);
         String $$6 = this.b($$3);
         gjh $$7 = (gjh)$$2.deserialize($$3, gjh.class);
         return new gjf($$4, $$5, $$6, $$7);
      }

      protected int a(JsonObject $$0) {
         return ayz.a($$0, "tintindex", -1);
      }

      private String b(JsonObject $$0) {
         return ayz.i($$0, "texture");
      }

      @Nullable
      private jl c(JsonObject $$0) {
         String $$1 = ayz.a($$0, "cullface", "");
         return jl.a($$1);
      }
   }
}
