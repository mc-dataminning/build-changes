import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class goc {
   static final Map<String, goc> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<goc> a = Codec.STRING.comapFlatMap($$0 -> {
      goc $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, goc::a);
   private static final List<goe<?>> i = List.of(goe.a, goe.b, goe.c, goe.d, goe.e, goe.f, goe.g, goe.h, goe.m, goe.l);
   private static final List<goe<?>> j = Stream.concat(i.stream(), Stream.of(goe.i, goe.j, goe.k)).toList();
   public static final goc b = a("world_loaded", "WorldLoaded").a(j).a(goe.n).a(goe.o).b();
   public static final goc c = a("performance_metrics", "PerformanceMetrics").a(j).a(goe.r).a(goe.s).a(goe.t).a(goe.u).a(goe.v).a(goe.w).a().b();
   public static final goc d = a("world_load_times", "WorldLoadTimes").a(j).a(goe.x).a(goe.y).a().b();
   public static final goc e = a("world_unloaded", "WorldUnloaded").a(j).a(goe.p).a(goe.q).b();
   public static final goc f = a("advancement_made", "AdvancementMade").a(j).a(goe.D).a(goe.E).a().b();
   public static final goc g = a("game_load_times", "GameLoadTimes").a(i).a(goe.z).a(goe.A).a(goe.B).a(goe.C).a().b();
   private final String k;
   private final String l;
   private final List<goe<?>> m;
   private final boolean n;
   private final Codec<gny> o;

   goc(String $$0, String $$1, List<goe<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gof.a($$2).xmap($$0x -> new gny(this, $$0x), gny::b);
   }

   public static goc.a a(String $$0, String $$1) {
      return new goc.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<goe<?>> b() {
      return this.m;
   }

   public Codec<gny> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gof $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (goe<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(goe<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public wi e() {
      return this.a("title");
   }

   public wi f() {
      return this.a("description");
   }

   private wi a(String $$0) {
      return vu.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<goc> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<goe<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public goc.a a(List<goe<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> goc.a a(goe<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public goc.a a() {
         this.d = true;
         return this;
      }

      public goc b() {
         goc $$0 = new goc(this.a, this.b, List.copyOf(this.c), this.d);
         if (goc.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
