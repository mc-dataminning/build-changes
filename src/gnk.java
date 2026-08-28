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

public class gnk implements hhn {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gnk.class, new gnk.a())
      .registerTypeAdapter(gng.class, new gng.a())
      .registerTypeAdapter(gnh.class, new gnh.a())
      .registerTypeAdapter(gnj.class, new gnj.a())
      .registerTypeAdapter(gno.class, new gno.a())
      .registerTypeAdapter(gnp.class, new gnp.a())
      .create();
   private final List<gng> b;
   @Nullable
   private final hhn.a e;
   @Nullable
   private final Boolean f;
   @Nullable
   private final gnp g;
   @VisibleForTesting
   private final gnr.a h;
   @Nullable
   private hhn i;
   @Nullable
   private final akv j;

   public static gnk a(Reader $$0) {
      return ayp.a(a, $$0, gnk.class);
   }

   public gnk(@Nullable akv $$0, List<gng> $$1, gnr.a $$2, @Nullable Boolean $$3, @Nullable hhn.a $$4, @Nullable gnp $$5) {
      this.b = $$1;
      this.f = $$3;
      this.e = $$4;
      this.h = $$2;
      this.j = $$0;
      this.g = $$5;
   }

   @Nullable
   @Override
   public Boolean a() {
      return this.f;
   }

   @Nullable
   @Override
   public hhn.a b() {
      return this.e;
   }

   @Override
   public void a(hhk.a $$0) {
      if (this.j != null) {
         this.i = $$0.a(this.j);
      }
   }

   @Nullable
   @Override
   public hhn c() {
      return this.i;
   }

   @Override
   public gnr.a d() {
      return this.h;
   }

   @Nullable
   @Override
   public gnp e() {
      return this.g;
   }

   @Override
   public hgs a(gnr $$0, hhb $$1, hhi $$2, boolean $$3, boolean $$4, gnp $$5) {
      return this.b.isEmpty() && this.i != null ? this.i.a($$0, $$1, $$2, $$3, $$4, $$5) : hhl.a(this.b, $$0, $$1.a(), $$2, $$3, $$4, true, $$5);
   }

   @Nullable
   @VisibleForTesting
   List<gng> f() {
      return this.b;
   }

   @Nullable
   @VisibleForTesting
   akv g() {
      return this.j;
   }

   public static class a implements JsonDeserializer<gnk> {
      public gnk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gng> $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gnr.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gnp $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = ayp.u($$3, "display");
            $$8 = (gnp)$$2.deserialize($$9, gnp.class);
         }

         hhn.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hhn.a.a(ayp.i($$3, "gui_light"));
         }

         akv $$11 = $$5.isEmpty() ? null : akv.a($$5);
         return new gnk($$11, $$4, $$6, $$7, $$10, $$8);
      }

      private gnr.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = ayp.u($$0, "textures");
            return gnr.a($$1, her.d);
         } else {
            return gnr.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return ayp.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayp.k($$0, "ambientocclusion") : null;
      }

      protected List<gng> a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return List.of();
         } else {
            List<gng> $$2 = new ArrayList<>();

            for (JsonElement $$3 : ayp.v($$1, "elements")) {
               $$2.add((gng)$$0.deserialize($$3, gng.class));
            }

            return $$2;
         }
      }
   }
}
