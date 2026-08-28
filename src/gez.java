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

public class gez implements gru {
   private static final Logger g = LogUtils.getLogger();
   private static final gfb h = new gfb();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gez.class, new gez.a())
      .registerTypeAdapter(gev.class, new gev.a())
      .registerTypeAdapter(gew.class, new gew.a())
      .registerTypeAdapter(gey.class, new gey.a())
      .registerTypeAdapter(gff.class, new gff.a())
      .registerTypeAdapter(gfg.class, new gfg.a())
      .registerTypeAdapter(gfd.class, new gfd.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gev> k;
   @Nullable
   private final gez.b l;
   @Nullable
   private final Boolean m;
   private final gfg n;
   private final List<gfd> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<grm, String>> d;
   @Nullable
   protected gez e;
   @Nullable
   protected akk f;

   public static gez a(Reader $$0) {
      return axu.a(a, $$0, gez.class);
   }

   public static gez a(String $$0) {
      return a(new StringReader($$0));
   }

   public gez(@Nullable akk $$0, List<gev> $$1, Map<String, Either<grm, String>> $$2, @Nullable Boolean $$3, @Nullable gez.b $$4, gfg $$5, List<gfd> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gev> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gez.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gez.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gfd> e() {
      return this.o;
   }

   private gfe a(grn $$0, gez $$1) {
      return this.o.isEmpty() ? gfe.a : new gfe($$0, $$1, this.o);
   }

   @Override
   public Collection<akk> f() {
      Set<akk> $$0 = Sets.newHashSet();

      for (gfd $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<akk, gru> $$0) {
      Set<gru> $$1 = Sets.newLinkedHashSet();

      for (gez $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gru $$3 = $$0.apply($$2.f);
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
            $$2.f = gro.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof gez)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (gez)$$3;
      }

      this.o.forEach($$1x -> {
         gru $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public grj a(grn $$0, Function<grm, gpi> $$1, grr $$2, akk $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public grj a(grn $$0, gez $$1, Function<grm, gpi> $$2, grr $$3, akk $$4, boolean $$5) {
      gpi $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gro.s) {
         return new grl(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         grt.a $$7 = new grt.a(this, this.a($$0, $$1), $$5).a($$6);

         for (gev $$8 : this.a()) {
            for (jf $$9 : $$8.c.keySet()) {
               gew $$10 = $$8.c.get($$9);
               gpi $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(jf.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static geu a(gev $$0, gew $$1, gpi $$2, jf $$3, grr $$4, akk $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !goy.b().equals(this.c($$0).b());
   }

   public grm c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<grm, String> $$2 = this.d($$0);
         Optional<grm> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new grm(gph.e, goy.b());
         }

         $$1.add($$0);
      }
   }

   private Either<grm, String> d(String $$0) {
      for (gez $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<grm, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new grm(gph.e, goy.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gez g() {
      return this.e == null ? this : this.e.g();
   }

   public gfg h() {
      gff $$0 = this.a(ctx.b);
      gff $$1 = this.a(ctx.c);
      gff $$2 = this.a(ctx.d);
      gff $$3 = this.a(ctx.e);
      gff $$4 = this.a(ctx.f);
      gff $$5 = this.a(ctx.g);
      gff $$6 = this.a(ctx.h);
      gff $$7 = this.a(ctx.i);
      return new gfg($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gff a(ctx $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gez> {
      public gez a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gev> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<grm, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gfg $$8 = gfg.a;
         if ($$3.has("display")) {
            JsonObject $$9 = axu.u($$3, "display");
            $$8 = (gfg)$$2.deserialize($$9, gfg.class);
         }

         List<gfd> $$10 = this.a($$2, $$3);
         gez.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gez.b.a(axu.i($$3, "gui_light"));
         }

         akk $$12 = $$5.isEmpty() ? null : new akk($$5);
         return new gez($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gfd> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gfd> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : axu.v($$1, "overrides")) {
               $$2.add((gfd)$$0.deserialize($$4, gfd.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<grm, String>> b(JsonObject $$0) {
         akk $$1 = gph.e;
         Map<String, Either<grm, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = axu.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<grm, String> a(akk $$0, String $$1) {
         if (gez.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            akk $$2 = akk.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new grm($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return axu.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? axu.k($$0, "ambientocclusion") : null;
      }

      protected List<gev> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gev> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : axu.v($$1, "elements")) {
               $$2.add((gev)$$0.deserialize($$3, gev.class));
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

      public static gez.b a(String $$0) {
         for (gez.b $$1 : values()) {
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
