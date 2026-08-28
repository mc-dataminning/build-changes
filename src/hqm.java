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

public class hqm {
   static final Map<String, hqm> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hqm> a = Codec.STRING.comapFlatMap($$0 -> {
      hqm $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hqm::a);
   private static final List<hqo<?>> i = List.of(hqo.a, hqo.b, hqo.c, hqo.d, hqo.e, hqo.f, hqo.g, hqo.h, hqo.m, hqo.l);
   private static final List<hqo<?>> j = Stream.concat(i.stream(), Stream.of(hqo.i, hqo.j, hqo.k)).toList();
   public static final hqm b = a("world_loaded", "WorldLoaded").a(j).a(hqo.n).a(hqo.o).b();
   public static final hqm c = a("performance_metrics", "PerformanceMetrics").a(j).a(hqo.r).a(hqo.s).a(hqo.t).a(hqo.u).a(hqo.v).a(hqo.w).a().b();
   public static final hqm d = a("world_load_times", "WorldLoadTimes").a(j).a(hqo.x).a(hqo.y).a().b();
   public static final hqm e = a("world_unloaded", "WorldUnloaded").a(j).a(hqo.p).a(hqo.q).b();
   public static final hqm f = a("advancement_made", "AdvancementMade").a(j).a(hqo.D).a(hqo.E).a().b();
   public static final hqm g = a("game_load_times", "GameLoadTimes").a(i).a(hqo.z).a(hqo.A).a(hqo.B).a(hqo.C).a().b();
   private final String k;
   private final String l;
   private final List<hqo<?>> m;
   private final boolean n;
   private final MapCodec<hqi> o;

   hqm(String $$0, String $$1, List<hqo<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hqp.a($$2).xmap($$0x -> new hqi(this, $$0x), hqi::b);
   }

   public static hqm.a a(String $$0, String $$1) {
      return new hqm.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hqo<?>> b() {
      return this.m;
   }

   public MapCodec<hqi> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hqp $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hqo<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hqo<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xo e() {
      return this.a("title");
   }

   public xo f() {
      return this.a("description");
   }

   private xo a(String $$0) {
      return xa.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hqm> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hqo<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hqm.a a(List<hqo<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hqm.a a(hqo<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hqm.a a() {
         this.d = true;
         return this;
      }

      public hqm b() {
         hqm $$0 = new hqm(this.a, this.b, List.copyOf(this.c), this.d);
         if (hqm.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
