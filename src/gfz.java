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

public class gfz implements gsw {
   private static final Logger g = LogUtils.getLogger();
   private static final ggb h = new ggb();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gfz.class, new gfz.a())
      .registerTypeAdapter(gfv.class, new gfv.a())
      .registerTypeAdapter(gfw.class, new gfw.a())
      .registerTypeAdapter(gfy.class, new gfy.a())
      .registerTypeAdapter(ggf.class, new ggf.a())
      .registerTypeAdapter(ggg.class, new ggg.a())
      .registerTypeAdapter(ggd.class, new ggd.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gfv> k;
   @Nullable
   private final gfz.b l;
   @Nullable
   private final Boolean m;
   private final ggg n;
   private final List<ggd> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gso, String>> d;
   @Nullable
   protected gfz e;
   @Nullable
   protected akr f;

   public static gfz a(Reader $$0) {
      return aye.a(a, $$0, gfz.class);
   }

   public static gfz a(String $$0) {
      return a(new StringReader($$0));
   }

   public gfz(@Nullable akr $$0, List<gfv> $$1, Map<String, Either<gso, String>> $$2, @Nullable Boolean $$3, @Nullable gfz.b $$4, ggg $$5, List<ggd> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gfv> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gfz.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gfz.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<ggd> e() {
      return this.o;
   }

   private gge a(gsp $$0, gfz $$1) {
      return this.o.isEmpty() ? gge.a : new gge($$0, $$1, this.o);
   }

   @Override
   public Collection<akr> f() {
      Set<akr> $$0 = Sets.newHashSet();

      for (ggd $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<akr, gsw> $$0) {
      Set<gsw> $$1 = Sets.newLinkedHashSet();

      for (gfz $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gsw $$3 = $$0.apply($$2.f);
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
            $$2.f = gsq.m;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof gfz)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (gfz)$$3;
      }

      this.o.forEach($$1x -> {
         gsw $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gsk a(gsp $$0, Function<gso, gqj> $$1, gst $$2) {
      return this.a($$0, this, $$1, $$2, true);
   }

   public gsk a(gsp $$0, gfz $$1, Function<gso, gqj> $$2, gst $$3, boolean $$4) {
      gqj $$5 = $$2.apply(this.c("particle"));
      if (this.g() == gsq.r) {
         return new gsn(this.h(), this.a($$0, $$1), $$5, this.c().a());
      } else {
         gsv.a $$6 = new gsv.a(this, this.a($$0, $$1), $$4).a($$5);

         for (gfv $$7 : this.a()) {
            for (ji $$8 : $$7.c.keySet()) {
               gfw $$9 = $$7.c.get($$8);
               gqj $$10 = $$2.apply(this.c($$9.c()));
               if ($$9.a() == null) {
                  $$6.a(a($$7, $$9, $$10, $$8, $$3));
               } else {
                  $$6.a(ji.a($$3.b().c(), $$9.a()), a($$7, $$9, $$10, $$8, $$3));
               }
            }
         }

         return $$6.b();
      }
   }

   private static gfu a(gfv $$0, gfw $$1, gqj $$2, ji $$3, gst $$4) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e);
   }

   public boolean b(String $$0) {
      return !gpz.b().equals(this.c($$0).b());
   }

   public gso c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gso, String> $$2 = this.d($$0);
         Optional<gso> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gso(gqi.e, gpz.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gso, String> d(String $$0) {
      for (gfz $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gso, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gso(gqi.e, gpz.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gfz g() {
      return this.e == null ? this : this.e.g();
   }

   public ggg h() {
      ggf $$0 = this.a(cun.b);
      ggf $$1 = this.a(cun.c);
      ggf $$2 = this.a(cun.d);
      ggf $$3 = this.a(cun.e);
      ggf $$4 = this.a(cun.f);
      ggf $$5 = this.a(cun.g);
      ggf $$6 = this.a(cun.h);
      ggf $$7 = this.a(cun.i);
      return new ggg($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private ggf a(cun $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gfz> {
      public gfz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gfv> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gso, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         ggg $$8 = ggg.a;
         if ($$3.has("display")) {
            JsonObject $$9 = aye.u($$3, "display");
            $$8 = (ggg)$$2.deserialize($$9, ggg.class);
         }

         List<ggd> $$10 = this.a($$2, $$3);
         gfz.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gfz.b.a(aye.i($$3, "gui_light"));
         }

         akr $$12 = $$5.isEmpty() ? null : akr.a($$5);
         return new gfz($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<ggd> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<ggd> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : aye.v($$1, "overrides")) {
               $$2.add((ggd)$$0.deserialize($$4, ggd.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gso, String>> b(JsonObject $$0) {
         akr $$1 = gqi.e;
         Map<String, Either<gso, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = aye.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gso, String> a(akr $$0, String $$1) {
         if (gfz.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            akr $$2 = akr.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gso($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return aye.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? aye.k($$0, "ambientocclusion") : null;
      }

      protected List<gfv> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gfv> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : aye.v($$1, "elements")) {
               $$2.add((gfv)$$0.deserialize($$3, gfv.class));
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

      public static gfz.b a(String $$0) {
         for (gfz.b $$1 : values()) {
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
