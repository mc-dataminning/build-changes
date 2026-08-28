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

public class hob {
   static final Map<String, hob> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hob> a = Codec.STRING.comapFlatMap($$0 -> {
      hob $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hob::a);
   private static final List<hod<?>> i = List.of(hod.a, hod.b, hod.c, hod.d, hod.e, hod.f, hod.g, hod.h, hod.m, hod.l);
   private static final List<hod<?>> j = Stream.concat(i.stream(), Stream.of(hod.i, hod.j, hod.k)).toList();
   public static final hob b = a("world_loaded", "WorldLoaded").a(j).a(hod.n).a(hod.o).b();
   public static final hob c = a("performance_metrics", "PerformanceMetrics").a(j).a(hod.r).a(hod.s).a(hod.t).a(hod.u).a(hod.v).a(hod.w).a().b();
   public static final hob d = a("world_load_times", "WorldLoadTimes").a(j).a(hod.x).a(hod.y).a().b();
   public static final hob e = a("world_unloaded", "WorldUnloaded").a(j).a(hod.p).a(hod.q).b();
   public static final hob f = a("advancement_made", "AdvancementMade").a(j).a(hod.D).a(hod.E).a().b();
   public static final hob g = a("game_load_times", "GameLoadTimes").a(i).a(hod.z).a(hod.A).a(hod.B).a(hod.C).a().b();
   private final String k;
   private final String l;
   private final List<hod<?>> m;
   private final boolean n;
   private final MapCodec<hnx> o;

   hob(String $$0, String $$1, List<hod<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hoe.a($$2).xmap($$0x -> new hnx(this, $$0x), hnx::b);
   }

   public static hob.a a(String $$0, String $$1) {
      return new hob.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hod<?>> b() {
      return this.m;
   }

   public MapCodec<hnx> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hoe $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hod<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hod<T> $$0) {
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

   public static List<hob> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hod<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hob.a a(List<hod<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hob.a a(hod<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hob.a a() {
         this.d = true;
         return this;
      }

      public hob b() {
         hob $$0 = new hob(this.a, this.b, List.copyOf(this.c), this.d);
         if (hob.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
