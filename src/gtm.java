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

public record gtm(@Nullable hnw b, @Nullable hnx.a d, @Nullable Boolean e, @Nullable gtt f, gtx.a g, @Nullable alk h) implements hnx {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gtm.class, new gtm.a())
      .registerTypeAdapter(gtj.class, new gtj.a())
      .registerTypeAdapter(gtk.class, new gtk.a())
      .registerTypeAdapter(gts.class, new gts.a())
      .registerTypeAdapter(gtt.class, new gtt.a())
      .create();

   public static gtm a(Reader $$0) {
      return azg.a(a, $$0, gtm.class);
   }

   @Nullable
   @Override
   public hnw a() {
      return this.b;
   }

   @Nullable
   @Override
   public hnx.a b() {
      return this.d;
   }

   @Nullable
   @Override
   public Boolean c() {
      return this.e;
   }

   @Nullable
   @Override
   public gtt d() {
      return this.f;
   }

   @Override
   public gtx.a e() {
      return this.g;
   }

   @Nullable
   @Override
   public alk f() {
      return this.h;
   }

   public static class a implements JsonDeserializer<gtm> {
      public gtm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         hnw $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gtx.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gtt $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = azg.u($$3, "display");
            $$8 = (gtt)$$2.deserialize($$9, gtt.class);
         }

         hnx.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hnx.a.a(azg.i($$3, "gui_light"));
         }

         alk $$11 = $$5.isEmpty() ? null : alk.a($$5);
         return new gtm($$4, $$10, $$7, $$8, $$6, $$11);
      }

      private gtx.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = azg.u($$0, "textures");
            return gtx.a($$1, hlb.c);
         } else {
            return gtx.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return azg.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? azg.k($$0, "ambientocclusion") : null;
      }

      @Nullable
      protected hnw a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return null;
         } else {
            List<gtj> $$2 = new ArrayList<>();

            for (JsonElement $$3 : azg.v($$1, "elements")) {
               $$2.add((gtj)$$0.deserialize($$3, gtj.class));
            }

            return new gtv($$2);
         }
      }
   }
}
