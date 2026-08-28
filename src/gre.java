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

public class gre implements hlk {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gre.class, new gre.a())
      .registerTypeAdapter(gra.class, new gra.a())
      .registerTypeAdapter(grb.class, new grb.a())
      .registerTypeAdapter(grd.class, new grd.a())
      .registerTypeAdapter(gri.class, new gri.a())
      .registerTypeAdapter(grj.class, new grj.a())
      .create();
   private final List<gra> b;
   @Nullable
   private final hlk.a e;
   @Nullable
   private final Boolean f;
   @Nullable
   private final grj g;
   @VisibleForTesting
   private final grl.a h;
   @Nullable
   private hlk i;
   @Nullable
   private final alg j;

   public static gre a(Reader $$0) {
      return azc.a(a, $$0, gre.class);
   }

   public gre(@Nullable alg $$0, List<gra> $$1, grl.a $$2, @Nullable Boolean $$3, @Nullable hlk.a $$4, @Nullable grj $$5) {
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
   public hlk.a b() {
      return this.e;
   }

   @Override
   public void a(hlh.a $$0) {
      if (this.j != null) {
         this.i = $$0.a(this.j);
      }
   }

   @Nullable
   @Override
   public hlk c() {
      return this.i;
   }

   @Override
   public grl.a d() {
      return this.h;
   }

   @Nullable
   @Override
   public grj e() {
      return this.g;
   }

   @Override
   public hkp a(grl $$0, hky $$1, hlf $$2, boolean $$3, boolean $$4, grj $$5) {
      return this.b.isEmpty() && this.i != null ? this.i.a($$0, $$1, $$2, $$3, $$4, $$5) : hli.a(this.b, $$0, $$1.a(), $$2, $$3, $$4, true, $$5);
   }

   @Nullable
   @VisibleForTesting
   List<gra> f() {
      return this.b;
   }

   @Nullable
   @VisibleForTesting
   alg g() {
      return this.j;
   }

   public static class a implements JsonDeserializer<gre> {
      public gre a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gra> $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         grl.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         grj $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = azc.u($$3, "display");
            $$8 = (grj)$$2.deserialize($$9, grj.class);
         }

         hlk.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hlk.a.a(azc.i($$3, "gui_light"));
         }

         alg $$11 = $$5.isEmpty() ? null : alg.a($$5);
         return new gre($$11, $$4, $$6, $$7, $$10, $$8);
      }

      private grl.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = azc.u($$0, "textures");
            return grl.a($$1, hio.d);
         } else {
            return grl.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return azc.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? azc.k($$0, "ambientocclusion") : null;
      }

      protected List<gra> a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return List.of();
         } else {
            List<gra> $$2 = new ArrayList<>();

            for (JsonElement $$3 : azc.v($$1, "elements")) {
               $$2.add((gra)$$0.deserialize($$3, gra.class));
            }

            return $$2;
         }
      }
   }
}
