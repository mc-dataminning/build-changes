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

public class ggb implements gsy {
   private static final Logger g = LogUtils.getLogger();
   private static final ggd h = new ggd();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(ggb.class, new ggb.a())
      .registerTypeAdapter(gfx.class, new gfx.a())
      .registerTypeAdapter(gfy.class, new gfy.a())
      .registerTypeAdapter(gga.class, new gga.a())
      .registerTypeAdapter(ggh.class, new ggh.a())
      .registerTypeAdapter(ggi.class, new ggi.a())
      .registerTypeAdapter(ggf.class, new ggf.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gfx> k;
   @Nullable
   private final ggb.b l;
   @Nullable
   private final Boolean m;
   private final ggi n;
   private final List<ggf> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gsq, String>> d;
   @Nullable
   protected ggb e;
   @Nullable
   protected akr f;

   public static ggb a(Reader $$0) {
      return aye.a(a, $$0, ggb.class);
   }

   public static ggb a(String $$0) {
      return a(new StringReader($$0));
   }

   public ggb(@Nullable akr $$0, List<gfx> $$1, Map<String, Either<gsq, String>> $$2, @Nullable Boolean $$3, @Nullable ggb.b $$4, ggi $$5, List<ggf> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gfx> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public ggb.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : ggb.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<ggf> e() {
      return this.o;
   }

   private ggg a(gsr $$0, ggb $$1) {
      return this.o.isEmpty() ? ggg.a : new ggg($$0, $$1, this.o);
   }

   @Override
   public Collection<akr> f() {
      Set<akr> $$0 = Sets.newHashSet();

      for (ggf $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<akr, gsy> $$0) {
      Set<gsy> $$1 = Sets.newLinkedHashSet();

      for (ggb $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gsy $$3 = $$0.apply($$2.f);
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
            $$2.f = gss.m;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof ggb)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (ggb)$$3;
      }

      this.o.forEach($$1x -> {
         gsy $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gsm a(gsr $$0, Function<gsq, gql> $$1, gsv $$2) {
      return this.a($$0, this, $$1, $$2, true);
   }

   public gsm a(gsr $$0, ggb $$1, Function<gsq, gql> $$2, gsv $$3, boolean $$4) {
      gql $$5 = $$2.apply(this.c("particle"));
      if (this.g() == gss.r) {
         return new gsp(this.h(), this.a($$0, $$1), $$5, this.c().a());
      } else {
         gsx.a $$6 = new gsx.a(this, this.a($$0, $$1), $$4).a($$5);

         for (gfx $$7 : this.a()) {
            for (ji $$8 : $$7.c.keySet()) {
               gfy $$9 = $$7.c.get($$8);
               gql $$10 = $$2.apply(this.c($$9.c()));
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

   private static gfw a(gfx $$0, gfy $$1, gql $$2, ji $$3, gsv $$4) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e);
   }

   public boolean b(String $$0) {
      return !gqb.b().equals(this.c($$0).b());
   }

   public gsq c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gsq, String> $$2 = this.d($$0);
         Optional<gsq> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gsq(gqk.e, gqb.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gsq, String> d(String $$0) {
      for (ggb $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gsq, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gsq(gqk.e, gqb.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public ggb g() {
      return this.e == null ? this : this.e.g();
   }

   public ggi h() {
      ggh $$0 = this.a(cun.b);
      ggh $$1 = this.a(cun.c);
      ggh $$2 = this.a(cun.d);
      ggh $$3 = this.a(cun.e);
      ggh $$4 = this.a(cun.f);
      ggh $$5 = this.a(cun.g);
      ggh $$6 = this.a(cun.h);
      ggh $$7 = this.a(cun.i);
      return new ggi($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private ggh a(cun $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<ggb> {
      public ggb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gfx> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gsq, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         ggi $$8 = ggi.a;
         if ($$3.has("display")) {
            JsonObject $$9 = aye.u($$3, "display");
            $$8 = (ggi)$$2.deserialize($$9, ggi.class);
         }

         List<ggf> $$10 = this.a($$2, $$3);
         ggb.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = ggb.b.a(aye.i($$3, "gui_light"));
         }

         akr $$12 = $$5.isEmpty() ? null : akr.a($$5);
         return new ggb($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<ggf> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<ggf> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : aye.v($$1, "overrides")) {
               $$2.add((ggf)$$0.deserialize($$4, ggf.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gsq, String>> b(JsonObject $$0) {
         akr $$1 = gqk.e;
         Map<String, Either<gsq, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = aye.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gsq, String> a(akr $$0, String $$1) {
         if (ggb.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            akr $$2 = akr.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gsq($$0, $$2));
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

      protected List<gfx> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gfx> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : aye.v($$1, "elements")) {
               $$2.add((gfx)$$0.deserialize($$3, gfx.class));
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

      public static ggb.b a(String $$0) {
         for (ggb.b $$1 : values()) {
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
