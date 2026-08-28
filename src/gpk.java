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

public class gpk implements hjn {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gpk.class, new gpk.a())
      .registerTypeAdapter(gpg.class, new gpg.a())
      .registerTypeAdapter(gph.class, new gph.a())
      .registerTypeAdapter(gpj.class, new gpj.a())
      .registerTypeAdapter(gpo.class, new gpo.a())
      .registerTypeAdapter(gpp.class, new gpp.a())
      .create();
   private final List<gpg> b;
   @Nullable
   private final hjn.a e;
   @Nullable
   private final Boolean f;
   @Nullable
   private final gpp g;
   @VisibleForTesting
   private final gpr.a h;
   @Nullable
   private hjn i;
   @Nullable
   private final ald j;

   public static gpk a(Reader $$0) {
      return aza.a(a, $$0, gpk.class);
   }

   public gpk(@Nullable ald $$0, List<gpg> $$1, gpr.a $$2, @Nullable Boolean $$3, @Nullable hjn.a $$4, @Nullable gpp $$5) {
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
   public hjn.a b() {
      return this.e;
   }

   @Override
   public void a(hjk.a $$0) {
      if (this.j != null) {
         this.i = $$0.a(this.j);
      }
   }

   @Nullable
   @Override
   public hjn c() {
      return this.i;
   }

   @Override
   public gpr.a d() {
      return this.h;
   }

   @Nullable
   @Override
   public gpp e() {
      return this.g;
   }

   @Override
   public his a(gpr $$0, hjb $$1, hji $$2, boolean $$3, boolean $$4, gpp $$5) {
      return this.b.isEmpty() && this.i != null ? this.i.a($$0, $$1, $$2, $$3, $$4, $$5) : hjl.a(this.b, $$0, $$1.a(), $$2, $$3, $$4, true, $$5);
   }

   @Nullable
   @VisibleForTesting
   List<gpg> f() {
      return this.b;
   }

   @Nullable
   @VisibleForTesting
   ald g() {
      return this.j;
   }

   public static class a implements JsonDeserializer<gpk> {
      public gpk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gpg> $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gpr.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gpp $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = aza.u($$3, "display");
            $$8 = (gpp)$$2.deserialize($$9, gpp.class);
         }

         hjn.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hjn.a.a(aza.i($$3, "gui_light"));
         }

         ald $$11 = $$5.isEmpty() ? null : ald.a($$5);
         return new gpk($$11, $$4, $$6, $$7, $$10, $$8);
      }

      private gpr.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = aza.u($$0, "textures");
            return gpr.a($$1, hgr.d);
         } else {
            return gpr.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return aza.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? aza.k($$0, "ambientocclusion") : null;
      }

      protected List<gpg> a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return List.of();
         } else {
            List<gpg> $$2 = new ArrayList<>();

            for (JsonElement $$3 : aza.v($$1, "elements")) {
               $$2.add((gpg)$$0.deserialize($$3, gpg.class));
            }

            return $$2;
         }
      }
   }
}
