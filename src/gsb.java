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

public record gsb(@Nullable hml b, @Nullable hmm.a d, @Nullable Boolean e, @Nullable gsh f, gsl.a g, @Nullable alg h) implements hmm {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gsb.class, new gsb.a())
      .registerTypeAdapter(gry.class, new gry.a())
      .registerTypeAdapter(grz.class, new grz.a())
      .registerTypeAdapter(gsg.class, new gsg.a())
      .registerTypeAdapter(gsh.class, new gsh.a())
      .create();

   public static gsb a(Reader $$0) {
      return azc.a(a, $$0, gsb.class);
   }

   @Nullable
   @Override
   public hml a() {
      return this.b;
   }

   @Nullable
   @Override
   public hmm.a b() {
      return this.d;
   }

   @Nullable
   @Override
   public Boolean c() {
      return this.e;
   }

   @Nullable
   @Override
   public gsh d() {
      return this.f;
   }

   @Override
   public gsl.a e() {
      return this.g;
   }

   @Nullable
   @Override
   public alg f() {
      return this.h;
   }

   public static class a implements JsonDeserializer<gsb> {
      public gsb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         hml $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gsl.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gsh $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = azc.u($$3, "display");
            $$8 = (gsh)$$2.deserialize($$9, gsh.class);
         }

         hmm.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hmm.a.a(azc.i($$3, "gui_light"));
         }

         alg $$11 = $$5.isEmpty() ? null : alg.a($$5);
         return new gsb($$4, $$10, $$7, $$8, $$6, $$11);
      }

      private gsl.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = azc.u($$0, "textures");
            return gsl.a($$1, hjp.c);
         } else {
            return gsl.a.a;
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
      protected hml a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return null;
         } else {
            List<gry> $$2 = new ArrayList<>();

            for (JsonElement $$3 : azc.v($$1, "elements")) {
               $$2.add((gry)$$0.deserialize($$3, gry.class));
            }

            return new gsk($$2);
         }
      }
   }
}
