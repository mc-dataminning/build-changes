import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class hdd {
   static final Map<String, hdd> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hdd> a = Codec.STRING.comapFlatMap($$0 -> {
      hdd $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hdd::a);
   private static final List<hdf<?>> i = List.of(hdf.a, hdf.b, hdf.c, hdf.d, hdf.e, hdf.f, hdf.g, hdf.h, hdf.m, hdf.l);
   private static final List<hdf<?>> j = Stream.concat(i.stream(), Stream.of(hdf.i, hdf.j, hdf.k)).toList();
   public static final hdd b = a("world_loaded", "WorldLoaded").a(j).a(hdf.n).a(hdf.o).b();
   public static final hdd c = a("performance_metrics", "PerformanceMetrics").a(j).a(hdf.r).a(hdf.s).a(hdf.t).a(hdf.u).a(hdf.v).a(hdf.w).a().b();
   public static final hdd d = a("world_load_times", "WorldLoadTimes").a(j).a(hdf.x).a(hdf.y).a().b();
   public static final hdd e = a("world_unloaded", "WorldUnloaded").a(j).a(hdf.p).a(hdf.q).b();
   public static final hdd f = a("advancement_made", "AdvancementMade").a(j).a(hdf.D).a(hdf.E).a().b();
   public static final hdd g = a("game_load_times", "GameLoadTimes").a(i).a(hdf.z).a(hdf.A).a(hdf.B).a(hdf.C).a().b();
   private final String k;
   private final String l;
   private final List<hdf<?>> m;
   private final boolean n;
   private final MapCodec<hcz> o;

   hdd(String $$0, String $$1, List<hdf<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hdg.a($$2).xmap($$0x -> new hcz(this, $$0x), hcz::b);
   }

   public static hdd.a a(String $$0, String $$1) {
      return new hdd.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hdf<?>> b() {
      return this.m;
   }

   public MapCodec<hcz> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hdg $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hdf<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hdf<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xv e() {
      return this.a("title");
   }

   public xv f() {
      return this.a("description");
   }

   private xv a(String $$0) {
      return xh.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hdd> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hdf<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hdd.a a(List<hdf<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hdd.a a(hdf<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hdd.a a() {
         this.d = true;
         return this;
      }

      public hdd b() {
         hdd $$0 = new hdd(this.a, this.b, List.copyOf(this.c), this.d);
         if (hdd.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
