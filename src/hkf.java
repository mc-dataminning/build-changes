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

public class hkf {
   static final Map<String, hkf> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hkf> a = Codec.STRING.comapFlatMap($$0 -> {
      hkf $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hkf::a);
   private static final List<hkh<?>> i = List.of(hkh.a, hkh.b, hkh.c, hkh.d, hkh.e, hkh.f, hkh.g, hkh.h, hkh.m, hkh.l);
   private static final List<hkh<?>> j = Stream.concat(i.stream(), Stream.of(hkh.i, hkh.j, hkh.k)).toList();
   public static final hkf b = a("world_loaded", "WorldLoaded").a(j).a(hkh.n).a(hkh.o).b();
   public static final hkf c = a("performance_metrics", "PerformanceMetrics").a(j).a(hkh.r).a(hkh.s).a(hkh.t).a(hkh.u).a(hkh.v).a(hkh.w).a().b();
   public static final hkf d = a("world_load_times", "WorldLoadTimes").a(j).a(hkh.x).a(hkh.y).a().b();
   public static final hkf e = a("world_unloaded", "WorldUnloaded").a(j).a(hkh.p).a(hkh.q).b();
   public static final hkf f = a("advancement_made", "AdvancementMade").a(j).a(hkh.D).a(hkh.E).a().b();
   public static final hkf g = a("game_load_times", "GameLoadTimes").a(i).a(hkh.z).a(hkh.A).a(hkh.B).a(hkh.C).a().b();
   private final String k;
   private final String l;
   private final List<hkh<?>> m;
   private final boolean n;
   private final MapCodec<hkb> o;

   hkf(String $$0, String $$1, List<hkh<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hki.a($$2).xmap($$0x -> new hkb(this, $$0x), hkb::b);
   }

   public static hkf.a a(String $$0, String $$1) {
      return new hkf.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hkh<?>> b() {
      return this.m;
   }

   public MapCodec<hkb> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hki $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hkh<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hkh<T> $$0) {
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

   public static List<hkf> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hkh<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hkf.a a(List<hkh<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hkf.a a(hkh<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hkf.a a() {
         this.d = true;
         return this;
      }

      public hkf b() {
         hkf $$0 = new hkf(this.a, this.b, List.copyOf(this.c), this.d);
         if (hkf.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
