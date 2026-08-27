import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gdp {
   static final Map<String, gdp> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gdp> a = Codec.STRING.comapFlatMap($$0 -> {
      gdp $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gdp::a);
   private static final List<gdr<?>> i = List.of(gdr.a, gdr.b, gdr.c, gdr.d, gdr.e, gdr.f, gdr.g, gdr.h, gdr.m, gdr.l);
   private static final List<gdr<?>> j = Stream.concat(i.stream(), Stream.of(gdr.i, gdr.j, gdr.k)).toList();
   public static final gdp b = a("world_loaded", "WorldLoaded").a(j).a(gdr.n).a(gdr.o).b();
   public static final gdp c = a("performance_metrics", "PerformanceMetrics").a(j).a(gdr.r).a(gdr.s).a(gdr.t).a(gdr.u).a(gdr.v).a(gdr.w).a().b();
   public static final gdp d = a("world_load_times", "WorldLoadTimes").a(j).a(gdr.x).a(gdr.y).a().b();
   public static final gdp e = a("world_unloaded", "WorldUnloaded").a(j).a(gdr.p).a(gdr.q).b();
   public static final gdp f = a("advancement_made", "AdvancementMade").a(j).a(gdr.D).a(gdr.E).a().b();
   public static final gdp g = a("game_load_times", "GameLoadTimes").a(i).a(gdr.z).a(gdr.A).a(gdr.B).a(gdr.C).a().b();
   private final String k;
   private final String l;
   private final List<gdr<?>> m;
   private final boolean n;
   private final Codec<gdl> o;

   gdp(String $$0, String $$1, List<gdr<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gds.a($$2).xmap($$0x -> new gdl(this, $$0x), gdl::b);
   }

   public static gdp.a a(String $$0, String $$1) {
      return new gdp.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gdr<?>> b() {
      return this.m;
   }

   public Codec<gdl> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gds $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gdr<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gdr<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public ts e() {
      return this.a("title");
   }

   public ts f() {
      return this.a("description");
   }

   private ts a(String $$0) {
      return tf.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gdp> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gdr<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gdp.a a(List<gdr<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gdp.a a(gdr<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gdp.a a() {
         this.d = true;
         return this;
      }

      public gdp b() {
         gdp $$0 = new gdp(this.a, this.b, List.copyOf(this.c), this.d);
         if (gdp.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
