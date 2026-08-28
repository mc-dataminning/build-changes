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

public class hkd {
   static final Map<String, hkd> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hkd> a = Codec.STRING.comapFlatMap($$0 -> {
      hkd $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hkd::a);
   private static final List<hkf<?>> i = List.of(hkf.a, hkf.b, hkf.c, hkf.d, hkf.e, hkf.f, hkf.g, hkf.h, hkf.m, hkf.l);
   private static final List<hkf<?>> j = Stream.concat(i.stream(), Stream.of(hkf.i, hkf.j, hkf.k)).toList();
   public static final hkd b = a("world_loaded", "WorldLoaded").a(j).a(hkf.n).a(hkf.o).b();
   public static final hkd c = a("performance_metrics", "PerformanceMetrics").a(j).a(hkf.r).a(hkf.s).a(hkf.t).a(hkf.u).a(hkf.v).a(hkf.w).a().b();
   public static final hkd d = a("world_load_times", "WorldLoadTimes").a(j).a(hkf.x).a(hkf.y).a().b();
   public static final hkd e = a("world_unloaded", "WorldUnloaded").a(j).a(hkf.p).a(hkf.q).b();
   public static final hkd f = a("advancement_made", "AdvancementMade").a(j).a(hkf.D).a(hkf.E).a().b();
   public static final hkd g = a("game_load_times", "GameLoadTimes").a(i).a(hkf.z).a(hkf.A).a(hkf.B).a(hkf.C).a().b();
   private final String k;
   private final String l;
   private final List<hkf<?>> m;
   private final boolean n;
   private final MapCodec<hjz> o;

   hkd(String $$0, String $$1, List<hkf<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hkg.a($$2).xmap($$0x -> new hjz(this, $$0x), hjz::b);
   }

   public static hkd.a a(String $$0, String $$1) {
      return new hkd.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hkf<?>> b() {
      return this.m;
   }

   public MapCodec<hjz> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hkg $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hkf<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hkf<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xd e() {
      return this.a("title");
   }

   public xd f() {
      return this.a("description");
   }

   private xd a(String $$0) {
      return wp.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hkd> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hkf<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hkd.a a(List<hkf<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hkd.a a(hkf<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hkd.a a() {
         this.d = true;
         return this;
      }

      public hkd b() {
         hkd $$0 = new hkd(this.a, this.b, List.copyOf(this.c), this.d);
         if (hkd.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
