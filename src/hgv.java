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

public class hgv {
   static final Map<String, hgv> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hgv> a = Codec.STRING.comapFlatMap($$0 -> {
      hgv $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hgv::a);
   private static final List<hgx<?>> i = List.of(hgx.a, hgx.b, hgx.c, hgx.d, hgx.e, hgx.f, hgx.g, hgx.h, hgx.m, hgx.l);
   private static final List<hgx<?>> j = Stream.concat(i.stream(), Stream.of(hgx.i, hgx.j, hgx.k)).toList();
   public static final hgv b = a("world_loaded", "WorldLoaded").a(j).a(hgx.n).a(hgx.o).b();
   public static final hgv c = a("performance_metrics", "PerformanceMetrics").a(j).a(hgx.r).a(hgx.s).a(hgx.t).a(hgx.u).a(hgx.v).a(hgx.w).a().b();
   public static final hgv d = a("world_load_times", "WorldLoadTimes").a(j).a(hgx.x).a(hgx.y).a().b();
   public static final hgv e = a("world_unloaded", "WorldUnloaded").a(j).a(hgx.p).a(hgx.q).b();
   public static final hgv f = a("advancement_made", "AdvancementMade").a(j).a(hgx.D).a(hgx.E).a().b();
   public static final hgv g = a("game_load_times", "GameLoadTimes").a(i).a(hgx.z).a(hgx.A).a(hgx.B).a(hgx.C).a().b();
   private final String k;
   private final String l;
   private final List<hgx<?>> m;
   private final boolean n;
   private final MapCodec<hgr> o;

   hgv(String $$0, String $$1, List<hgx<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hgy.a($$2).xmap($$0x -> new hgr(this, $$0x), hgr::b);
   }

   public static hgv.a a(String $$0, String $$1) {
      return new hgv.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hgx<?>> b() {
      return this.m;
   }

   public MapCodec<hgr> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hgy $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hgx<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hgx<T> $$0) {
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

   public static List<hgv> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hgx<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hgv.a a(List<hgx<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hgv.a a(hgx<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hgv.a a() {
         this.d = true;
         return this;
      }

      public hgv b() {
         hgv $$0 = new hgv(this.a, this.b, List.copyOf(this.c), this.d);
         if (hgv.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
