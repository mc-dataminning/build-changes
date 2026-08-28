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

public class gmv implements hee {
   private static final Logger h = LogUtils.getLogger();
   private static final gmx i = new gmx();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gmv.class, new gmv.a())
      .registerTypeAdapter(gmr.class, new gmr.a())
      .registerTypeAdapter(gms.class, new gms.a())
      .registerTypeAdapter(gmu.class, new gmu.a())
      .registerTypeAdapter(gna.class, new gna.a())
      .registerTypeAdapter(gnb.class, new gnb.a())
      .registerTypeAdapter(gmz.class, new gmz.a())
      .create();
   private static final char j = '#';
   public static final String b = "particle";
   private static final boolean k = true;
   public static final hds c = new hds(hbi.d, haz.b());
   private final List<gmr> l;
   @Nullable
   private final gmv.b m;
   @Nullable
   private final Boolean n;
   private final gnb o;
   private final List<gmz> p;
   public String d = "";
   @VisibleForTesting
   protected final Map<String, Either<hds, String>> e;
   @Nullable
   protected gmv f;
   @Nullable
   protected alz g;

   public static gmv a(Reader $$0) {
      return azu.a(a, $$0, gmv.class);
   }

   public gmv(@Nullable alz $$0, List<gmr> $$1, Map<String, Either<hds, String>> $$2, @Nullable Boolean $$3, @Nullable gmv.b $$4, gnb $$5, List<gmz> $$6) {
      this.l = $$1;
      this.n = $$3;
      this.m = $$4;
      this.e = $$2;
      this.g = $$0;
      this.o = $$5;
      this.p = $$6;
   }

   public List<gmr> a() {
      return this.l.isEmpty() && this.f != null ? this.f.a() : this.l;
   }

   public boolean b() {
      if (this.n != null) {
         return this.n;
      } else {
         return this.f != null ? this.f.b() : true;
      }
   }

   public gmv.b c() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.f != null ? this.f.c() : gmv.b.b;
      }
   }

   public boolean d() {
      return this.g == null || this.f != null && this.f.d();
   }

   public List<gmz> e() {
      return this.p;
   }

   @Override
   public void a(hee.a $$0) {
      if (this.g != null) {
         if (!($$0.a(this.g) instanceof gmv $$2)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         this.f = $$2;
      }
   }

   @Override
   public hdl a(hdu $$0, Function<hds, hbj> $$1, hea $$2) {
      return this.a($$1, $$2, true);
   }

   public hdl a(Function<hds, hbj> $$0, hea $$1, boolean $$2) {
      hbj $$3 = $$0.apply(this.b("particle"));
      if (this.f() == hed.d) {
         return new hdo(this.g(), $$3, this.c().a());
      } else {
         hec.a $$4 = new hec.a(this, $$2).a($$3);

         for (gmr $$5 : this.a()) {
            for (jm $$6 : $$5.c.keySet()) {
               gms $$7 = $$5.c.get($$6);
               hbj $$8 = $$0.apply(this.b($$7.c()));
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

   private static gmq a(gmr $$0, gms $$1, hbj $$2, jm $$3, hea $$4) {
      return i.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   public boolean a(String $$0) {
      return !haz.b().equals(this.b($$0).b());
   }

   public hds b(String $$0) {
      if (d($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<hds, String> $$2 = this.c($$0);
         Optional<hds> $$3 = $$2.left();
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

   private Either<hds, String> c(String $$0) {
      for (gmv $$1 = this; $$1 != null; $$1 = $$1.f) {
         Either<hds, String> $$2 = $$1.e.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(c);
   }

   static boolean d(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gmv f() {
      return this.f == null ? this : this.f.f();
   }

   public gnb g() {
      gna $$0 = this.a(cxm.b);
      gna $$1 = this.a(cxm.c);
      gna $$2 = this.a(cxm.d);
      gna $$3 = this.a(cxm.e);
      gna $$4 = this.a(cxm.f);
      gna $$5 = this.a(cxm.g);
      gna $$6 = this.a(cxm.h);
      gna $$7 = this.a(cxm.i);
      return new gnb($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gna a(cxm $$0) {
      return this.f != null && !this.o.b($$0) ? this.f.a($$0) : this.o.a($$0);
   }

   @Override
   public String toString() {
      return this.d;
   }

   public static class a implements JsonDeserializer<gmv> {
      public gmv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gmr> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<hds, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gnb $$8 = gnb.a;
         if ($$3.has("display")) {
            JsonObject $$9 = azu.u($$3, "display");
            $$8 = (gnb)$$2.deserialize($$9, gnb.class);
         }

         List<gmz> $$10 = this.a($$2, $$3);
         gmv.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gmv.b.a(azu.i($$3, "gui_light"));
         }

         alz $$12 = $$5.isEmpty() ? null : alz.a($$5);
         return new gmv($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gmz> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gmz> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : azu.v($$1, "overrides")) {
               $$2.add((gmz)$$0.deserialize($$4, gmz.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<hds, String>> b(JsonObject $$0) {
         alz $$1 = hbi.d;
         Map<String, Either<hds, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = azu.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<hds, String> a(alz $$0, String $$1) {
         if (gmv.d($$1)) {
            return Either.right($$1.substring(1));
         } else {
            alz $$2 = alz.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new hds($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return azu.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? azu.k($$0, "ambientocclusion") : null;
      }

      protected List<gmr> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gmr> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : azu.v($$1, "elements")) {
               $$2.add((gmr)$$0.deserialize($$3, gmr.class));
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

      public static gmv.b a(String $$0) {
         for (gmv.b $$1 : values()) {
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
