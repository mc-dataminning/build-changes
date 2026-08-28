import com.google.common.annotations.VisibleForTesting;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public record grw(@Nullable hme b, @Nullable hmf.a d, @Nullable Boolean e, @Nullable gsc f, gsg.a g, @Nullable alg h) implements hmf {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(grw.class, new grw.a())
      .registerTypeAdapter(grt.class, new grt.a())
      .registerTypeAdapter(gru.class, new gru.a())
      .registerTypeAdapter(gsb.class, new gsb.a())
      .registerTypeAdapter(gsc.class, new gsc.a())
      .create();

   public static grw a(Reader $$0) {
      return azc.a(a, $$0, grw.class);
   }

   @Nullable
   @Override
   public hme a() {
      return this.b;
   }

   @Nullable
   @Override
   public hmf.a b() {
      return this.d;
   }

   @Nullable
   @Override
   public Boolean c() {
      return this.e;
   }

   @Nullable
   @Override
   public gsc d() {
      return this.f;
   }

   @Override
   public gsg.a e() {
      return this.g;
   }

   @Nullable
   @Override
   public alg f() {
      return this.h;
   }

   public static class a implements JsonDeserializer<grw> {
      public grw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         hme $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gsg.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gsc $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = azc.u($$3, "display");
            $$8 = (gsc)$$2.deserialize($$9, gsc.class);
         }

         hmf.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hmf.a.a(azc.i($$3, "gui_light"));
         }

         alg $$11 = $$5.isEmpty() ? null : alg.a($$5);
         return new grw($$4, $$10, $$7, $$8, $$6, $$11);
      }

      private gsg.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = azc.u($$0, "textures");
            return gsg.a($$1, hjj.c);
         } else {
            return gsg.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return azc.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? azc.k($$0, "ambientocclusion") : null;
      }

      @Nullable
      protected hme a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return null;
         } else {
            List<grt> $$2 = new ArrayList<>();

            for (JsonElement $$3 : azc.v($$1, "elements")) {
               $$2.add((grt)$$0.deserialize($$3, grt.class));
            }

            return new gsf($$2);
         }
      }
   }
}
