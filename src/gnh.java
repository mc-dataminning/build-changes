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

public class gnh implements hhh {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gnh.class, new gnh.a())
      .registerTypeAdapter(gnd.class, new gnd.a())
      .registerTypeAdapter(gne.class, new gne.a())
      .registerTypeAdapter(gng.class, new gng.a())
      .registerTypeAdapter(gnl.class, new gnl.a())
      .registerTypeAdapter(gnm.class, new gnm.a())
      .create();
   private final List<gnd> b;
   @Nullable
   private final hhh.a e;
   @Nullable
   private final Boolean f;
   @Nullable
   private final gnm g;
   @VisibleForTesting
   private final gno.a h;
   @Nullable
   private hhh i;
   @Nullable
   private final aku j;

   public static gnh a(Reader $$0) {
      return ayo.a(a, $$0, gnh.class);
   }

   public gnh(@Nullable aku $$0, List<gnd> $$1, gno.a $$2, @Nullable Boolean $$3, @Nullable hhh.a $$4, @Nullable gnm $$5) {
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
   public hhh.a b() {
      return this.e;
   }

   @Override
   public void a(hhe.a $$0) {
      if (this.j != null) {
         this.i = $$0.a(this.j);
      }
   }

   @Nullable
   @Override
   public hhh c() {
      return this.i;
   }

   @Override
   public gno.a d() {
      return this.h;
   }

   @Nullable
   @Override
   public gnm e() {
      return this.g;
   }

   @Override
   public hgm a(gno $$0, hgv $$1, hhc $$2, boolean $$3, boolean $$4, gnm $$5) {
      return this.b.isEmpty() && this.i != null ? this.i.a($$0, $$1, $$2, $$3, $$4, $$5) : hhf.a(this.b, $$0, $$1.a(), $$2, $$3, $$4, true, $$5);
   }

   @Nullable
   @VisibleForTesting
   List<gnd> f() {
      return this.b;
   }

   @Nullable
   @VisibleForTesting
   aku g() {
      return this.j;
   }

   public static class a implements JsonDeserializer<gnh> {
      public gnh a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gnd> $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gno.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gnm $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = ayo.u($$3, "display");
            $$8 = (gnm)$$2.deserialize($$9, gnm.class);
         }

         hhh.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hhh.a.a(ayo.i($$3, "gui_light"));
         }

         aku $$11 = $$5.isEmpty() ? null : aku.a($$5);
         return new gnh($$11, $$4, $$6, $$7, $$10, $$8);
      }

      private gno.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = ayo.u($$0, "textures");
            return gno.a($$1, hel.d);
         } else {
            return gno.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return ayo.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayo.k($$0, "ambientocclusion") : null;
      }

      protected List<gnd> a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return List.of();
         } else {
            List<gnd> $$2 = new ArrayList<>();

            for (JsonElement $$3 : ayo.v($$1, "elements")) {
               $$2.add((gnd)$$0.deserialize($$3, gnd.class));
            }

            return $$2;
         }
      }
   }
}
