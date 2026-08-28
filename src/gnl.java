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

public class gnl implements hho {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gnl.class, new gnl.a())
      .registerTypeAdapter(gnh.class, new gnh.a())
      .registerTypeAdapter(gni.class, new gni.a())
      .registerTypeAdapter(gnk.class, new gnk.a())
      .registerTypeAdapter(gnp.class, new gnp.a())
      .registerTypeAdapter(gnq.class, new gnq.a())
      .create();
   private final List<gnh> b;
   @Nullable
   private final hho.a e;
   @Nullable
   private final Boolean f;
   @Nullable
   private final gnq g;
   @VisibleForTesting
   private final gns.a h;
   @Nullable
   private hho i;
   @Nullable
   private final akv j;

   public static gnl a(Reader $$0) {
      return ayp.a(a, $$0, gnl.class);
   }

   public gnl(@Nullable akv $$0, List<gnh> $$1, gns.a $$2, @Nullable Boolean $$3, @Nullable hho.a $$4, @Nullable gnq $$5) {
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
   public hho.a b() {
      return this.e;
   }

   @Override
   public void a(hhl.a $$0) {
      if (this.j != null) {
         this.i = $$0.a(this.j);
      }
   }

   @Nullable
   @Override
   public hho c() {
      return this.i;
   }

   @Override
   public gns.a d() {
      return this.h;
   }

   @Nullable
   @Override
   public gnq e() {
      return this.g;
   }

   @Override
   public hgt a(gns $$0, hhc $$1, hhj $$2, boolean $$3, boolean $$4, gnq $$5) {
      return this.b.isEmpty() && this.i != null ? this.i.a($$0, $$1, $$2, $$3, $$4, $$5) : hhm.a(this.b, $$0, $$1.a(), $$2, $$3, $$4, true, $$5);
   }

   @Nullable
   @VisibleForTesting
   List<gnh> f() {
      return this.b;
   }

   @Nullable
   @VisibleForTesting
   akv g() {
      return this.j;
   }

   public static class a implements JsonDeserializer<gnl> {
      public gnl a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gnh> $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gns.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gnq $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = ayp.u($$3, "display");
            $$8 = (gnq)$$2.deserialize($$9, gnq.class);
         }

         hho.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hho.a.a(ayp.i($$3, "gui_light"));
         }

         akv $$11 = $$5.isEmpty() ? null : akv.a($$5);
         return new gnl($$11, $$4, $$6, $$7, $$10, $$8);
      }

      private gns.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = ayp.u($$0, "textures");
            return gns.a($$1, hes.d);
         } else {
            return gns.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return ayp.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayp.k($$0, "ambientocclusion") : null;
      }

      protected List<gnh> a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return List.of();
         } else {
            List<gnh> $$2 = new ArrayList<>();

            for (JsonElement $$3 : ayp.v($$1, "elements")) {
               $$2.add((gnh)$$0.deserialize($$3, gnh.class));
            }

            return $$2;
         }
      }
   }
}
