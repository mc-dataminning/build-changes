import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gjt implements hay {
   private static final Logger g = LogUtils.getLogger();
   private static final gjv h = new gjv();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gjt.class, new gjt.a())
      .registerTypeAdapter(gjp.class, new gjp.a())
      .registerTypeAdapter(gjq.class, new gjq.a())
      .registerTypeAdapter(gjs.class, new gjs.a())
      .registerTypeAdapter(gjy.class, new gjy.a())
      .registerTypeAdapter(gjz.class, new gjz.a())
      .registerTypeAdapter(gjx.class, new gjx.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gjp> k;
   @Nullable
   private final gjt.b l;
   @Nullable
   private final Boolean m;
   private final gjz n;
   private final List<gjx> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<ham, String>> d;
   @Nullable
   protected gjt e;
   @Nullable
   protected ali f;

   public static gjt a(Reader $$0) {
      return aza.a(a, $$0, gjt.class);
   }

   public gjt(@Nullable ali $$0, List<gjp> $$1, Map<String, Either<ham, String>> $$2, @Nullable Boolean $$3, @Nullable gjt.b $$4, gjz $$5, List<gjx> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gjp> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gjt.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gjt.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gjx> e() {
      return this.o;
   }

   @Override
   public void a(hay.a $$0) {
      if (this.f != null) {
         if (!($$0.a(this.f) instanceof gjt $$2)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         this.e = $$2;
      }
   }

   @Override
   public haf a(hao $$0, Function<ham, gyd> $$1, hau $$2) {
      return this.a($$1, $$2, true);
   }

   public haf a(Function<ham, gyd> $$0, hau $$1, boolean $$2) {
      gyd $$3 = $$0.apply(this.b("particle"));
      if (this.f() == hax.d) {
         return new hai(this.g(), $$3, this.c().a());
      } else {
         haw.a $$4 = new haw.a(this, $$2).a($$3);

         for (gjp $$5 : this.a()) {
            for (jm $$6 : $$5.c.keySet()) {
               gjq $$7 = $$5.c.get($$6);
               gyd $$8 = $$0.apply(this.b($$7.c()));
               if ($$7.a() == null) {
                  $$4.a(a($$5, $$7, $$8, $$6, $$1));
               } else {
                  $$4.a(jm.a($$1.b().c(), $$7.a()), a($$5, $$7, $$8, $$6, $$1));
               }
            }
         }

         return $$4.b();
      }
   }

   private static gjo a(gjp $$0, gjq $$1, gyd $$2, jm $$3, hau $$4) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   public boolean a(String $$0) {
      return !gxt.b().equals(this.b($$0).b());
   }

   public ham b(String $$0) {
      if (d($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<ham, String> $$2 = this.c($$0);
         Optional<ham> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new ham(gyc.d, gxt.b());
         }

         $$1.add($$0);
      }
   }

   private Either<ham, String> c(String $$0) {
      for (gjt $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<ham, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new ham(gyc.d, gxt.b()));
   }

   static boolean d(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gjt f() {
      return this.e == null ? this : this.e.f();
   }

   public gjz g() {
      gjy $$0 = this.a(cvz.b);
      gjy $$1 = this.a(cvz.c);
      gjy $$2 = this.a(cvz.d);
      gjy $$3 = this.a(cvz.e);
      gjy $$4 = this.a(cvz.f);
      gjy $$5 = this.a(cvz.g);
      gjy $$6 = this.a(cvz.h);
      gjy $$7 = this.a(cvz.i);
      return new gjz($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gjy a(cvz $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gjt> {
      public gjt a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gjp> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<ham, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gjz $$8 = gjz.a;
         if ($$3.has("display")) {
            JsonObject $$9 = aza.u($$3, "display");
            $$8 = (gjz)$$2.deserialize($$9, gjz.class);
         }

         List<gjx> $$10 = this.a($$2, $$3);
         gjt.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gjt.b.a(aza.i($$3, "gui_light"));
         }

         ali $$12 = $$5.isEmpty() ? null : ali.a($$5);
         return new gjt($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gjx> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gjx> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : aza.v($$1, "overrides")) {
               $$2.add((gjx)$$0.deserialize($$4, gjx.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<ham, String>> b(JsonObject $$0) {
         ali $$1 = gyc.d;
         Map<String, Either<ham, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = aza.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<ham, String> a(ali $$0, String $$1) {
         if (gjt.d($$1)) {
            return Either.right($$1.substring(1));
         } else {
            ali $$2 = ali.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new ham($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return aza.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? aza.k($$0, "ambientocclusion") : null;
      }

      protected List<gjp> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gjp> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : aza.v($$1, "elements")) {
               $$2.add((gjp)$$0.deserialize($$3, gjp.class));
            }
         }

         return $$2;
      }
   }

   public static enum b {
      a("front"),
      b("side");

      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public static gjt.b a(String $$0) {
         for (gjt.b $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid gui light: " + $$0);
      }

      public boolean a() {
         return this == b;
      }
   }
}
