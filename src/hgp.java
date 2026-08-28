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

public class hgp {
   static final Map<String, hgp> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hgp> a = Codec.STRING.comapFlatMap($$0 -> {
      hgp $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hgp::a);
   private static final List<hgr<?>> i = List.of(hgr.a, hgr.b, hgr.c, hgr.d, hgr.e, hgr.f, hgr.g, hgr.h, hgr.m, hgr.l);
   private static final List<hgr<?>> j = Stream.concat(i.stream(), Stream.of(hgr.i, hgr.j, hgr.k)).toList();
   public static final hgp b = a("world_loaded", "WorldLoaded").a(j).a(hgr.n).a(hgr.o).b();
   public static final hgp c = a("performance_metrics", "PerformanceMetrics").a(j).a(hgr.r).a(hgr.s).a(hgr.t).a(hgr.u).a(hgr.v).a(hgr.w).a().b();
   public static final hgp d = a("world_load_times", "WorldLoadTimes").a(j).a(hgr.x).a(hgr.y).a().b();
   public static final hgp e = a("world_unloaded", "WorldUnloaded").a(j).a(hgr.p).a(hgr.q).b();
   public static final hgp f = a("advancement_made", "AdvancementMade").a(j).a(hgr.D).a(hgr.E).a().b();
   public static final hgp g = a("game_load_times", "GameLoadTimes").a(i).a(hgr.z).a(hgr.A).a(hgr.B).a(hgr.C).a().b();
   private final String k;
   private final String l;
   private final List<hgr<?>> m;
   private final boolean n;
   private final MapCodec<hgl> o;

   hgp(String $$0, String $$1, List<hgr<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hgs.a($$2).xmap($$0x -> new hgl(this, $$0x), hgl::b);
   }

   public static hgp.a a(String $$0, String $$1) {
      return new hgp.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hgr<?>> b() {
      return this.m;
   }

   public MapCodec<hgl> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hgs $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hgr<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hgr<T> $$0) {
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

   public static List<hgp> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hgr<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hgp.a a(List<hgr<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hgp.a a(hgr<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hgp.a a() {
         this.d = true;
         return this;
      }

      public hgp b() {
         hgp $$0 = new hgp(this.a, this.b, List.copyOf(this.c), this.d);
         if (hgp.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
