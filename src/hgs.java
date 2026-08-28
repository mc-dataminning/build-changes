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

public class hgs {
   static final Map<String, hgs> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hgs> a = Codec.STRING.comapFlatMap($$0 -> {
      hgs $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hgs::a);
   private static final List<hgu<?>> i = List.of(hgu.a, hgu.b, hgu.c, hgu.d, hgu.e, hgu.f, hgu.g, hgu.h, hgu.m, hgu.l);
   private static final List<hgu<?>> j = Stream.concat(i.stream(), Stream.of(hgu.i, hgu.j, hgu.k)).toList();
   public static final hgs b = a("world_loaded", "WorldLoaded").a(j).a(hgu.n).a(hgu.o).b();
   public static final hgs c = a("performance_metrics", "PerformanceMetrics").a(j).a(hgu.r).a(hgu.s).a(hgu.t).a(hgu.u).a(hgu.v).a(hgu.w).a().b();
   public static final hgs d = a("world_load_times", "WorldLoadTimes").a(j).a(hgu.x).a(hgu.y).a().b();
   public static final hgs e = a("world_unloaded", "WorldUnloaded").a(j).a(hgu.p).a(hgu.q).b();
   public static final hgs f = a("advancement_made", "AdvancementMade").a(j).a(hgu.D).a(hgu.E).a().b();
   public static final hgs g = a("game_load_times", "GameLoadTimes").a(i).a(hgu.z).a(hgu.A).a(hgu.B).a(hgu.C).a().b();
   private final String k;
   private final String l;
   private final List<hgu<?>> m;
   private final boolean n;
   private final MapCodec<hgo> o;

   hgs(String $$0, String $$1, List<hgu<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hgv.a($$2).xmap($$0x -> new hgo(this, $$0x), hgo::b);
   }

   public static hgs.a a(String $$0, String $$1) {
      return new hgs.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hgu<?>> b() {
      return this.m;
   }

   public MapCodec<hgo> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hgv $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hgu<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hgu<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xy e() {
      return this.a("title");
   }

   public xy f() {
      return this.a("description");
   }

   private xy a(String $$0) {
      return xk.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hgs> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hgu<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hgs.a a(List<hgu<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hgs.a a(hgu<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hgs.a a() {
         this.d = true;
         return this;
      }

      public hgs b() {
         hgs $$0 = new hgs(this.a, this.b, List.copyOf(this.c), this.d);
         if (hgs.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
