import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gnz {
   static final Map<String, gnz> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gnz> a = Codec.STRING.comapFlatMap($$0 -> {
      gnz $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gnz::a);
   private static final List<gob<?>> i = List.of(gob.a, gob.b, gob.c, gob.d, gob.e, gob.f, gob.g, gob.h, gob.m, gob.l);
   private static final List<gob<?>> j = Stream.concat(i.stream(), Stream.of(gob.i, gob.j, gob.k)).toList();
   public static final gnz b = a("world_loaded", "WorldLoaded").a(j).a(gob.n).a(gob.o).b();
   public static final gnz c = a("performance_metrics", "PerformanceMetrics").a(j).a(gob.r).a(gob.s).a(gob.t).a(gob.u).a(gob.v).a(gob.w).a().b();
   public static final gnz d = a("world_load_times", "WorldLoadTimes").a(j).a(gob.x).a(gob.y).a().b();
   public static final gnz e = a("world_unloaded", "WorldUnloaded").a(j).a(gob.p).a(gob.q).b();
   public static final gnz f = a("advancement_made", "AdvancementMade").a(j).a(gob.D).a(gob.E).a().b();
   public static final gnz g = a("game_load_times", "GameLoadTimes").a(i).a(gob.z).a(gob.A).a(gob.B).a(gob.C).a().b();
   private final String k;
   private final String l;
   private final List<gob<?>> m;
   private final boolean n;
   private final Codec<gnv> o;

   gnz(String $$0, String $$1, List<gob<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = goc.a($$2).xmap($$0x -> new gnv(this, $$0x), gnv::b);
   }

   public static gnz.a a(String $$0, String $$1) {
      return new gnz.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gob<?>> b() {
      return this.m;
   }

   public Codec<gnv> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, goc $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gob<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gob<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public wi e() {
      return this.a("title");
   }

   public wi f() {
      return this.a("description");
   }

   private wi a(String $$0) {
      return vu.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gnz> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gob<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gnz.a a(List<gob<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gnz.a a(gob<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gnz.a a() {
         this.d = true;
         return this;
      }

      public gnz b() {
         gnz $$0 = new gnz(this.a, this.b, List.copyOf(this.c), this.d);
         if (gnz.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
