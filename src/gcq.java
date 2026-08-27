import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
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
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcq implements gpk {
   private static final Logger g = LogUtils.getLogger();
   private static final gcs h = new gcs();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gcq.class, new gcq.a())
      .registerTypeAdapter(gcm.class, new gcm.a())
      .registerTypeAdapter(gcn.class, new gcn.a())
      .registerTypeAdapter(gcp.class, new gcp.a())
      .registerTypeAdapter(gcw.class, new gcw.a())
      .registerTypeAdapter(gcx.class, new gcx.a())
      .registerTypeAdapter(gcu.class, new gcu.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gcm> k;
   @Nullable
   private final gcq.b l;
   @Nullable
   private final Boolean m;
   private final gcx n;
   private final List<gcu> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gpc, String>> d;
   @Nullable
   protected gcq e;
   @Nullable
   protected akh f;

   public static gcq a(Reader $$0) {
      return axp.a(a, $$0, gcq.class);
   }

   public static gcq a(String $$0) {
      return a(new StringReader($$0));
   }

   public gcq(@Nullable akh $$0, List<gcm> $$1, Map<String, Either<gpc, String>> $$2, @Nullable Boolean $$3, @Nullable gcq.b $$4, gcx $$5, List<gcu> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gcm> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gcq.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gcq.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gcu> e() {
      return this.o;
   }

   private gcv a(gpd $$0, gcq $$1) {
      return this.o.isEmpty() ? gcv.a : new gcv($$0, $$1, this.o);
   }

   @Override
   public Collection<akh> f() {
      Set<akh> $$0 = Sets.newHashSet();

      for (gcu $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<akh, gpk> $$0) {
      Set<gpk> $$1 = Sets.newLinkedHashSet();

      for (gcq $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gpk $$3 = $$0.apply($$2.f);
         if ($$3 == null) {
            g.warn("No parent '{}' while loading model '{}'", this.f, $$2);
         }

         if ($$1.contains($$3)) {
            g.warn(
               "Found 'parent' loop while loading model '{}' in chain: {} -> {}",
               new Object[]{$$2, $$1.stream().map(Object::toString).collect(Collectors.joining(" -> ")), this.f}
            );
            $$3 = null;
         }

         if ($$3 == null) {
            $$2.f = gpe.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof gcq)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (gcq)$$3;
      }

      this.o.forEach($$1x -> {
         gpk $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public goz a(gpd $$0, Function<gpc, gmy> $$1, gph $$2, akh $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public goz a(gpd $$0, gcq $$1, Function<gpc, gmy> $$2, gph $$3, akh $$4, boolean $$5) {
      gmy $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gpe.s) {
         return new gpb(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gpj.a $$7 = new gpj.a(this, this.a($$0, $$1), $$5).a($$6);

         for (gcm $$8 : this.a()) {
            for (is $$9 : $$8.c.keySet()) {
               gcn $$10 = $$8.c.get($$9);
               gmy $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(is.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static gcl a(gcm $$0, gcn $$1, gmy $$2, is $$3, gph $$4, akh $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gmo.b().equals(this.c($$0).b());
   }

   public gpc c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gpc, String> $$2 = this.d($$0);
         Optional<gpc> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gpc(gmx.e, gmo.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gpc, String> d(String $$0) {
      for (gcq $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gpc, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gpc(gmx.e, gmo.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gcq g() {
      return this.e == null ? this : this.e.g();
   }

   public gcx h() {
      gcw $$0 = this.a(csw.b);
      gcw $$1 = this.a(csw.c);
      gcw $$2 = this.a(csw.d);
      gcw $$3 = this.a(csw.e);
      gcw $$4 = this.a(csw.f);
      gcw $$5 = this.a(csw.g);
      gcw $$6 = this.a(csw.h);
      gcw $$7 = this.a(csw.i);
      return new gcx($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gcw a(csw $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gcq> {
      public gcq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gcm> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gpc, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gcx $$8 = gcx.a;
         if ($$3.has("display")) {
            JsonObject $$9 = axp.u($$3, "display");
            $$8 = (gcx)$$2.deserialize($$9, gcx.class);
         }

         List<gcu> $$10 = this.a($$2, $$3);
         gcq.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gcq.b.a(axp.i($$3, "gui_light"));
         }

         akh $$12 = $$5.isEmpty() ? null : new akh($$5);
         return new gcq($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gcu> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gcu> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : axp.v($$1, "overrides")) {
               $$2.add((gcu)$$0.deserialize($$4, gcu.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gpc, String>> b(JsonObject $$0) {
         akh $$1 = gmx.e;
         Map<String, Either<gpc, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = axp.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gpc, String> a(akh $$0, String $$1) {
         if (gcq.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            akh $$2 = akh.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gpc($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return axp.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? axp.k($$0, "ambientocclusion") : null;
      }

      protected List<gcm> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gcm> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : axp.v($$1, "elements")) {
               $$2.add((gcm)$$0.deserialize($$3, gcm.class));
            }
         }

         return $$2;
      }
   }

   public static enum b {
      a("front"),
      b("side");

      private final String c;

      private b(String $$0) {
         this.c = $$0;
      }

      public static gcq.b a(String $$0) {
         for (gcq.b $$1 : values()) {
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

   public static class c extends RuntimeException {
      public c(String $$0) {
         super($$0);
      }
   }
}
