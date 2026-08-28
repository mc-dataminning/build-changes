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

public record gsx(@Nullable hnk b, @Nullable hnl.a d, @Nullable Boolean e, @Nullable gte f, gti.a g, @Nullable alr h) implements hnl {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gsx.class, new gsx.a())
      .registerTypeAdapter(gsu.class, new gsu.a())
      .registerTypeAdapter(gsv.class, new gsv.a())
      .registerTypeAdapter(gtd.class, new gtd.a())
      .registerTypeAdapter(gte.class, new gte.a())
      .create();

   public static gsx a(Reader $$0) {
      return azo.a(a, $$0, gsx.class);
   }

   @Nullable
   @Override
   public hnk a() {
      return this.b;
   }

   @Nullable
   @Override
   public hnl.a b() {
      return this.d;
   }

   @Nullable
   @Override
   public Boolean c() {
      return this.e;
   }

   @Nullable
   @Override
   public gte d() {
      return this.f;
   }

   @Override
   public gti.a e() {
      return this.g;
   }

   @Nullable
   @Override
   public alr f() {
      return this.h;
   }

   public static class a implements JsonDeserializer<gsx> {
      public gsx a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         hnk $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gti.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gte $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = azo.u($$3, "display");
            $$8 = (gte)$$2.deserialize($$9, gte.class);
         }

         hnl.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hnl.a.a(azo.i($$3, "gui_light"));
         }

         alr $$11 = $$5.isEmpty() ? null : alr.a($$5);
         return new gsx($$4, $$10, $$7, $$8, $$6, $$11);
      }

      private gti.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = azo.u($$0, "textures");
            return gti.a($$1, hkp.c);
         } else {
            return gti.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return azo.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? azo.k($$0, "ambientocclusion") : null;
      }

      @Nullable
      protected hnk a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return null;
         } else {
            List<gsu> $$2 = new ArrayList<>();

            for (JsonElement $$3 : azo.v($$1, "elements")) {
               $$2.add((gsu)$$0.deserialize($$3, gsu.class));
            }

            return new gtg($$2);
         }
      }
   }
}
