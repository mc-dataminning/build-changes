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

public class hpd {
   static final Map<String, hpd> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hpd> a = Codec.STRING.comapFlatMap($$0 -> {
      hpd $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hpd::a);
   private static final List<hpf<?>> i = List.of(hpf.a, hpf.b, hpf.c, hpf.d, hpf.e, hpf.f, hpf.g, hpf.h, hpf.m, hpf.l);
   private static final List<hpf<?>> j = Stream.concat(i.stream(), Stream.of(hpf.i, hpf.j, hpf.k)).toList();
   public static final hpd b = a("world_loaded", "WorldLoaded").a(j).a(hpf.n).a(hpf.o).b();
   public static final hpd c = a("performance_metrics", "PerformanceMetrics").a(j).a(hpf.r).a(hpf.s).a(hpf.t).a(hpf.u).a(hpf.v).a(hpf.w).a().b();
   public static final hpd d = a("world_load_times", "WorldLoadTimes").a(j).a(hpf.x).a(hpf.y).a().b();
   public static final hpd e = a("world_unloaded", "WorldUnloaded").a(j).a(hpf.p).a(hpf.q).b();
   public static final hpd f = a("advancement_made", "AdvancementMade").a(j).a(hpf.D).a(hpf.E).a().b();
   public static final hpd g = a("game_load_times", "GameLoadTimes").a(i).a(hpf.z).a(hpf.A).a(hpf.B).a(hpf.C).a().b();
   private final String k;
   private final String l;
   private final List<hpf<?>> m;
   private final boolean n;
   private final MapCodec<hoz> o;

   hpd(String $$0, String $$1, List<hpf<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hpg.a($$2).xmap($$0x -> new hoz(this, $$0x), hoz::b);
   }

   public static hpd.a a(String $$0, String $$1) {
      return new hpd.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hpf<?>> b() {
      return this.m;
   }

   public MapCodec<hoz> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hpg $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hpf<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hpf<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xm e() {
      return this.a("title");
   }

   public xm f() {
      return this.a("description");
   }

   private xm a(String $$0) {
      return wy.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hpd> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hpf<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hpd.a a(List<hpf<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hpd.a a(hpf<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hpd.a a() {
         this.d = true;
         return this;
      }

      public hpd b() {
         hpd $$0 = new hpd(this.a, this.b, List.copyOf(this.c), this.d);
         if (hpd.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
