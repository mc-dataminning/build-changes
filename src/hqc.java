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

public class hqc {
   static final Map<String, hqc> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hqc> a = Codec.STRING.comapFlatMap($$0 -> {
      hqc $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hqc::a);
   private static final List<hqe<?>> i = List.of(hqe.a, hqe.b, hqe.c, hqe.d, hqe.e, hqe.f, hqe.g, hqe.h, hqe.m, hqe.l);
   private static final List<hqe<?>> j = Stream.concat(i.stream(), Stream.of(hqe.i, hqe.j, hqe.k)).toList();
   public static final hqc b = a("world_loaded", "WorldLoaded").a(j).a(hqe.n).a(hqe.o).b();
   public static final hqc c = a("performance_metrics", "PerformanceMetrics").a(j).a(hqe.r).a(hqe.s).a(hqe.t).a(hqe.u).a(hqe.v).a(hqe.w).a().b();
   public static final hqc d = a("world_load_times", "WorldLoadTimes").a(j).a(hqe.x).a(hqe.y).a().b();
   public static final hqc e = a("world_unloaded", "WorldUnloaded").a(j).a(hqe.p).a(hqe.q).b();
   public static final hqc f = a("advancement_made", "AdvancementMade").a(j).a(hqe.D).a(hqe.E).a().b();
   public static final hqc g = a("game_load_times", "GameLoadTimes").a(i).a(hqe.z).a(hqe.A).a(hqe.B).a(hqe.C).a().b();
   private final String k;
   private final String l;
   private final List<hqe<?>> m;
   private final boolean n;
   private final MapCodec<hpy> o;

   hqc(String $$0, String $$1, List<hqe<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hqf.a($$2).xmap($$0x -> new hpy(this, $$0x), hpy::b);
   }

   public static hqc.a a(String $$0, String $$1) {
      return new hqc.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hqe<?>> b() {
      return this.m;
   }

   public MapCodec<hpy> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hqf $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hqe<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hqe<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xu e() {
      return this.a("title");
   }

   public xu f() {
      return this.a("description");
   }

   private xu a(String $$0) {
      return xg.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hqc> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hqe<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hqc.a a(List<hqe<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hqc.a a(hqe<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hqc.a a() {
         this.d = true;
         return this;
      }

      public hqc b() {
         hqc $$0 = new hqc(this.a, this.b, List.copyOf(this.c), this.d);
         if (hqc.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
