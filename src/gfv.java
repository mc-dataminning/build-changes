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

public class gfv implements gsr {
   private static final Logger g = LogUtils.getLogger();
   private static final gfx h = new gfx();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gfv.class, new gfv.a())
      .registerTypeAdapter(gfr.class, new gfr.a())
      .registerTypeAdapter(gfs.class, new gfs.a())
      .registerTypeAdapter(gfu.class, new gfu.a())
      .registerTypeAdapter(ggb.class, new ggb.a())
      .registerTypeAdapter(ggc.class, new ggc.a())
      .registerTypeAdapter(gfz.class, new gfz.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gfr> k;
   @Nullable
   private final gfv.b l;
   @Nullable
   private final Boolean m;
   private final ggc n;
   private final List<gfz> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gsj, String>> d;
   @Nullable
   protected gfv e;
   @Nullable
   protected akq f;

   public static gfv a(Reader $$0) {
      return ayd.a(a, $$0, gfv.class);
   }

   public static gfv a(String $$0) {
      return a(new StringReader($$0));
   }

   public gfv(@Nullable akq $$0, List<gfr> $$1, Map<String, Either<gsj, String>> $$2, @Nullable Boolean $$3, @Nullable gfv.b $$4, ggc $$5, List<gfz> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gfr> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gfv.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gfv.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gfz> e() {
      return this.o;
   }

   private gga a(gsk $$0, gfv $$1) {
      return this.o.isEmpty() ? gga.a : new gga($$0, $$1, this.o);
   }

   @Override
   public Collection<akq> f() {
      Set<akq> $$0 = Sets.newHashSet();

      for (gfz $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<akq, gsr> $$0) {
      Set<gsr> $$1 = Sets.newLinkedHashSet();

      for (gfv $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gsr $$3 = $$0.apply($$2.f);
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
            $$2.f = gsl.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof gfv)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (gfv)$$3;
      }

      this.o.forEach($$1x -> {
         gsr $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gsg a(gsk $$0, Function<gsj, gqf> $$1, gso $$2, akq $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gsg a(gsk $$0, gfv $$1, Function<gsj, gqf> $$2, gso $$3, akq $$4, boolean $$5) {
      gqf $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gsl.s) {
         return new gsi(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gsq.a $$7 = new gsq.a(this, this.a($$0, $$1), $$5).a($$6);

         for (gfr $$8 : this.a()) {
            for (ji $$9 : $$8.c.keySet()) {
               gfs $$10 = $$8.c.get($$9);
               gqf $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(ji.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static gfq a(gfr $$0, gfs $$1, gqf $$2, ji $$3, gso $$4, akq $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gpv.b().equals(this.c($$0).b());
   }

   public gsj c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gsj, String> $$2 = this.d($$0);
         Optional<gsj> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gsj(gqe.e, gpv.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gsj, String> d(String $$0) {
      for (gfv $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gsj, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gsj(gqe.e, gpv.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gfv g() {
      return this.e == null ? this : this.e.g();
   }

   public ggc h() {
      ggb $$0 = this.a(cul.b);
      ggb $$1 = this.a(cul.c);
      ggb $$2 = this.a(cul.d);
      ggb $$3 = this.a(cul.e);
      ggb $$4 = this.a(cul.f);
      ggb $$5 = this.a(cul.g);
      ggb $$6 = this.a(cul.h);
      ggb $$7 = this.a(cul.i);
      return new ggc($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private ggb a(cul $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gfv> {
      public gfv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gfr> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gsj, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         ggc $$8 = ggc.a;
         if ($$3.has("display")) {
            JsonObject $$9 = ayd.u($$3, "display");
            $$8 = (ggc)$$2.deserialize($$9, ggc.class);
         }

         List<gfz> $$10 = this.a($$2, $$3);
         gfv.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gfv.b.a(ayd.i($$3, "gui_light"));
         }

         akq $$12 = $$5.isEmpty() ? null : akq.a($$5);
         return new gfv($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gfz> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gfz> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : ayd.v($$1, "overrides")) {
               $$2.add((gfz)$$0.deserialize($$4, gfz.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gsj, String>> b(JsonObject $$0) {
         akq $$1 = gqe.e;
         Map<String, Either<gsj, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = ayd.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gsj, String> a(akq $$0, String $$1) {
         if (gfv.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            akq $$2 = akq.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gsj($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return ayd.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayd.k($$0, "ambientocclusion") : null;
      }

      protected List<gfr> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gfr> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : ayd.v($$1, "elements")) {
               $$2.add((gfr)$$0.deserialize($$3, gfr.class));
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

      public static gfv.b a(String $$0) {
         for (gfv.b $$1 : values()) {
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
