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

public class hco {
   static final Map<String, hco> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hco> a = Codec.STRING.comapFlatMap($$0 -> {
      hco $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hco::a);
   private static final List<hcq<?>> i = List.of(hcq.a, hcq.b, hcq.c, hcq.d, hcq.e, hcq.f, hcq.g, hcq.h, hcq.m, hcq.l);
   private static final List<hcq<?>> j = Stream.concat(i.stream(), Stream.of(hcq.i, hcq.j, hcq.k)).toList();
   public static final hco b = a("world_loaded", "WorldLoaded").a(j).a(hcq.n).a(hcq.o).b();
   public static final hco c = a("performance_metrics", "PerformanceMetrics").a(j).a(hcq.r).a(hcq.s).a(hcq.t).a(hcq.u).a(hcq.v).a(hcq.w).a().b();
   public static final hco d = a("world_load_times", "WorldLoadTimes").a(j).a(hcq.x).a(hcq.y).a().b();
   public static final hco e = a("world_unloaded", "WorldUnloaded").a(j).a(hcq.p).a(hcq.q).b();
   public static final hco f = a("advancement_made", "AdvancementMade").a(j).a(hcq.D).a(hcq.E).a().b();
   public static final hco g = a("game_load_times", "GameLoadTimes").a(i).a(hcq.z).a(hcq.A).a(hcq.B).a(hcq.C).a().b();
   private final String k;
   private final String l;
   private final List<hcq<?>> m;
   private final boolean n;
   private final MapCodec<hck> o;

   hco(String $$0, String $$1, List<hcq<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hcr.a($$2).xmap($$0x -> new hck(this, $$0x), hck::b);
   }

   public static hco.a a(String $$0, String $$1) {
      return new hco.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hcq<?>> b() {
      return this.m;
   }

   public MapCodec<hck> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hcr $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hcq<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hcq<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xs e() {
      return this.a("title");
   }

   public xs f() {
      return this.a("description");
   }

   private xs a(String $$0) {
      return xe.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hco> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hcq<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hco.a a(List<hcq<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hco.a a(hcq<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hco.a a() {
         this.d = true;
         return this;
      }

      public hco b() {
         hco $$0 = new hco(this.a, this.b, List.copyOf(this.c), this.d);
         if (hco.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
