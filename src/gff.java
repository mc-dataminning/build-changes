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

public class gff implements gsa {
   private static final Logger g = LogUtils.getLogger();
   private static final gfh h = new gfh();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gff.class, new gff.a())
      .registerTypeAdapter(gfb.class, new gfb.a())
      .registerTypeAdapter(gfc.class, new gfc.a())
      .registerTypeAdapter(gfe.class, new gfe.a())
      .registerTypeAdapter(gfl.class, new gfl.a())
      .registerTypeAdapter(gfm.class, new gfm.a())
      .registerTypeAdapter(gfj.class, new gfj.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gfb> k;
   @Nullable
   private final gff.b l;
   @Nullable
   private final Boolean m;
   private final gfm n;
   private final List<gfj> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<grs, String>> d;
   @Nullable
   protected gff e;
   @Nullable
   protected akk f;

   public static gff a(Reader $$0) {
      return axw.a(a, $$0, gff.class);
   }

   public static gff a(String $$0) {
      return a(new StringReader($$0));
   }

   public gff(@Nullable akk $$0, List<gfb> $$1, Map<String, Either<grs, String>> $$2, @Nullable Boolean $$3, @Nullable gff.b $$4, gfm $$5, List<gfj> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gfb> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gff.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gff.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gfj> e() {
      return this.o;
   }

   private gfk a(grt $$0, gff $$1) {
      return this.o.isEmpty() ? gfk.a : new gfk($$0, $$1, this.o);
   }

   @Override
   public Collection<akk> f() {
      Set<akk> $$0 = Sets.newHashSet();

      for (gfj $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<akk, gsa> $$0) {
      Set<gsa> $$1 = Sets.newLinkedHashSet();

      for (gff $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gsa $$3 = $$0.apply($$2.f);
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
            $$2.f = gru.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof gff)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (gff)$$3;
      }

      this.o.forEach($$1x -> {
         gsa $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public grp a(grt $$0, Function<grs, gpo> $$1, grx $$2, akk $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public grp a(grt $$0, gff $$1, Function<grs, gpo> $$2, grx $$3, akk $$4, boolean $$5) {
      gpo $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gru.s) {
         return new grr(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         grz.a $$7 = new grz.a(this, this.a($$0, $$1), $$5).a($$6);

         for (gfb $$8 : this.a()) {
            for (jf $$9 : $$8.c.keySet()) {
               gfc $$10 = $$8.c.get($$9);
               gpo $$11 = $$2.apply(this.c($$10.d));
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

   private static gfa a(gfb $$0, gfc $$1, gpo $$2, jf $$3, grx $$4, akk $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gpe.b().equals(this.c($$0).b());
   }

   public grs c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<grs, String> $$2 = this.d($$0);
         Optional<grs> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new grs(gpn.e, gpe.b());
         }

         $$1.add($$0);
      }
   }

   private Either<grs, String> d(String $$0) {
      for (gff $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<grs, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new grs(gpn.e, gpe.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gff g() {
      return this.e == null ? this : this.e.g();
   }

   public gfm h() {
      gfl $$0 = this.a(ctz.b);
      gfl $$1 = this.a(ctz.c);
      gfl $$2 = this.a(ctz.d);
      gfl $$3 = this.a(ctz.e);
      gfl $$4 = this.a(ctz.f);
      gfl $$5 = this.a(ctz.g);
      gfl $$6 = this.a(ctz.h);
      gfl $$7 = this.a(ctz.i);
      return new gfm($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gfl a(ctz $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gff> {
      public gff a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gfb> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<grs, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gfm $$8 = gfm.a;
         if ($$3.has("display")) {
            JsonObject $$9 = axw.u($$3, "display");
            $$8 = (gfm)$$2.deserialize($$9, gfm.class);
         }

         List<gfj> $$10 = this.a($$2, $$3);
         gff.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gff.b.a(axw.i($$3, "gui_light"));
         }

         akk $$12 = $$5.isEmpty() ? null : new akk($$5);
         return new gff($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gfj> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gfj> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : axw.v($$1, "overrides")) {
               $$2.add((gfj)$$0.deserialize($$4, gfj.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<grs, String>> b(JsonObject $$0) {
         akk $$1 = gpn.e;
         Map<String, Either<grs, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = axw.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<grs, String> a(akk $$0, String $$1) {
         if (gff.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            akk $$2 = akk.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new grs($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return axw.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? axw.k($$0, "ambientocclusion") : null;
      }

      protected List<gfb> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gfb> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : axw.v($$1, "elements")) {
               $$2.add((gfb)$$0.deserialize($$3, gfb.class));
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

      public static gff.b a(String $$0) {
         for (gff.b $$1 : values()) {
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
