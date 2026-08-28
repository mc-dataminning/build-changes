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

public class grm implements hls {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(grm.class, new grm.a())
      .registerTypeAdapter(gri.class, new gri.a())
      .registerTypeAdapter(grj.class, new grj.a())
      .registerTypeAdapter(grl.class, new grl.a())
      .registerTypeAdapter(grq.class, new grq.a())
      .registerTypeAdapter(grr.class, new grr.a())
      .create();
   private final List<gri> b;
   @Nullable
   private final hls.a e;
   @Nullable
   private final Boolean f;
   @Nullable
   private final grr g;
   @VisibleForTesting
   private final grt.a h;
   @Nullable
   private hls i;
   @Nullable
   private final alg j;

   public static grm a(Reader $$0) {
      return azc.a(a, $$0, grm.class);
   }

   public grm(@Nullable alg $$0, List<gri> $$1, grt.a $$2, @Nullable Boolean $$3, @Nullable hls.a $$4, @Nullable grr $$5) {
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
   public hls.a b() {
      return this.e;
   }

   @Override
   public void a(hlp.a $$0) {
      if (this.j != null) {
         this.i = $$0.a(this.j);
      }
   }

   @Nullable
   @Override
   public hls c() {
      return this.i;
   }

   @Override
   public grt.a d() {
      return this.h;
   }

   @Nullable
   @Override
   public grr e() {
      return this.g;
   }

   @Override
   public hkx a(grt $$0, hlg $$1, hln $$2, boolean $$3, boolean $$4, grr $$5) {
      return this.b.isEmpty() && this.i != null ? this.i.a($$0, $$1, $$2, $$3, $$4, $$5) : hlq.a(this.b, $$0, $$1.a(), $$2, $$3, $$4, true, $$5);
   }

   @Nullable
   @VisibleForTesting
   List<gri> f() {
      return this.b;
   }

   @Nullable
   @VisibleForTesting
   alg g() {
      return this.j;
   }

   public static class a implements JsonDeserializer<grm> {
      public grm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gri> $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         grt.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         grr $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = azc.u($$3, "display");
            $$8 = (grr)$$2.deserialize($$9, grr.class);
         }

         hls.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hls.a.a(azc.i($$3, "gui_light"));
         }

         alg $$11 = $$5.isEmpty() ? null : alg.a($$5);
         return new grm($$11, $$4, $$6, $$7, $$10, $$8);
      }

      private grt.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = azc.u($$0, "textures");
            return grt.a($$1, hiw.d);
         } else {
            return grt.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return azc.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? azc.k($$0, "ambientocclusion") : null;
      }

      protected List<gri> a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return List.of();
         } else {
            List<gri> $$2 = new ArrayList<>();

            for (JsonElement $$3 : azc.v($$1, "elements")) {
               $$2.add((gri)$$0.deserialize($$3, gri.class));
            }

            return $$2;
         }
      }
   }
}
