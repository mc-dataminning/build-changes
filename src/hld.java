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

public class hld {
   static final Map<String, hld> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hld> a = Codec.STRING.comapFlatMap($$0 -> {
      hld $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hld::a);
   private static final List<hlf<?>> i = List.of(hlf.a, hlf.b, hlf.c, hlf.d, hlf.e, hlf.f, hlf.g, hlf.h, hlf.m, hlf.l);
   private static final List<hlf<?>> j = Stream.concat(i.stream(), Stream.of(hlf.i, hlf.j, hlf.k)).toList();
   public static final hld b = a("world_loaded", "WorldLoaded").a(j).a(hlf.n).a(hlf.o).b();
   public static final hld c = a("performance_metrics", "PerformanceMetrics").a(j).a(hlf.r).a(hlf.s).a(hlf.t).a(hlf.u).a(hlf.v).a(hlf.w).a().b();
   public static final hld d = a("world_load_times", "WorldLoadTimes").a(j).a(hlf.x).a(hlf.y).a().b();
   public static final hld e = a("world_unloaded", "WorldUnloaded").a(j).a(hlf.p).a(hlf.q).b();
   public static final hld f = a("advancement_made", "AdvancementMade").a(j).a(hlf.D).a(hlf.E).a().b();
   public static final hld g = a("game_load_times", "GameLoadTimes").a(i).a(hlf.z).a(hlf.A).a(hlf.B).a(hlf.C).a().b();
   private final String k;
   private final String l;
   private final List<hlf<?>> m;
   private final boolean n;
   private final MapCodec<hkz> o;

   hld(String $$0, String $$1, List<hlf<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hlg.a($$2).xmap($$0x -> new hkz(this, $$0x), hkz::b);
   }

   public static hld.a a(String $$0, String $$1) {
      return new hld.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hlf<?>> b() {
      return this.m;
   }

   public MapCodec<hkz> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hlg $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hlf<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hlf<T> $$0) {
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

   public static List<hld> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hlf<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hld.a a(List<hlf<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hld.a a(hlf<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hld.a a() {
         this.d = true;
         return this;
      }

      public hld b() {
         hld $$0 = new hld(this.a, this.b, List.copyOf(this.c), this.d);
         if (hld.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
