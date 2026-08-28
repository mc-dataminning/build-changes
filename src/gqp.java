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

public class gqp implements hku {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gqp.class, new gqp.a())
      .registerTypeAdapter(gql.class, new gql.a())
      .registerTypeAdapter(gqm.class, new gqm.a())
      .registerTypeAdapter(gqo.class, new gqo.a())
      .registerTypeAdapter(gqt.class, new gqt.a())
      .registerTypeAdapter(gqu.class, new gqu.a())
      .create();
   private final List<gql> b;
   @Nullable
   private final hku.a e;
   @Nullable
   private final Boolean f;
   @Nullable
   private final gqu g;
   @VisibleForTesting
   private final gqw.a h;
   @Nullable
   private hku i;
   @Nullable
   private final ale j;

   public static gqp a(Reader $$0) {
      return aza.a(a, $$0, gqp.class);
   }

   public gqp(@Nullable ale $$0, List<gql> $$1, gqw.a $$2, @Nullable Boolean $$3, @Nullable hku.a $$4, @Nullable gqu $$5) {
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
   public hku.a b() {
      return this.e;
   }

   @Override
   public void a(hkr.a $$0) {
      if (this.j != null) {
         this.i = $$0.a(this.j);
      }
   }

   @Nullable
   @Override
   public hku c() {
      return this.i;
   }

   @Override
   public gqw.a d() {
      return this.h;
   }

   @Nullable
   @Override
   public gqu e() {
      return this.g;
   }

   @Override
   public hjz a(gqw $$0, hki $$1, hkp $$2, boolean $$3, boolean $$4, gqu $$5) {
      return this.b.isEmpty() && this.i != null ? this.i.a($$0, $$1, $$2, $$3, $$4, $$5) : hks.a(this.b, $$0, $$1.a(), $$2, $$3, $$4, true, $$5);
   }

   @Nullable
   @VisibleForTesting
   List<gql> f() {
      return this.b;
   }

   @Nullable
   @VisibleForTesting
   ale g() {
      return this.j;
   }

   public static class a implements JsonDeserializer<gqp> {
      public gqp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gql> $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gqw.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gqu $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = aza.u($$3, "display");
            $$8 = (gqu)$$2.deserialize($$9, gqu.class);
         }

         hku.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hku.a.a(aza.i($$3, "gui_light"));
         }

         ale $$11 = $$5.isEmpty() ? null : ale.a($$5);
         return new gqp($$11, $$4, $$6, $$7, $$10, $$8);
      }

      private gqw.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = aza.u($$0, "textures");
            return gqw.a($$1, hhy.d);
         } else {
            return gqw.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return aza.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? aza.k($$0, "ambientocclusion") : null;
      }

      protected List<gql> a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return List.of();
         } else {
            List<gql> $$2 = new ArrayList<>();

            for (JsonElement $$3 : aza.v($$1, "elements")) {
               $$2.add((gql)$$0.deserialize($$3, gql.class));
            }

            return $$2;
         }
      }
   }
}
