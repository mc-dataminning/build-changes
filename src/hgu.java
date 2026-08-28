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

public class hgu {
   static final Map<String, hgu> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hgu> a = Codec.STRING.comapFlatMap($$0 -> {
      hgu $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hgu::a);
   private static final List<hgw<?>> i = List.of(hgw.a, hgw.b, hgw.c, hgw.d, hgw.e, hgw.f, hgw.g, hgw.h, hgw.m, hgw.l);
   private static final List<hgw<?>> j = Stream.concat(i.stream(), Stream.of(hgw.i, hgw.j, hgw.k)).toList();
   public static final hgu b = a("world_loaded", "WorldLoaded").a(j).a(hgw.n).a(hgw.o).b();
   public static final hgu c = a("performance_metrics", "PerformanceMetrics").a(j).a(hgw.r).a(hgw.s).a(hgw.t).a(hgw.u).a(hgw.v).a(hgw.w).a().b();
   public static final hgu d = a("world_load_times", "WorldLoadTimes").a(j).a(hgw.x).a(hgw.y).a().b();
   public static final hgu e = a("world_unloaded", "WorldUnloaded").a(j).a(hgw.p).a(hgw.q).b();
   public static final hgu f = a("advancement_made", "AdvancementMade").a(j).a(hgw.D).a(hgw.E).a().b();
   public static final hgu g = a("game_load_times", "GameLoadTimes").a(i).a(hgw.z).a(hgw.A).a(hgw.B).a(hgw.C).a().b();
   private final String k;
   private final String l;
   private final List<hgw<?>> m;
   private final boolean n;
   private final MapCodec<hgq> o;

   hgu(String $$0, String $$1, List<hgw<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hgx.a($$2).xmap($$0x -> new hgq(this, $$0x), hgq::b);
   }

   public static hgu.a a(String $$0, String $$1) {
      return new hgu.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hgw<?>> b() {
      return this.m;
   }

   public MapCodec<hgq> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hgx $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hgw<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hgw<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public yj e() {
      return this.a("title");
   }

   public yj f() {
      return this.a("description");
   }

   private yj a(String $$0) {
      return xv.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hgu> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hgw<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hgu.a a(List<hgw<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hgu.a a(hgw<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hgu.a a() {
         this.d = true;
         return this;
      }

      public hgu b() {
         hgu $$0 = new hgu(this.a, this.b, List.copyOf(this.c), this.d);
         if (hgu.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
