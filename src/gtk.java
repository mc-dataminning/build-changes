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

public record gtk(@Nullable hnu b, @Nullable hnv.a d, @Nullable Boolean e, @Nullable gtr f, gtv.a g, @Nullable ali h) implements hnv {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gtk.class, new gtk.a())
      .registerTypeAdapter(gth.class, new gth.a())
      .registerTypeAdapter(gti.class, new gti.a())
      .registerTypeAdapter(gtq.class, new gtq.a())
      .registerTypeAdapter(gtr.class, new gtr.a())
      .create();

   public static gtk a(Reader $$0) {
      return aze.a(a, $$0, gtk.class);
   }

   @Nullable
   @Override
   public hnu a() {
      return this.b;
   }

   @Nullable
   @Override
   public hnv.a b() {
      return this.d;
   }

   @Nullable
   @Override
   public Boolean c() {
      return this.e;
   }

   @Nullable
   @Override
   public gtr d() {
      return this.f;
   }

   @Override
   public gtv.a e() {
      return this.g;
   }

   @Nullable
   @Override
   public ali f() {
      return this.h;
   }

   public static class a implements JsonDeserializer<gtk> {
      public gtk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         hnu $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gtv.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gtr $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = aze.u($$3, "display");
            $$8 = (gtr)$$2.deserialize($$9, gtr.class);
         }

         hnv.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hnv.a.a(aze.i($$3, "gui_light"));
         }

         ali $$11 = $$5.isEmpty() ? null : ali.a($$5);
         return new gtk($$4, $$10, $$7, $$8, $$6, $$11);
      }

      private gtv.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = aze.u($$0, "textures");
            return gtv.a($$1, hkz.c);
         } else {
            return gtv.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return aze.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? aze.k($$0, "ambientocclusion") : null;
      }

      @Nullable
      protected hnu a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return null;
         } else {
            List<gth> $$2 = new ArrayList<>();

            for (JsonElement $$3 : aze.v($$1, "elements")) {
               $$2.add((gth)$$0.deserialize($$3, gth.class));
            }

            return new gtt($$2);
         }
      }
   }
}
