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

public class hke {
   static final Map<String, hke> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hke> a = Codec.STRING.comapFlatMap($$0 -> {
      hke $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hke::a);
   private static final List<hkg<?>> i = List.of(hkg.a, hkg.b, hkg.c, hkg.d, hkg.e, hkg.f, hkg.g, hkg.h, hkg.m, hkg.l);
   private static final List<hkg<?>> j = Stream.concat(i.stream(), Stream.of(hkg.i, hkg.j, hkg.k)).toList();
   public static final hke b = a("world_loaded", "WorldLoaded").a(j).a(hkg.n).a(hkg.o).b();
   public static final hke c = a("performance_metrics", "PerformanceMetrics").a(j).a(hkg.r).a(hkg.s).a(hkg.t).a(hkg.u).a(hkg.v).a(hkg.w).a().b();
   public static final hke d = a("world_load_times", "WorldLoadTimes").a(j).a(hkg.x).a(hkg.y).a().b();
   public static final hke e = a("world_unloaded", "WorldUnloaded").a(j).a(hkg.p).a(hkg.q).b();
   public static final hke f = a("advancement_made", "AdvancementMade").a(j).a(hkg.D).a(hkg.E).a().b();
   public static final hke g = a("game_load_times", "GameLoadTimes").a(i).a(hkg.z).a(hkg.A).a(hkg.B).a(hkg.C).a().b();
   private final String k;
   private final String l;
   private final List<hkg<?>> m;
   private final boolean n;
   private final MapCodec<hka> o;

   hke(String $$0, String $$1, List<hkg<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hkh.a($$2).xmap($$0x -> new hka(this, $$0x), hka::b);
   }

   public static hke.a a(String $$0, String $$1) {
      return new hke.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hkg<?>> b() {
      return this.m;
   }

   public MapCodec<hka> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hkh $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hkg<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hkg<T> $$0) {
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

   public static List<hke> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hkg<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hke.a a(List<hkg<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hke.a a(hkg<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hke.a a() {
         this.d = true;
         return this;
      }

      public hke b() {
         hke $$0 = new hke(this.a, this.b, List.copyOf(this.c), this.d);
         if (hke.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
