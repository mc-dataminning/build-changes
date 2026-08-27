import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gev {
   static final Map<String, gev> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gev> a = Codec.STRING.comapFlatMap($$0 -> {
      gev $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gev::a);
   private static final List<gex<?>> i = List.of(gex.a, gex.b, gex.c, gex.d, gex.e, gex.f, gex.g, gex.h, gex.m, gex.l);
   private static final List<gex<?>> j = Stream.concat(i.stream(), Stream.of(gex.i, gex.j, gex.k)).toList();
   public static final gev b = a("world_loaded", "WorldLoaded").a(j).a(gex.n).a(gex.o).b();
   public static final gev c = a("performance_metrics", "PerformanceMetrics").a(j).a(gex.r).a(gex.s).a(gex.t).a(gex.u).a(gex.v).a(gex.w).a().b();
   public static final gev d = a("world_load_times", "WorldLoadTimes").a(j).a(gex.x).a(gex.y).a().b();
   public static final gev e = a("world_unloaded", "WorldUnloaded").a(j).a(gex.p).a(gex.q).b();
   public static final gev f = a("advancement_made", "AdvancementMade").a(j).a(gex.D).a(gex.E).a().b();
   public static final gev g = a("game_load_times", "GameLoadTimes").a(i).a(gex.z).a(gex.A).a(gex.B).a(gex.C).a().b();
   private final String k;
   private final String l;
   private final List<gex<?>> m;
   private final boolean n;
   private final Codec<ger> o;

   gev(String $$0, String $$1, List<gex<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gey.a($$2).xmap($$0x -> new ger(this, $$0x), ger::b);
   }

   public static gev.a a(String $$0, String $$1) {
      return new gev.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gex<?>> b() {
      return this.m;
   }

   public Codec<ger> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gey $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gex<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gex<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public uw e() {
      return this.a("title");
   }

   public uw f() {
      return this.a("description");
   }

   private uw a(String $$0) {
      return ui.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gev> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gex<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gev.a a(List<gex<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gev.a a(gex<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gev.a a() {
         this.d = true;
         return this;
      }

      public gev b() {
         gev $$0 = new gev(this.a, this.b, List.copyOf(this.c), this.d);
         if (gev.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
