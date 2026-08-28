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

public class goj implements him {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(goj.class, new goj.a())
      .registerTypeAdapter(gof.class, new gof.a())
      .registerTypeAdapter(gog.class, new gog.a())
      .registerTypeAdapter(goi.class, new goi.a())
      .registerTypeAdapter(gon.class, new gon.a())
      .registerTypeAdapter(goo.class, new goo.a())
      .create();
   private final List<gof> b;
   @Nullable
   private final him.a e;
   @Nullable
   private final Boolean f;
   @Nullable
   private final goo g;
   @VisibleForTesting
   private final goq.a h;
   @Nullable
   private him i;
   @Nullable
   private final aku j;

   public static goj a(Reader $$0) {
      return ayp.a(a, $$0, goj.class);
   }

   public goj(@Nullable aku $$0, List<gof> $$1, goq.a $$2, @Nullable Boolean $$3, @Nullable him.a $$4, @Nullable goo $$5) {
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
   public him.a b() {
      return this.e;
   }

   @Override
   public void a(hij.a $$0) {
      if (this.j != null) {
         this.i = $$0.a(this.j);
      }
   }

   @Nullable
   @Override
   public him c() {
      return this.i;
   }

   @Override
   public goq.a d() {
      return this.h;
   }

   @Nullable
   @Override
   public goo e() {
      return this.g;
   }

   @Override
   public hhr a(goq $$0, hia $$1, hih $$2, boolean $$3, boolean $$4, goo $$5) {
      return this.b.isEmpty() && this.i != null ? this.i.a($$0, $$1, $$2, $$3, $$4, $$5) : hik.a(this.b, $$0, $$1.a(), $$2, $$3, $$4, true, $$5);
   }

   @Nullable
   @VisibleForTesting
   List<gof> f() {
      return this.b;
   }

   @Nullable
   @VisibleForTesting
   aku g() {
      return this.j;
   }

   public static class a implements JsonDeserializer<goj> {
      public goj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gof> $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         goq.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         goo $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = ayp.u($$3, "display");
            $$8 = (goo)$$2.deserialize($$9, goo.class);
         }

         him.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = him.a.a(ayp.i($$3, "gui_light"));
         }

         aku $$11 = $$5.isEmpty() ? null : aku.a($$5);
         return new goj($$11, $$4, $$6, $$7, $$10, $$8);
      }

      private goq.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = ayp.u($$0, "textures");
            return goq.a($$1, hfq.d);
         } else {
            return goq.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return ayp.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayp.k($$0, "ambientocclusion") : null;
      }

      protected List<gof> a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return List.of();
         } else {
            List<gof> $$2 = new ArrayList<>();

            for (JsonElement $$3 : ayp.v($$1, "elements")) {
               $$2.add((gof)$$0.deserialize($$3, gof.class));
            }

            return $$2;
         }
      }
   }
}
