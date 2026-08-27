import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gdz {
   static final Map<String, gdz> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gdz> a = Codec.STRING.comapFlatMap($$0 -> {
      gdz $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gdz::a);
   private static final List<geb<?>> i = List.of(geb.a, geb.b, geb.c, geb.d, geb.e, geb.f, geb.g, geb.h, geb.m, geb.l);
   private static final List<geb<?>> j = Stream.concat(i.stream(), Stream.of(geb.i, geb.j, geb.k)).toList();
   public static final gdz b = a("world_loaded", "WorldLoaded").a(j).a(geb.n).a(geb.o).b();
   public static final gdz c = a("performance_metrics", "PerformanceMetrics").a(j).a(geb.r).a(geb.s).a(geb.t).a(geb.u).a(geb.v).a(geb.w).a().b();
   public static final gdz d = a("world_load_times", "WorldLoadTimes").a(j).a(geb.x).a(geb.y).a().b();
   public static final gdz e = a("world_unloaded", "WorldUnloaded").a(j).a(geb.p).a(geb.q).b();
   public static final gdz f = a("advancement_made", "AdvancementMade").a(j).a(geb.D).a(geb.E).a().b();
   public static final gdz g = a("game_load_times", "GameLoadTimes").a(i).a(geb.z).a(geb.A).a(geb.B).a(geb.C).a().b();
   private final String k;
   private final String l;
   private final List<geb<?>> m;
   private final boolean n;
   private final Codec<gdv> o;

   gdz(String $$0, String $$1, List<geb<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gec.a($$2).xmap($$0x -> new gdv(this, $$0x), gdv::b);
   }

   public static gdz.a a(String $$0, String $$1) {
      return new gdz.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<geb<?>> b() {
      return this.m;
   }

   public Codec<gdv> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gec $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (geb<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(geb<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public tz e() {
      return this.a("title");
   }

   public tz f() {
      return this.a("description");
   }

   private tz a(String $$0) {
      return tm.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gdz> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<geb<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gdz.a a(List<geb<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gdz.a a(geb<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gdz.a a() {
         this.d = true;
         return this;
      }

      public gdz b() {
         gdz $$0 = new gdz(this.a, this.b, List.copyOf(this.c), this.d);
         if (gdz.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
