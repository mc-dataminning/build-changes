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

public class hdo {
   static final Map<String, hdo> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hdo> a = Codec.STRING.comapFlatMap($$0 -> {
      hdo $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hdo::a);
   private static final List<hdq<?>> i = List.of(hdq.a, hdq.b, hdq.c, hdq.d, hdq.e, hdq.f, hdq.g, hdq.h, hdq.m, hdq.l);
   private static final List<hdq<?>> j = Stream.concat(i.stream(), Stream.of(hdq.i, hdq.j, hdq.k)).toList();
   public static final hdo b = a("world_loaded", "WorldLoaded").a(j).a(hdq.n).a(hdq.o).b();
   public static final hdo c = a("performance_metrics", "PerformanceMetrics").a(j).a(hdq.r).a(hdq.s).a(hdq.t).a(hdq.u).a(hdq.v).a(hdq.w).a().b();
   public static final hdo d = a("world_load_times", "WorldLoadTimes").a(j).a(hdq.x).a(hdq.y).a().b();
   public static final hdo e = a("world_unloaded", "WorldUnloaded").a(j).a(hdq.p).a(hdq.q).b();
   public static final hdo f = a("advancement_made", "AdvancementMade").a(j).a(hdq.D).a(hdq.E).a().b();
   public static final hdo g = a("game_load_times", "GameLoadTimes").a(i).a(hdq.z).a(hdq.A).a(hdq.B).a(hdq.C).a().b();
   private final String k;
   private final String l;
   private final List<hdq<?>> m;
   private final boolean n;
   private final MapCodec<hdk> o;

   hdo(String $$0, String $$1, List<hdq<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hdr.a($$2).xmap($$0x -> new hdk(this, $$0x), hdk::b);
   }

   public static hdo.a a(String $$0, String $$1) {
      return new hdo.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hdq<?>> b() {
      return this.m;
   }

   public MapCodec<hdk> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hdr $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hdq<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hdq<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xw e() {
      return this.a("title");
   }

   public xw f() {
      return this.a("description");
   }

   private xw a(String $$0) {
      return xi.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hdo> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hdq<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hdo.a a(List<hdq<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hdo.a a(hdq<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hdo.a a() {
         this.d = true;
         return this;
      }

      public hdo b() {
         hdo $$0 = new hdo(this.a, this.b, List.copyOf(this.c), this.d);
         if (hdo.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
