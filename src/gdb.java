import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gdb {
   static final Map<String, gdb> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gdb> a = Codec.STRING.comapFlatMap($$0 -> {
      gdb $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gdb::a);
   private static final List<gdd<?>> i = List.of(gdd.a, gdd.b, gdd.c, gdd.d, gdd.e, gdd.f, gdd.g, gdd.h, gdd.m, gdd.l);
   private static final List<gdd<?>> j = Stream.concat(i.stream(), Stream.of(gdd.i, gdd.j, gdd.k)).toList();
   public static final gdb b = a("world_loaded", "WorldLoaded").a(j).a(gdd.n).a(gdd.o).b();
   public static final gdb c = a("performance_metrics", "PerformanceMetrics").a(j).a(gdd.r).a(gdd.s).a(gdd.t).a(gdd.u).a(gdd.v).a(gdd.w).a().b();
   public static final gdb d = a("world_load_times", "WorldLoadTimes").a(j).a(gdd.x).a(gdd.y).a().b();
   public static final gdb e = a("world_unloaded", "WorldUnloaded").a(j).a(gdd.p).a(gdd.q).b();
   public static final gdb f = a("advancement_made", "AdvancementMade").a(j).a(gdd.D).a(gdd.E).a().b();
   public static final gdb g = a("game_load_times", "GameLoadTimes").a(i).a(gdd.z).a(gdd.A).a(gdd.B).a(gdd.C).a().b();
   private final String k;
   private final String l;
   private final List<gdd<?>> m;
   private final boolean n;
   private final Codec<gcx> o;

   gdb(String $$0, String $$1, List<gdd<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gde.a($$2).xmap($$0x -> new gcx(this, $$0x), gcx::b);
   }

   public static gdb.a a(String $$0, String $$1) {
      return new gdb.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gdd<?>> b() {
      return this.m;
   }

   public Codec<gcx> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gde $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gdd<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gdd<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public tr e() {
      return this.a("title");
   }

   public tr f() {
      return this.a("description");
   }

   private tr a(String $$0) {
      return te.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gdb> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gdd<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gdb.a a(List<gdd<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gdb.a a(gdd<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gdb.a a() {
         this.d = true;
         return this;
      }

      public gdb b() {
         gdb $$0 = new gdb(this.a, this.b, List.copyOf(this.c), this.d);
         if (gdb.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
