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

public class hme {
   static final Map<String, hme> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hme> a = Codec.STRING.comapFlatMap($$0 -> {
      hme $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hme::a);
   private static final List<hmg<?>> i = List.of(hmg.a, hmg.b, hmg.c, hmg.d, hmg.e, hmg.f, hmg.g, hmg.h, hmg.m, hmg.l);
   private static final List<hmg<?>> j = Stream.concat(i.stream(), Stream.of(hmg.i, hmg.j, hmg.k)).toList();
   public static final hme b = a("world_loaded", "WorldLoaded").a(j).a(hmg.n).a(hmg.o).b();
   public static final hme c = a("performance_metrics", "PerformanceMetrics").a(j).a(hmg.r).a(hmg.s).a(hmg.t).a(hmg.u).a(hmg.v).a(hmg.w).a().b();
   public static final hme d = a("world_load_times", "WorldLoadTimes").a(j).a(hmg.x).a(hmg.y).a().b();
   public static final hme e = a("world_unloaded", "WorldUnloaded").a(j).a(hmg.p).a(hmg.q).b();
   public static final hme f = a("advancement_made", "AdvancementMade").a(j).a(hmg.D).a(hmg.E).a().b();
   public static final hme g = a("game_load_times", "GameLoadTimes").a(i).a(hmg.z).a(hmg.A).a(hmg.B).a(hmg.C).a().b();
   private final String k;
   private final String l;
   private final List<hmg<?>> m;
   private final boolean n;
   private final MapCodec<hma> o;

   hme(String $$0, String $$1, List<hmg<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hmh.a($$2).xmap($$0x -> new hma(this, $$0x), hma::b);
   }

   public static hme.a a(String $$0, String $$1) {
      return new hme.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hmg<?>> b() {
      return this.m;
   }

   public MapCodec<hma> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hmh $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hmg<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hmg<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xj e() {
      return this.a("title");
   }

   public xj f() {
      return this.a("description");
   }

   private xj a(String $$0) {
      return wv.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hme> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hmg<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hme.a a(List<hmg<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hme.a a(hmg<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hme.a a() {
         this.d = true;
         return this;
      }

      public hme b() {
         hme $$0 = new hme(this.a, this.b, List.copyOf(this.c), this.d);
         if (hme.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
