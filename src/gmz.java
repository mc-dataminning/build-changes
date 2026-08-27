import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gmz {
   static final Map<String, gmz> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gmz> a = Codec.STRING.comapFlatMap($$0 -> {
      gmz $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gmz::a);
   private static final List<gnb<?>> i = List.of(gnb.a, gnb.b, gnb.c, gnb.d, gnb.e, gnb.f, gnb.g, gnb.h, gnb.m, gnb.l);
   private static final List<gnb<?>> j = Stream.concat(i.stream(), Stream.of(gnb.i, gnb.j, gnb.k)).toList();
   public static final gmz b = a("world_loaded", "WorldLoaded").a(j).a(gnb.n).a(gnb.o).b();
   public static final gmz c = a("performance_metrics", "PerformanceMetrics").a(j).a(gnb.r).a(gnb.s).a(gnb.t).a(gnb.u).a(gnb.v).a(gnb.w).a().b();
   public static final gmz d = a("world_load_times", "WorldLoadTimes").a(j).a(gnb.x).a(gnb.y).a().b();
   public static final gmz e = a("world_unloaded", "WorldUnloaded").a(j).a(gnb.p).a(gnb.q).b();
   public static final gmz f = a("advancement_made", "AdvancementMade").a(j).a(gnb.D).a(gnb.E).a().b();
   public static final gmz g = a("game_load_times", "GameLoadTimes").a(i).a(gnb.z).a(gnb.A).a(gnb.B).a(gnb.C).a().b();
   private final String k;
   private final String l;
   private final List<gnb<?>> m;
   private final boolean n;
   private final Codec<gmv> o;

   gmz(String $$0, String $$1, List<gnb<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gnc.a($$2).xmap($$0x -> new gmv(this, $$0x), gmv::b);
   }

   public static gmz.a a(String $$0, String $$1) {
      return new gmz.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gnb<?>> b() {
      return this.m;
   }

   public Codec<gmv> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gnc $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gnb<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gnb<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public wg e() {
      return this.a("title");
   }

   public wg f() {
      return this.a("description");
   }

   private wg a(String $$0) {
      return vs.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gmz> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gnb<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gmz.a a(List<gnb<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gmz.a a(gnb<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gmz.a a() {
         this.d = true;
         return this;
      }

      public gmz b() {
         gmz $$0 = new gmz(this.a, this.b, List.copyOf(this.c), this.d);
         if (gmz.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
