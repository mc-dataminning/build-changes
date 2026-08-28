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

public class gms implements heb {
   private static final Logger h = LogUtils.getLogger();
   private static final gmu i = new gmu();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gms.class, new gms.a())
      .registerTypeAdapter(gmo.class, new gmo.a())
      .registerTypeAdapter(gmp.class, new gmp.a())
      .registerTypeAdapter(gmr.class, new gmr.a())
      .registerTypeAdapter(gmx.class, new gmx.a())
      .registerTypeAdapter(gmy.class, new gmy.a())
      .registerTypeAdapter(gmw.class, new gmw.a())
      .create();
   private static final char j = '#';
   public static final String b = "particle";
   private static final boolean k = true;
   public static final hdp c = new hdp(hbf.d, haw.b());
   private final List<gmo> l;
   @Nullable
   private final gms.b m;
   @Nullable
   private final Boolean n;
   private final gmy o;
   private final List<gmw> p;
   public String d = "";
   @VisibleForTesting
   protected final Map<String, Either<hdp, String>> e;
   @Nullable
   protected gms f;
   @Nullable
   protected alp g;

   public static gms a(Reader $$0) {
      return azk.a(a, $$0, gms.class);
   }

   public gms(@Nullable alp $$0, List<gmo> $$1, Map<String, Either<hdp, String>> $$2, @Nullable Boolean $$3, @Nullable gms.b $$4, gmy $$5, List<gmw> $$6) {
      this.l = $$1;
      this.n = $$3;
      this.m = $$4;
      this.e = $$2;
      this.g = $$0;
      this.o = $$5;
      this.p = $$6;
   }

   public List<gmo> a() {
      return this.l.isEmpty() && this.f != null ? this.f.a() : this.l;
   }

   public boolean b() {
      if (this.n != null) {
         return this.n;
      } else {
         return this.f != null ? this.f.b() : true;
      }
   }

   public gms.b c() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.f != null ? this.f.c() : gms.b.b;
      }
   }

   public boolean d() {
      return this.g == null || this.f != null && this.f.d();
   }

   public List<gmw> e() {
      return this.p;
   }

   @Override
   public void a(heb.a $$0) {
      if (this.g != null) {
         if (!($$0.a(this.g) instanceof gms $$2)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         this.f = $$2;
      }
   }

   @Override
   public hdi a(hdr $$0, Function<hdp, hbg> $$1, hdx $$2) {
      return this.a($$1, $$2, true);
   }

   public hdi a(Function<hdp, hbg> $$0, hdx $$1, boolean $$2) {
      hbg $$3 = $$0.apply(this.b("particle"));
      if (this.f() == hea.d) {
         return new hdl(this.g(), $$3, this.c().a());
      } else {
         hdz.a $$4 = new hdz.a(this, $$2).a($$3);

         for (gmo $$5 : this.a()) {
            for (jm $$6 : $$5.c.keySet()) {
               gmp $$7 = $$5.c.get($$6);
               hbg $$8 = $$0.apply(this.b($$7.c()));
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

   private static gmn a(gmo $$0, gmp $$1, hbg $$2, jm $$3, hdx $$4) {
      return i.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   public boolean a(String $$0) {
      return !haw.b().equals(this.b($$0).b());
   }

   public hdp b(String $$0) {
      if (d($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<hdp, String> $$2 = this.c($$0);
         Optional<hdp> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            h.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.d});
            return c;
         }

         $$1.add($$0);
      }
   }

   private Either<hdp, String> c(String $$0) {
      for (gms $$1 = this; $$1 != null; $$1 = $$1.f) {
         Either<hdp, String> $$2 = $$1.e.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(c);
   }

   static boolean d(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gms f() {
      return this.f == null ? this : this.f.f();
   }

   public gmy g() {
      gmx $$0 = this.a(cxe.b);
      gmx $$1 = this.a(cxe.c);
      gmx $$2 = this.a(cxe.d);
      gmx $$3 = this.a(cxe.e);
      gmx $$4 = this.a(cxe.f);
      gmx $$5 = this.a(cxe.g);
      gmx $$6 = this.a(cxe.h);
      gmx $$7 = this.a(cxe.i);
      return new gmy($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gmx a(cxe $$0) {
      return this.f != null && !this.o.b($$0) ? this.f.a($$0) : this.o.a($$0);
   }

   @Override
   public String toString() {
      return this.d;
   }

   public static class a implements JsonDeserializer<gms> {
      public gms a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gmo> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<hdp, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gmy $$8 = gmy.a;
         if ($$3.has("display")) {
            JsonObject $$9 = azk.u($$3, "display");
            $$8 = (gmy)$$2.deserialize($$9, gmy.class);
         }

         List<gmw> $$10 = this.a($$2, $$3);
         gms.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gms.b.a(azk.i($$3, "gui_light"));
         }

         alp $$12 = $$5.isEmpty() ? null : alp.a($$5);
         return new gms($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gmw> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gmw> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : azk.v($$1, "overrides")) {
               $$2.add((gmw)$$0.deserialize($$4, gmw.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<hdp, String>> b(JsonObject $$0) {
         alp $$1 = hbf.d;
         Map<String, Either<hdp, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = azk.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<hdp, String> a(alp $$0, String $$1) {
         if (gms.d($$1)) {
            return Either.right($$1.substring(1));
         } else {
            alp $$2 = alp.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new hdp($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return azk.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? azk.k($$0, "ambientocclusion") : null;
      }

      protected List<gmo> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gmo> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : azk.v($$1, "elements")) {
               $$2.add((gmo)$$0.deserialize($$3, gmo.class));
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

      public static gms.b a(String $$0) {
         for (gms.b $$1 : values()) {
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
