import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gqj {
   static final Map<String, gqj> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gqj> a = Codec.STRING.comapFlatMap($$0 -> {
      gqj $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gqj::a);
   private static final List<gql<?>> i = List.of(gql.a, gql.b, gql.c, gql.d, gql.e, gql.f, gql.g, gql.h, gql.m, gql.l);
   private static final List<gql<?>> j = Stream.concat(i.stream(), Stream.of(gql.i, gql.j, gql.k)).toList();
   public static final gqj b = a("world_loaded", "WorldLoaded").a(j).a(gql.n).a(gql.o).b();
   public static final gqj c = a("performance_metrics", "PerformanceMetrics").a(j).a(gql.r).a(gql.s).a(gql.t).a(gql.u).a(gql.v).a(gql.w).a().b();
   public static final gqj d = a("world_load_times", "WorldLoadTimes").a(j).a(gql.x).a(gql.y).a().b();
   public static final gqj e = a("world_unloaded", "WorldUnloaded").a(j).a(gql.p).a(gql.q).b();
   public static final gqj f = a("advancement_made", "AdvancementMade").a(j).a(gql.D).a(gql.E).a().b();
   public static final gqj g = a("game_load_times", "GameLoadTimes").a(i).a(gql.z).a(gql.A).a(gql.B).a(gql.C).a().b();
   private final String k;
   private final String l;
   private final List<gql<?>> m;
   private final boolean n;
   private final Codec<gqf> o;

   gqj(String $$0, String $$1, List<gql<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gqm.a($$2).xmap($$0x -> new gqf(this, $$0x), gqf::b);
   }

   public static gqj.a a(String $$0, String $$1) {
      return new gqj.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gql<?>> b() {
      return this.m;
   }

   public Codec<gqf> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gqm $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gql<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gql<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public wu e() {
      return this.a("title");
   }

   public wu f() {
      return this.a("description");
   }

   private wu a(String $$0) {
      return wg.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gqj> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gql<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gqj.a a(List<gql<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gqj.a a(gql<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gqj.a a() {
         this.d = true;
         return this;
      }

      public gqj b() {
         gqj $$0 = new gqj(this.a, this.b, List.copyOf(this.c), this.d);
         if (gqj.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
