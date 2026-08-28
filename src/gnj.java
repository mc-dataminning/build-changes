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

public class gnj implements hhg {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gnj.class, new gnj.a())
      .registerTypeAdapter(gnf.class, new gnf.a())
      .registerTypeAdapter(gng.class, new gng.a())
      .registerTypeAdapter(gni.class, new gni.a())
      .registerTypeAdapter(gnn.class, new gnn.a())
      .registerTypeAdapter(gno.class, new gno.a())
      .create();
   private final List<gnf> b;
   @Nullable
   private final hhg.a e;
   @Nullable
   private final Boolean f;
   @Nullable
   private final gno g;
   @VisibleForTesting
   private final gnq.a h;
   @Nullable
   private hhg i;
   @Nullable
   private final aku j;

   public static gnj a(Reader $$0) {
      return ayp.a(a, $$0, gnj.class);
   }

   public gnj(@Nullable aku $$0, List<gnf> $$1, gnq.a $$2, @Nullable Boolean $$3, @Nullable hhg.a $$4, @Nullable gno $$5) {
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
   public hhg.a b() {
      return this.e;
   }

   @Override
   public void a(hhd.a $$0) {
      if (this.j != null) {
         this.i = $$0.a(this.j);
      }
   }

   @Nullable
   @Override
   public hhg c() {
      return this.i;
   }

   @Override
   public gnq.a d() {
      return this.h;
   }

   @Nullable
   @Override
   public gno e() {
      return this.g;
   }

   @Override
   public hgl a(gnq $$0, hgu $$1, hhb $$2, boolean $$3, boolean $$4, gno $$5) {
      return this.b.isEmpty() && this.i != null ? this.i.a($$0, $$1, $$2, $$3, $$4, $$5) : hhe.a(this.b, $$0, $$1.a(), $$2, $$3, $$4, true, $$5);
   }

   @Nullable
   @VisibleForTesting
   List<gnf> f() {
      return this.b;
   }

   @Nullable
   @VisibleForTesting
   aku g() {
      return this.j;
   }

   public static class a implements JsonDeserializer<gnj> {
      public gnj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gnf> $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gnq.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gno $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = ayp.u($$3, "display");
            $$8 = (gno)$$2.deserialize($$9, gno.class);
         }

         hhg.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = hhg.a.a(ayp.i($$3, "gui_light"));
         }

         aku $$11 = $$5.isEmpty() ? null : aku.a($$5);
         return new gnj($$11, $$4, $$6, $$7, $$10, $$8);
      }

      private gnq.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = ayp.u($$0, "textures");
            return gnq.a($$1, hei.d);
         } else {
            return gnq.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return ayp.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayp.k($$0, "ambientocclusion") : null;
      }

      protected List<gnf> a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return List.of();
         } else {
            List<gnf> $$2 = new ArrayList<>();

            for (JsonElement $$3 : ayp.v($$1, "elements")) {
               $$2.add((gnf)$$0.deserialize($$3, gnf.class));
            }

            return $$2;
         }
      }
   }
}
