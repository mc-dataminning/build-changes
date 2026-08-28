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

public class hqo {
   static final Map<String, hqo> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hqo> a = Codec.STRING.comapFlatMap($$0 -> {
      hqo $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hqo::a);
   private static final List<hqq<?>> i = List.of(hqq.a, hqq.b, hqq.c, hqq.d, hqq.e, hqq.f, hqq.g, hqq.h, hqq.m, hqq.l);
   private static final List<hqq<?>> j = Stream.concat(i.stream(), Stream.of(hqq.i, hqq.j, hqq.k)).toList();
   public static final hqo b = a("world_loaded", "WorldLoaded").a(j).a(hqq.n).a(hqq.o).b();
   public static final hqo c = a("performance_metrics", "PerformanceMetrics").a(j).a(hqq.r).a(hqq.s).a(hqq.t).a(hqq.u).a(hqq.v).a(hqq.w).a().b();
   public static final hqo d = a("world_load_times", "WorldLoadTimes").a(j).a(hqq.x).a(hqq.y).a().b();
   public static final hqo e = a("world_unloaded", "WorldUnloaded").a(j).a(hqq.p).a(hqq.q).b();
   public static final hqo f = a("advancement_made", "AdvancementMade").a(j).a(hqq.D).a(hqq.E).a().b();
   public static final hqo g = a("game_load_times", "GameLoadTimes").a(i).a(hqq.z).a(hqq.A).a(hqq.B).a(hqq.C).a().b();
   private final String k;
   private final String l;
   private final List<hqq<?>> m;
   private final boolean n;
   private final MapCodec<hqk> o;

   hqo(String $$0, String $$1, List<hqq<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hqr.a($$2).xmap($$0x -> new hqk(this, $$0x), hqk::b);
   }

   public static hqo.a a(String $$0, String $$1) {
      return new hqo.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hqq<?>> b() {
      return this.m;
   }

   public MapCodec<hqk> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hqr $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hqq<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hqq<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xq e() {
      return this.a("title");
   }

   public xq f() {
      return this.a("description");
   }

   private xq a(String $$0) {
      return xc.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hqo> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hqq<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hqo.a a(List<hqq<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hqo.a a(hqq<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hqo.a a() {
         this.d = true;
         return this;
      }

      public hqo b() {
         hqo $$0 = new hqo(this.a, this.b, List.copyOf(this.c), this.d);
         if (hqo.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
